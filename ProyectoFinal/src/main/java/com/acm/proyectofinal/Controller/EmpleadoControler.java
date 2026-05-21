package com.acm.proyectofinal.Controller;


import com.acm.proyectofinal.entity.Empleado;
import com.acm.proyectofinal.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/empleado")
public class EmpleadoControler {
    private EmpleadoService empleadoService;
    @Autowired
    public EmpleadoControler(EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }
    @PostMapping("/create-empleado")
    public ResponseEntity<Empleado> saveEmpleado(@RequestBody Empleado empleado){
        Empleado empleadoGuardado  = empleadoService.createEmpleado(empleado);
        return ResponseEntity.ok(empleadoGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Empleado> findById(@PathVariable int id) {
        Empleado empleadoEncontrado = empleadoService.findById(id);
        if (empleadoEncontrado != null) {
            return ResponseEntity.ok(empleadoEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Empleado> deleteById(@PathVariable int id) {
        Empleado empleadoEliminado = empleadoService.deleteById(id);
        if (empleadoEliminado != null) {
            return ResponseEntity.ok(empleadoEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-empleado")
    public ResponseEntity<Empleado> updateCategoria(@RequestBody Empleado empleado) {
        Empleado empleadoActualizado = empleadoService.updateEmpleado(empleado);
        return ResponseEntity.ok(empleadoActualizado);
    }
}
