package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Proveedor;
import com.example.cineDiaz.servicesImpl.ProveedorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/proveedores")
public class ProveedorController extends BaseControllerImpl<Proveedor, ProveedorServiceImpl> {
}
