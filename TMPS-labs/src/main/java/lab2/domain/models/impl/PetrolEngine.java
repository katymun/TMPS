package lab2.domain.models.impl;

import lab2.domain.models.intf.Engine;

public class PetrolEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting petrol engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping petrol engine...");
    }
}
