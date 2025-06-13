package com.example.cineDiaz.controllers;

import com.example.cineDiaz.entities.Entrada;
import com.example.cineDiaz.entities.Funcion;
import com.example.cineDiaz.servicesImpl.FuncionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/funciones")
public class FuncionController extends BaseControllerImpl<Funcion, FuncionServiceImpl> {

    @GetMapping("/pelicula/buscar")
    public ResponseEntity<?> getFuncionesPelicula(@RequestParam Integer id){
        try{
            List<Funcion> funciones = servicio.findAll();
            List<Funcion> funcionesPelicula = new ArrayList<>();
            for(Funcion fun: funciones){
                if(id.equals(fun.getPelicula().getId())){
                    funcionesPelicula.add(fun);
                }
            }
            return ResponseEntity.status(HttpStatus.OK).body(funcionesPelicula);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error,por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/pelicula/buscar/entradas")
    public ResponseEntity<?> getEntradasFuncion(@RequestParam Integer id){
        try{
            Funcion funcion = servicio.findById(id);
            List<Entrada> entradas = funcion.getEntradas();
            return ResponseEntity.status(HttpStatus.OK).body(entradas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error,por favor intente más tarde.\"}");
        }
    }
}
