package org.example.Repository;

import org.example.Entity.Slot;
import org.example.Repository.Interface.IParkingRepository;

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;
import java.util.*;

public class ParkingRepository implements IParkingRepository {
    private final List<Slot> slotData;

    public ParkingRepository()
    {
        this.slotData = new ArrayList<>();
        Slot slot = new Slot();
        slot.setId(1);
        slot.setIsBooked(false);
        this.slotData.add(slot);
    }

    @Override
    public Slot getSlotById(int id) {
        return this.slotData.stream().filter(slot -> slot.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public void setSlotBookedStatus(int id, boolean status)
    {
        this.slotData.stream().filter(slot -> slot.getId() == id)
                .findFirst().ifPresent(slot -> slot.setIsBooked(status));
    }
}
