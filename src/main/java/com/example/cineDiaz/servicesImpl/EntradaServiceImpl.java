package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Entrada;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.EntradaRepository;
import com.example.cineDiaz.services.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaServiceImpl extends BaseServiceImpl<Entrada,Integer> implements EntradaService {
    @Autowired
    private EntradaRepository entradaRepository;

    public EntradaServiceImpl(BaseRepository<Entrada, Integer> baseRepository, EntradaRepository entradaRepository) {
        super(baseRepository);
        this.entradaRepository = entradaRepository;
    }
}
