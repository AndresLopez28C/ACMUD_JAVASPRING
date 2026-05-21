package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Puente;
import com.acm.proyectofinal.service.PuenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/puente")
public class PuenteControler {
    private PuenteService puenteService;
    @Autowired
    public PuenteControler(PuenteService puenteService){
        this.puenteService = puenteService;
    }
    @PostMapping("/create-puente")
    public ResponseEntity<Puente> savePuente(@RequestBody Puente puente){
        Puente puenteGuardado  = puenteService.createPuente(puente);
        return ResponseEntity.ok(puenteGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Puente> findById(@PathVariable int id) {
        Puente puenteEncontrado = puenteService.findById(id);
        if (puenteEncontrado != null) {
            return ResponseEntity.ok(puenteEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Puente> deleteById(@PathVariable int id) {
        Puente puenteEliminado = puenteService.deleteById(id);
        if (puenteEliminado != null) {
            return ResponseEntity.ok(puenteEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-puente")
    public ResponseEntity<Puente> updatePuente(@RequestBody Puente puente) {
        Puente puenteActualizado = puenteService.updatePuente(puente);
        return ResponseEntity.ok(puenteActualizado);
    }
}