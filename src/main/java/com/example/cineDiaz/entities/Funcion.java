package com.example.cineDiaz.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Funcion extends Base{
    private String horario;

    @ManyToMany(fetch= FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name= "funcion_entrada", joinColumns= @JoinColumn(name= "id_funcion", referencedColumnName= "id"),
            inverseJoinColumns = @JoinColumn(name= "id_entrada", referencedColumnName= "id")
    )
    private List<Entrada> entradas= new ArrayList();

    @ManyToOne
    @JoinColumn(name="id_pelicula")
    private Pelicula pelicula;
}
