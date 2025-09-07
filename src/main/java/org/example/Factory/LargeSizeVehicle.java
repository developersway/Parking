package org.example.Factory;

import org.example.Factory.Interface.IVehicleSize;

public class LargeSizeVehicle implements IVehicleSize {

    @Override
    public int getFare()
    {
        return 200;
    }
}
