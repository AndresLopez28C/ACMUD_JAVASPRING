package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Reserva;
import com.acm.proyectofinal.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/reserva")
public class ReservaControler {
    private ReservaService reservaService;
    @Autowired
    public ReservaControler(ReservaService reservaService){
        this.reservaService = reservaService;
    }
    @PostMapping("/create-reserva")
    public ResponseEntity<Reserva> saveReserva(@RequestBody Reserva reserva){
        Reserva reservaGuardado  = reservaService.createReserva(reserva);
        return ResponseEntity.ok(reservaGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Reserva> findById(@PathVariable int id) {
        Reserva reservaEncontrado = reservaService.findById(id);
        if (reservaEncontrado != null) {
            return ResponseEntity.ok(reservaEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Reserva> deleteById(@PathVariable int id) {
        Reserva reservaEliminado = reservaService.deleteById(id);
        if (reservaEliminado != null) {
            return ResponseEntity.ok(reservaEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-reserva")
    public ResponseEntity<Reserva> updateReserva(@RequestBody Reserva reserva) {
        Reserva reservaActualizado = reservaService.updateReserva(reserva);
        return ResponseEntity.ok(reservaActualizado);
    }
}