package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Entrada;
import com.example.cineDiaz.servicesImpl.EntradaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/entradas")
public class EntradaController extends BaseControllerImpl<Entrada, EntradaServiceImpl> {
}
