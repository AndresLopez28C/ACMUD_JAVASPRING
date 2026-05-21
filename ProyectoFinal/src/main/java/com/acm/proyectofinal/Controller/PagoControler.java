package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Pago;
import com.acm.proyectofinal.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pago")
public class PagoControler {
    private PagoService pagoService;
    @Autowired
    public PagoControler(PagoService pagoService){
        this.pagoService = pagoService;
    }
    @PostMapping("/create-pago")
    public ResponseEntity<Pago> savePago(@RequestBody Pago pago){
        Pago pagoGuardado  = pagoService.createPago(pago);
        return ResponseEntity.ok(pagoGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Pago> findById(@PathVariable int id) {
        Pago pagoEncontrado = pagoService.findById(id);
        if (pagoEncontrado != null) {
            return ResponseEntity.ok(pagoEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Pago> deleteById(@PathVariable int id) {
        Pago pagoEliminado = pagoService.deleteById(id);
        if (pagoEliminado != null) {
            return ResponseEntity.ok(pagoEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-pago")
    public ResponseEntity<Pago> updatePago(@RequestBody Pago pago) {
        Pago pagoActualizado = pagoService.updatePago(pago);
        return ResponseEntity.ok(pagoActualizado);
    }
}