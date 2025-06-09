package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Cliente;
import com.example.cineDiaz.servicesImpl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {
}
