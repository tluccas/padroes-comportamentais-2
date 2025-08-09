package org.example.state;

public interface EstadoPedido {
    void mudarEstado(Pedido pedido);
    void cancelar(Pedido pedido);
    void mostrarEstado();
}
