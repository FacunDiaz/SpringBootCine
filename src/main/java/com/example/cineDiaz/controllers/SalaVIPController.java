package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.SalaVIP;
import com.example.cineDiaz.servicesImpl.SalaVIPServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/salas-vip")
public class SalaVIPController extends BaseControllerImpl<SalaVIP, SalaVIPServiceImpl> {
}
