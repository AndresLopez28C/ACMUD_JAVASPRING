package com.acm.proyectofinal.Controller;
import com.acm.proyectofinal.entity.Hotel;
import com.acm.proyectofinal.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hotel")
public class HotelControler {
    private HotelService hotelService;
    @Autowired
    public HotelControler(HotelService hotelService){
        this.hotelService = hotelService;
    }
    @PostMapping("/create-hotel")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        Hotel hotelGuardado  = hotelService.createHotel(hotel);
        return ResponseEntity.ok(hotelGuardado);
    }

    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Hotel> findById(@PathVariable int id) {
        Hotel hotelEncontrado = hotelService.findById(id);
        if (hotelEncontrado != null) {
            return ResponseEntity.ok(hotelEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Hotel> deleteById(@PathVariable int id) {
        Hotel hotelEliminado = hotelService.deleteById(id);
        if (hotelEliminado != null) {
            return ResponseEntity.ok(hotelEliminado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-hotel")
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) {
        Hotel hotelActualizado = hotelService.updateHotel(hotel);
        return ResponseEntity.ok(hotelActualizado);
    }
}