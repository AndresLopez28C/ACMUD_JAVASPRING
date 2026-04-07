package com.acm.SingleResponsability.CORRECTO;

public class Calcular_total {
    public double calcularTotal(Pedido pedido, Producto producto) {
        double total = pedido.getCantidad() * producto.getPrecio();
        System.out.println("Calculando total para el pedido: " + pedido.getProducto());
        System.out.println("Total: " + total);
        return total;
    }
}
