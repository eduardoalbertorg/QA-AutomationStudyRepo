package com.qaminds;

import utilities.TipoPasajeroEnum;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Pasajero implements ITipoPasajero, IDatosPersonalesPasajero {
    Map<Integer, String> tablaPasajeros = new HashMap<>();
    private Integer idPasajero;
    private String nombrePasajero;
    private TipoPasajeroEnum tipoPasajeroEnum;

    public Pasajero() {
        tablaPasajeros.put(1, "Pablo Gutierrez");
        tablaPasajeros.put(5, "Esther Gonzalez");
        tablaPasajeros.put(10, "Martha Debayle");
    }

    @Override
    public String getPasajeroNombre() {
        return this.nombrePasajero;
    }

    @Override
    public void setPasajeroNombre(String pasajeroNombre) {
        this.nombrePasajero = pasajeroNombre;
    }

    @Override
    public TipoPasajeroEnum getTipoPasajero() {
        return this.tipoPasajeroEnum;
    }

    @Override
    public void setTipoPasajero(TipoPasajeroEnum tipoPasajero) {
        this.tipoPasajeroEnum = tipoPasajero;
    }
}
