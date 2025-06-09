package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Sala;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.SalaRepository;
import com.example.cineDiaz.services.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServiceImpl extends BaseServiceImpl<Sala, Integer> implements SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public SalaServiceImpl(BaseRepository<Sala, Integer> baseRepository, SalaRepository salaRepository) {
        super(baseRepository);
        this.salaRepository = salaRepository;
    }
}
