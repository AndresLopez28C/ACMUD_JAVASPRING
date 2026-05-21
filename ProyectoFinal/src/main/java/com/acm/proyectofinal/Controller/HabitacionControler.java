package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Habitacion;
import com.acm.proyectofinal.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/habitacion")
public class HabitacionControler {
    private HabitacionService habitacionService;
    @Autowired
    public HabitacionControler(HabitacionService habitacionService){
        this.habitacionService = habitacionService;
    }
    @PostMapping("/create-habitacion")
    public ResponseEntity<Habitacion> saveHabitacion(@RequestBody Habitacion habitacion){
        Habitacion habitacionGuardado  = habitacionService.createHabitacion(habitacion);
        return ResponseEntity.ok(habitacionGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Habitacion> findById(@PathVariable int id) {
        Habitacion habitacionEncontrado = habitacionService.findById(id);
        if (habitacionEncontrado != null) {
            return ResponseEntity.ok(habitacionEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Habitacion> deleteById(@PathVariable int id) {
        Habitacion habitacionEliminado = habitacionService.deleteById(id);
        if (habitacionEliminado != null) {
            return ResponseEntity.ok(habitacionEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-habitacion")
    public ResponseEntity<Habitacion> updateHabitacion(@RequestBody Habitacion habitacion) {
        Habitacion habitacionActualizado = habitacionService.updateHabitacion(habitacion);
        return ResponseEntity.ok(habitacionActualizado);
    }
}