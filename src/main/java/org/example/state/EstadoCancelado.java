package org.example.state;

public class EstadoCancelado implements EstadoPedido {

    @Override
    public void mudarEstado(Pedido pedido) {
        System.out.println("Pedido cancelado, não pode mudar de estado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já está cancelado.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado atual do pedido: Cancelado");
    }
}
