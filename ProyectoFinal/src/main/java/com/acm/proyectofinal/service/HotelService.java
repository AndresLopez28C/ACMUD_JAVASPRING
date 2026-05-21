package com.acm.proyectofinal.service;

import com.acm.proyectofinal.entity.Hotel;
import com.acm.proyectofinal.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    private HotelRepository hotelRepository;
    @Autowired
    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    public Hotel createHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }

    public Hotel findById(int id) {
        return hotelRepository.findById(id).orElse(null);
    }
    public Hotel deleteById(int id) {
        return hotelRepository.findById(id).map(hotel -> {
            hotelRepository.delete(hotel);
            return hotel;
        }).orElse(null);
    }

    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}