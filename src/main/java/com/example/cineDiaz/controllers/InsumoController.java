package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Insumo;
import com.example.cineDiaz.servicesImpl.InsumoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/insumos")
public class InsumoController extends BaseControllerImpl<Insumo, InsumoServiceImpl> {
}
