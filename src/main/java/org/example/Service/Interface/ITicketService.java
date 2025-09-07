package org.example.Service.Interface;

import org.example.Entity.Ticket;
import org.example.Enum.VehicleSizeEnum;

public interface ITicketService {
    void bookTicket(int parkingId, int slotId, int userId, VehicleSizeEnum vehicleSIze);

    Ticket getTicket(int userId, int slotId);

    void releaseParking(int ticketId);
}
