package com.example.cineDiaz.controllers;

import com.example.cineDiaz.dtos.VentaDTO;
import com.example.cineDiaz.entities.*;
import com.example.cineDiaz.services.ClienteService;
import com.example.cineDiaz.servicesImpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/ventas")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl> {

    @Autowired
    private FuncionServiceImpl funcionService;
    @Autowired
    private ClienteServiceImpl clienteService;
    @Autowired
    private PagoServiceImpl pagoService;
    @Autowired
    private CineServiceImpl cineService;

    @PostMapping("/crear")
    public ResponseEntity<?> createVenta(@RequestBody VentaDTO vent){
        try{
            Venta venta = new Venta();

            venta.setFecha(vent.getFecha());

            Pago pago = new Pago();
            pago.setMonto(vent.getMonto());
            pago.setTipo(vent.getTipo());
            pago = pagoService.save(pago);
            venta.setPago(pago);

            Funcion funcion = funcionService.findById(vent.getFuncionId());
            venta.addFuncion(funcion);

            // Obtener todos los clientes y buscar si ya existe
            Cliente cliente = new Cliente(vent.getNombre(),vent.getCorreo());
            venta.addCliente(cliente);

            servicio.save(venta);
            return ResponseEntity.status(HttpStatus.OK).body(venta);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error,por favor intente más tarde.\"}");
        }
    }
}
