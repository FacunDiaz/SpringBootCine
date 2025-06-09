package com.example.cineDiaz.dtos;

import com.example.cineDiaz.entities.Cine;
import com.example.cineDiaz.entities.Empleado;
import com.example.cineDiaz.entities.Pelicula;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class CineDTO {
    private String nombre;
    private String direccion;
    private List<Pelicula> peliculas;
    private int cant_empleados;
    private int cant_salas;
    private int cant_salas_vip;

    public CineDTO() {
    }

    public CineDTO(String nombre, String direccion, List<Pelicula> peliculas, int cant_empleados, int cant_salas, int cant_salas_vip) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.peliculas = peliculas;
        this.cant_empleados = cant_empleados;
        this.cant_salas = cant_salas;
        this.cant_salas_vip = cant_salas_vip;
    }
}
