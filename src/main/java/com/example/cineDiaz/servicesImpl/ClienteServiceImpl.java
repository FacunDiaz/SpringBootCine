package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.Cliente;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.ClienteRepository;
import com.example.cineDiaz.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Integer> implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Integer> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }
}
