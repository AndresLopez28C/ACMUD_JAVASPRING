package com.acm.SingleResponsability.CORRECTO;

public class Validar_stock {
    private List<Pedido> pedidos;
    private List<Producto> productos;

    public boolean validarStock(Pedido pedido) {
        System.out.println("Validando stock para el producto: " + pedido.getProducto());
        // Aquí podrías agregar lógica real para verificar el stock en una base de datos o sistema de inventario
        return true; // Suponemos que siempre hay stock disponible para simplificar
    }
}
