package org.example.Repository;

import org.example.Entity.Ticket;
import org.example.Enum.PaymentStatusEnum;
import org.example.Enum.VehicleSizeEnum;
import org.example.Repository.Interface.ITicketRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketRepository implements ITicketRepository {
    private List<Ticket> ticketList = new ArrayList<>();
    private static TicketRepository instance;

    private TicketRepository()
    {

    }

    public synchronized static TicketRepository getInstance()
    {
        if(instance == null)
        {
            instance = new TicketRepository();
        }
        return instance;
    }

    @Override
    public void insertTicketRecord(int userId, int parkingId, int slotId, VehicleSizeEnum vehicleSize)
    {
        Ticket record = new Ticket();
        record.setId(1);
        record.setParkingId(parkingId);
        record.setSlotId(slotId);
        record.setUserId(userId);
        record.setEntryTime(new Date());
        record.setVehicleSize(vehicleSize);
        record.setPaymentStatus(PaymentStatusEnum.PARKED);

        this.ticketList.add(record);
    }

    public Ticket getTicketFromList(int userid, int slotId, PaymentStatusEnum status)
    {
        return this.ticketList.stream()
                .filter(slot -> slot.getSlotId() == slotId
                        && slot.getUserId() == userid && slot.getPaymentStatus().equals(status))
                .findFirst().orElse(null);
    }

    public void releaseParkingRecord(int ticketId)
    {
        this.ticketList.stream().filter(ticket -> ticket.getId() == ticketId).findFirst()
                .ifPresent(ticket ->
                {ticket.setExitTime(new Date()); ticket.setPaymentStatus(PaymentStatusEnum.COMPLETED);});
    }
}
