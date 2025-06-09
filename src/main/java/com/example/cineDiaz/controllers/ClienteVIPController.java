package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.ClienteVIP;
import com.example.cineDiaz.servicesImpl.ClienteVIPServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clientes_vip")
public class ClienteVIPController extends BaseControllerImpl<ClienteVIP, ClienteVIPServiceImpl> {
}
