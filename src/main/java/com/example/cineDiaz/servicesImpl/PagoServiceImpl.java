package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Pago;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.PagoRepository;
import com.example.cineDiaz.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl extends BaseServiceImpl<Pago,Integer> implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public PagoServiceImpl(BaseRepository<Pago, Integer> baseRepository, PagoRepository pagoRepository) {
        super(baseRepository);
        this.pagoRepository = pagoRepository;
    }
}
