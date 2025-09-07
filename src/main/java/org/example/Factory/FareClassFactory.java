package org.example.Factory;

import org.example.Enum.VehicleSizeEnum;
import org.example.Factory.Interface.IVehicleSize;

public class FareClassFactory {

    public static IVehicleSize fareCalculator(VehicleSizeEnum type)
    {

        switch (type)
        {
            case VehicleSizeEnum.HEAVY:
                return new LargeSizeVehicle();

            case VehicleSizeEnum.LIGHT:
                return new SmallSizeVehicle();

            default:
                throw new IllegalArgumentException("Vehicle type doesn't exist");
        }


    }
}
