package org.example.Dto;

import org.example.Enum.VehicleSizeEnum;

public class ParkingDto {
    public int parkingId;

    public int slotId;

    public int userId;

    public VehicleSizeEnum vehicleSize;

    public ParkingDto(int userId, int parkingId, int slotId, VehicleSizeEnum vehicleSize)
    {
        this.userId = userId;
        this.parkingId = parkingId;
        this.slotId = slotId;
        this.vehicleSize = vehicleSize;
    }
}
