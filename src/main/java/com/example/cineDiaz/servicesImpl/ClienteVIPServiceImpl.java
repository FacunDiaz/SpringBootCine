package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.ClienteVIP;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.ClienteVIPRepository;
import com.example.cineDiaz.services.ClienteVIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteVIPServiceImpl extends BaseServiceImpl<ClienteVIP,Integer> implements ClienteVIPService {
    @Autowired
    private ClienteVIPRepository clienteVIPRepository;

    public ClienteVIPServiceImpl(BaseRepository<ClienteVIP, Integer> baseRepository, ClienteVIPRepository clienteVIPRepository) {
        super(baseRepository);
        this.clienteVIPRepository = clienteVIPRepository;
    }
}
