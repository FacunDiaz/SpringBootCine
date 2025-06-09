package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Compra;
import com.example.cineDiaz.servicesImpl.CompraServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/compras")
public class CompraController extends BaseControllerImpl<Compra, CompraServiceImpl> {
}
