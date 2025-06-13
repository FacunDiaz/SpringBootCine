package com.example.cineDiaz.dtos;

import com.example.cineDiaz.entities.TipoPago;
import lombok.Getter;

import java.util.Date;

@Getter
public class VentaDTO {
    public Date fecha;
    //esto me a servir para crear el pago
    public int monto;
    public TipoPago tipo;
    //
    public String nombre;
    public String correo;
    public int funcionId;
}
