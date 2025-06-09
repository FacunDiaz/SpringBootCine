package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Pago;
import com.example.cineDiaz.servicesImpl.PagoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/pagos")
public class PagoController extends BaseControllerImpl<Pago, PagoServiceImpl> {
}
