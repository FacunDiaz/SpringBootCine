package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Pelicula;
import com.example.cineDiaz.servicesImpl.PeliculaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/peliculas")
public class PeliculaController extends BaseControllerImpl<Pelicula, PeliculaServiceImpl> {
}
