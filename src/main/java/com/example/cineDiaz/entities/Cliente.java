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
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cliente extends Base{
    private String nombre;
    private String email;
}
