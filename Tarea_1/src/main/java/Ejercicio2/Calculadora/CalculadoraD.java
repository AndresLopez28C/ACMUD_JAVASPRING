package Ejercicio2.Calculadora;

import Ejercicio2.conversor.Conversor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraD {
    private Conversor conversor;

    @Autowired
    public CalculadoraD(@Qualifier("conversionDistancia") Conversor conversor) {
        this.conversor = conversor;
    }
    public float Calcular(int valor){
        return conversor.conversion(valor);
    }
}
