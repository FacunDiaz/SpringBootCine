package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Compra;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.CompraRepository;
import com.example.cineDiaz.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraServiceImpl extends BaseServiceImpl<Compra,Integer> implements CompraService {
    @Autowired
    private CompraRepository compraRepository;

    public CompraServiceImpl(BaseRepository<Compra, Integer> baseRepository, CompraRepository compraRepository) {
        super(baseRepository);
        this.compraRepository = compraRepository;
    }
}
