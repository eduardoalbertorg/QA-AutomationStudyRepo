package com.qaminds;

import utilities.Combustible;

public class VehiculoBase {
    private Combustible combustible;
    private String modelo;
    private String marca;
    private int wheelNumber;
    private boolean vehicleTurnedOn;

    public VehiculoBase(Combustible combustible) {
        this.combustible = combustible;
    }

    public Combustible getFuel() {
        return this.combustible;
    }

    public boolean startVehicle() {
        if (this.vehicleTurnedOn) {
            return this.vehicleTurnedOn;
        }

        this.vehicleTurnedOn = true;
        return this.vehicleTurnedOn;
    }

    public boolean turnOffVehicle() {
        if (!this.vehicleTurnedOn) {
            return this.vehicleTurnedOn;
        }

        this.vehicleTurnedOn = false;
        return this.vehicleTurnedOn;
    }

    public boolean isVehicleTurnedOn() {
        return this.vehicleTurnedOn;
    }
}
