package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Cine;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.CineRepository;
import com.example.cineDiaz.services.CineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServiceImpl extends BaseServiceImpl<Cine,Integer> implements CineService {
   @Autowired
   private CineRepository cineRepository;

    public CineServiceImpl(BaseRepository<Cine, Integer> baseRepository, CineRepository cineRepository) {
        super(baseRepository);
        this.cineRepository = cineRepository;
    }
}
