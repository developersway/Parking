package org.example.Service.Interface;

import org.example.Dto.ParkingDto;

public interface IParkingService {

    void bookParking(ParkingDto parking);

    void releaseParking(int userId, int slotId);
}
