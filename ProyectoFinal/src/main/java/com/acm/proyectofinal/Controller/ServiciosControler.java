package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Servicios;
import com.acm.proyectofinal.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/servicios")
public class ServiciosControler {
    private ServiciosService serviciosService;
    @Autowired
    public ServiciosControler(ServiciosService serviciosService){
        this.serviciosService = serviciosService;
    }
    @PostMapping("/create-servicios")
    public ResponseEntity<Servicios> saveServicios(@RequestBody Servicios servicios){
        Servicios serviciosGuardado  = serviciosService.createServicios(servicios);
        return ResponseEntity.ok(serviciosGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Servicios> findById(@PathVariable int id) {
        Servicios serviciosEncontrado = serviciosService.findById(id);
        if (serviciosEncontrado != null) {
            return ResponseEntity.ok(serviciosEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Servicios> deleteById(@PathVariable int id) {
        Servicios serviciosEliminado = serviciosService.deleteById(id);
        if (serviciosEliminado != null) {
            return ResponseEntity.ok(serviciosEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-servicios")
    public ResponseEntity<Servicios> updateServicios(@RequestBody Servicios servicios) {
        Servicios serviciosActualizado = serviciosService.updateServicios(servicios);
        return ResponseEntity.ok(serviciosActualizado);
    }
}