package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Venta;
import com.example.cineDiaz.servicesImpl.VentaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/ventas")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl> {
}
