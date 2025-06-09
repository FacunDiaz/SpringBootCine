package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Proveedor;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.ProveedorRepository;
import com.example.cineDiaz.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl extends BaseServiceImpl<Proveedor, Integer> implements ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(BaseRepository<Proveedor, Integer> baseRepository, ProveedorRepository proveedorRepository) {
        super(baseRepository);
        this.proveedorRepository = proveedorRepository;
    }
}
