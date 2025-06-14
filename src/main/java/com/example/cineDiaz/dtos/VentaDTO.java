package com.example.cineDiaz.dtos;

import com.example.cineDiaz.entities.TipoPago;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.Date;

@Getter
public class VentaDTO {
    public Date fecha;
    //esto me a servir para crear el pago
    public int monto;
    @Enumerated(EnumType.STRING)
    public TipoPago tipo;
    //
    public String nombre;
    public String correo;
    public int funcionId;
}
