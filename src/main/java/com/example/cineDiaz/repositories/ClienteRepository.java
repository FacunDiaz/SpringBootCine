package com.example.cineDiaz.repositories;

import com.example.cineDiaz.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Integer> {
}
