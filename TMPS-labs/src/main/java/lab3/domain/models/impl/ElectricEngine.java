package lab3.domain.models.impl;

import lab3.domain.models.intf.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping electric engine...");
    }
}
