package org.example.Service;

import org.example.Entity.Ticket;
import org.example.Enum.PaymentStatusEnum;
import org.example.Enum.VehicleSizeEnum;
import org.example.Repository.Interface.ITicketRepository;
import org.example.Service.Interface.ITicketService;

import java.util.Date;

public class TicketService implements ITicketService {
    private final ITicketRepository ticketRepository;

    public TicketService(ITicketRepository ticketRepository)
    {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void bookTicket(int parkingId, int slotId, int userId, VehicleSizeEnum vehicleSize)
    {
        this.ticketRepository.insertTicketRecord(parkingId, slotId, userId, vehicleSize);
    }

    public Ticket getTicket(int userId, int slotId)
    {
        return this.ticketRepository.getTicketFromList(userId, slotId, PaymentStatusEnum.PARKED);
    }

    public void releaseParking(int ticketId)
    {
        this.ticketRepository.releaseParkingRecord(ticketId);
    }
}
