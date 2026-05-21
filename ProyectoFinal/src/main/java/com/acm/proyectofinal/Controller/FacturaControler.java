package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Factura;
import com.acm.proyectofinal.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/factura")
public class FacturaControler {
    private FacturaService facturaService;
    @Autowired
    public FacturaControler(FacturaService facturaService){
        this.facturaService = facturaService;
    }
    @PostMapping("/create-factura")
    public ResponseEntity<Factura> saveFactura(@RequestBody Factura factura){
        Factura facturaGuardado  = facturaService.createFactura(factura);
        return ResponseEntity.ok(facturaGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Factura> findById(@PathVariable int id) {
        Factura facturaEncontrado = facturaService.findById(id);
        if (facturaEncontrado != null) {
            return ResponseEntity.ok(facturaEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Factura> deleteById(@PathVariable int id) {
        Factura facturaEliminado = facturaService.deleteById(id);
        if (facturaEliminado != null) {
            return ResponseEntity.ok(facturaEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-factura")
    public ResponseEntity<Factura> updateCategoria(@RequestBody Factura factura) {
        Factura facturaActualizado = facturaService.updateFactura(factura);
        return ResponseEntity.ok(facturaActualizado);
    }
}
