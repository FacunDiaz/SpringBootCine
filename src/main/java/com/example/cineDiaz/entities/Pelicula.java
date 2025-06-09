package com.example.cineDiaz.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pelicula extends Base implements iPromocion{
    private String titulo;
    private Genero genero;

    @Override
    public float obtenerDescuento() {
        return 20;
    }
}
