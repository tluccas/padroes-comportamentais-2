package org.example.state;

public class EstadoNovo implements EstadoPedido {

    @Override
    public void mudarEstado(Pedido pedido) {
        pedido.setEstado(new EstadoProcessando());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
        System.out.println("Pedido cancelado.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado atual do pedido: Novo");
    }
}