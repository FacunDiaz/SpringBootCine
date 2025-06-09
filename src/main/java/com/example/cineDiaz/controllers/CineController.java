package com.example.cineDiaz.controllers;

import com.example.cineDiaz.dtos.CineDTO;
import com.example.cineDiaz.entities.Cine;
import com.example.cineDiaz.servicesImpl.CineServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/cine")
public class CineController extends BaseControllerImpl<Cine, CineServiceImpl> {

    @GetMapping("/all-cines")
    public ResponseEntity<List<CineDTO>> getAllCines() throws Exception {
        List<Cine> cines = servicio.findAll();
        int cantCines = cines.size();
        List<CineDTO> dtosCine = new ArrayList<>(cantCines);
        for (Cine cine : cines) {
            CineDTO dto = new CineDTO();
            dto.setNombre(cine.getNombre());
            dto.setDireccion(cine.getDireccion());
            dto.setPeliculas(cine.getPeliculas());
            //dto.setCant_empleados(cine.getEmpleados().size());
            //dto.setCant_salas(cine.getSalas().size());
            //dto.setCant_salas_vip(cine.getSalasVIP().size());
            dtosCine.add(dto);
        }
        return ResponseEntity.status(HttpStatus.OK).body(dtosCine);
    }
}
