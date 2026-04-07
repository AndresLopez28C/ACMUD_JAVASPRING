package com.acm.SingleResponsability.INCORRECTO;

public class Pedido_service {
    public void crearpedido(Pedido pedido ){
        System.out.println("Pedido creado" + pedido.getID());
        validarStock(pedido);
        calcularTotal(pedido);
        enviarNotificacion(pedido);

    }
    private void validarStock(Pedido pedido) {
        System.out.println("Validando stock para el producto: " + pedido.getProducto());
    }
    private void calcularTotal(Pedido pedido) {
        System.out.println("Calculando total para el pedido: " + pedido.getId());
    }
    private void enviarNotificacion(Pedido pedido) {
        System.out.println("Enviando notificación para el pedido: " + pedido.getId());
    }
}
