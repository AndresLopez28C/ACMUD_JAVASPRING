package Ejercicio2.conversor;

import org.springframework.stereotype.Component;

@Component
public class ConversionTemperatura implements Conversor{
    @Override
    public float conversion(int temperatura)
    {
        return (float) ((temperatura * 1.8) + 32);
    }
}
