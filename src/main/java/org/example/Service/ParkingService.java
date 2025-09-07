package org.example.Service;

import org.example.Dto.ParkingDto;
import org.example.Entity.Slot;
import org.example.Entity.Ticket;
import org.example.Factory.FareClassFactory;
import org.example.Repository.Interface.IParkingRepository;
import org.example.Service.Interface.IParkingService;
import org.example.Service.Interface.ITicketService;

public class ParkingService implements IParkingService {

    private final IParkingRepository parkingRepository;
    private final ITicketService ticketService;

    public ParkingService(IParkingRepository parkingRepository, ITicketService ticketService)
    {
        this.parkingRepository = parkingRepository;
        this.ticketService = ticketService;
    }

    @Override
    public void bookParking(ParkingDto parking) {

        //get Slot
        Slot slot = this.parkingRepository.getSlotById(parking.parkingId);
        if(slot.getIsBooked())
        {
            System.out.println("Slot already occupied");
            return;
        }
        this.parkingRepository.setSlotBookedStatus(slot.getId(), true);
        this.ticketService.bookTicket(parking.userId, parking.parkingId, parking.slotId, parking.vehicleSize);
        System.out.println("Parking Booked");
    }

    public void releaseParking(int userId, int slotId)
    {
        Ticket ticket = this.ticketService.getTicket(userId, slotId);
        if(ticket == null)
        {
            System.out.println("No parking found");
            return;
        }

        this.ticketService.releaseParking(ticket.getId());
        this.parkingRepository.setSlotBookedStatus(slotId, false);
        int getFare = FareClassFactory.fareCalculator(ticket.getVehicleSize()).getFare();
        System.out.println("Parking Released. Fare = " + getFare);
    }


}
