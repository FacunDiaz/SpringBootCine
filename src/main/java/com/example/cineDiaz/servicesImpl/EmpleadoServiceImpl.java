package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Empleado;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.EmpleadoRepository;
import com.example.cineDiaz.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Integer> implements EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(BaseRepository<Empleado, Integer> baseRepository, EmpleadoRepository empleadoRepository) {
        super(baseRepository);
        this.empleadoRepository = empleadoRepository;
    }
}
