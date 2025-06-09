package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Sala;
import com.example.cineDiaz.servicesImpl.SalaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/salas")
public class SalaController extends BaseControllerImpl<Sala, SalaServiceImpl> {
}
