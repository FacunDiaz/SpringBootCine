package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Venta;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.VentaRepository;
import com.example.cineDiaz.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta, Integer> implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public VentaServiceImpl(BaseRepository<Venta, Integer> baseRepository, VentaRepository ventaRepository) {
        super(baseRepository);
        this.ventaRepository = ventaRepository;
    }
}
