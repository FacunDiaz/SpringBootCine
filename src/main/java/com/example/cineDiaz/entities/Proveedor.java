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
public class Proveedor extends Base{
    private String nombre;
    private String telefono;
    private String direccion;
}
