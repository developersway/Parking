package org.example.Entity;

import org.example.Enum.PaymentStatusEnum;
import org.example.Enum.VehicleSizeEnum;

import java.util.Date;

public class Ticket {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public VehicleSizeEnum getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSizeEnum vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    private int id;

    private int userId;

    private int slotId;

    private int parkingId;

    private Date entryTime;

    private Date exitTime;

    private int fare;

    private PaymentStatusEnum paymentStatus;

    private VehicleSizeEnum vehicleSize;
}
