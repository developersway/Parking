package org.example.Factory;

import org.example.Factory.Interface.IVehicleSize;

public class SmallSizeVehicle implements IVehicleSize {

    @Override
    public int getFare()
    {
        return 100;
    }
}
