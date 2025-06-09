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
public class Empleado extends Base{
    private String nombre;
    private int dni;

    //fetch= FetchType.EAGER,
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name= "empleado_cine", joinColumns= @JoinColumn(name= "empleado_id", referencedColumnName= "id"),
            inverseJoinColumns = @JoinColumn(name= "cine_id", referencedColumnName= "id")
    )
    private List<Cine> cines= new ArrayList();
}
