package com.example.cineDiaz.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Compra extends Base{
    private Date fecha;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // cascadeType hace que si el objeto principal es eliminado, la eliminación se propague a objetos dependientes
    @JoinColumn(name= "id_compra ")
    private List<Insumo> insumos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_compra")
    private List<Proveedor> proveedores= new ArrayList();

    public Compra(Date fecha) {
        this.fecha = fecha;
        this.insumos = new ArrayList<>();
    }

    public Compra() {
        this.insumos = new ArrayList<>();
    }
}
