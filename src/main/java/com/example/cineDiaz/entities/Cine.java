package com.example.cineDiaz.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
//@Audited
public class Cine extends Base{

    @Basic
    private String nombre;
    private String direccion;

    //composición
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // cascadeType hace que si el objeto principal es eliminado, la eliminación se propague a objetos dependientes
    @JoinColumn(name= "id_cine")
    private List<Pelicula> peliculas;  //hacer la relación una composición

    //agregación
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private List<Venta> ventas= new ArrayList();

    //agregación
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private List<SalaVIP> salasVIP= new ArrayList();

    //agregación
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private List<Sala> salas= new ArrayList();

    //
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private List<Compra> compras= new ArrayList();

    @ManyToMany(mappedBy= "cines")
    private List<Empleado> empleados= new ArrayList();

    //CONSTRUCTORES

    public Cine() {
        this.peliculas = new ArrayList<>();
    }

    public Cine(String nombre, String direccion, Venta venta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.peliculas = new ArrayList<>();
    }
}
