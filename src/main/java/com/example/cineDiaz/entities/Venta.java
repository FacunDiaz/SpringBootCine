package com.example.cineDiaz.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Venta extends Base{
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_venta")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="id_pago")
    private Pago pago;

    @ManyToMany(fetch= FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name= "venta_cliente", joinColumns= @JoinColumn(name= "id_venta", referencedColumnName= "id"),
            inverseJoinColumns = @JoinColumn(name= "id_cliente", referencedColumnName= "id")
    )
    private List<Cliente> clientes= new ArrayList();

    @ManyToMany(fetch= FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name= "venta_funcion", joinColumns= @JoinColumn(name= "id_venta", referencedColumnName= "id"),
            inverseJoinColumns = @JoinColumn(name= "id_funcion", referencedColumnName= "id")
    )
    private List<Funcion> funciones= new ArrayList();
}
