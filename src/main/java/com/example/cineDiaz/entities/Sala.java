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
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Sala extends Base{
    private int numero;
    private int capacidad;

    @ManyToMany(fetch= FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name= "sala_funcion", joinColumns= @JoinColumn(name= "sala_id", referencedColumnName= "id"),
            inverseJoinColumns = @JoinColumn(name= "funcion_id", referencedColumnName= "id")
    )
    private List<Funcion> funciones= new ArrayList();

}
