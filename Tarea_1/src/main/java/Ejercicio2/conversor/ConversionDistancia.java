package Ejercicio2.conversor;

import org.springframework.stereotype.Component;

@Component
public class ConversionDistancia implements Conversor{
    @Override
    public float conversion(int distancia){
        return distancia*3.281f;
    }
}
