package org.example.state;

public class EstadoEntregue implements EstadoPedido {

    @Override
    public void mudarEstado(Pedido pedido) {
        System.out.println("O pedido já foi entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido não pode ser cancelado.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado atual do pedido: Entregue");
    }
}
