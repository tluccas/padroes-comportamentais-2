package org.example.state;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new EstadoNovo();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void mudarEstado() {
        estado.mudarEstado(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }
}

