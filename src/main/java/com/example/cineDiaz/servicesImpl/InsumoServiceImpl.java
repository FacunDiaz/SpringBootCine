package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Insumo;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.InsumoRepository;
import com.example.cineDiaz.services.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsumoServiceImpl extends BaseServiceImpl<Insumo,Integer> implements InsumoService {
    @Autowired
    private InsumoRepository insumoRepository;

    public InsumoServiceImpl(BaseRepository<Insumo, Integer> baseRepository, InsumoRepository insumoRepository) {
        super(baseRepository);
        this.insumoRepository = insumoRepository;
    }
}
