package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Funcion;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.FuncionRepository;
import com.example.cineDiaz.services.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionServiceImpl extends BaseServiceImpl<Funcion,Integer> implements FuncionService {
    @Autowired
    private FuncionRepository funcionRepository;

    public FuncionServiceImpl(BaseRepository<Funcion, Integer> baseRepository, FuncionRepository funcionRepository) {
        super(baseRepository);
        this.funcionRepository = funcionRepository;
    }
}
