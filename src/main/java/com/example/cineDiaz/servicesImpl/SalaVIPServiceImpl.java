package com.example.cineDiaz.servicesImpl;

import com.example.cineDiaz.entities.SalaVIP;
import com.example.cineDiaz.repositories.BaseRepository;
import com.example.cineDiaz.repositories.SalaVIPRepository;
import com.example.cineDiaz.services.SalaVIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaVIPServiceImpl extends BaseServiceImpl<SalaVIP, Integer> implements SalaVIPService {
    @Autowired
    private SalaVIPRepository salaVIPRepository;

    public SalaVIPServiceImpl(BaseRepository<SalaVIP, Integer> baseRepository, SalaVIPRepository salaVIPRepository) {
        super(baseRepository);
        this.salaVIPRepository = salaVIPRepository;
    }
}
