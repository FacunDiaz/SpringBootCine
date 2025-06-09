package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Pelicula;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.PeliculaRepository;
import com.example.cineDiaz.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula,Integer> implements PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;

    public PeliculaServiceImpl(BaseRepository<Pelicula, Integer> baseRepository, PeliculaRepository peliculaRepository) {
        super(baseRepository);
        this.peliculaRepository = peliculaRepository;
    }
}
