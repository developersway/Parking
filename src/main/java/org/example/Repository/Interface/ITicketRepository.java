package org.example.Repository.Interface;

import org.example.Entity.Ticket;
import org.example.Enum.PaymentStatusEnum;
import org.example.Enum.VehicleSizeEnum;

public interface ITicketRepository {
    void insertTicketRecord(int userId, int parkingId, int slotId, VehicleSizeEnum vehicleSize);

    Ticket getTicketFromList(int userid, int slotId, PaymentStatusEnum status);

    void releaseParkingRecord(int ticketId);
}
