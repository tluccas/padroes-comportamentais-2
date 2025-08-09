package org.example.state;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void mudarEstado(Pedido pedido) {
        pedido.setEstado(new EstadoEntregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido não pode ser cancelado.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado atual do pedido: Enviado");
    }
}
