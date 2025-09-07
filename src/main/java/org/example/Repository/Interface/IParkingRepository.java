package org.example.Repository.Interface;

import org.example.Entity.Slot;

public interface IParkingRepository {
    Slot getSlotById(int id);

    void setSlotBookedStatus(int id, boolean status);
}
