package org.example.state;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.mostrarEstado();
        pedido.mudarEstado();
        pedido.mostrarEstado();
        pedido.mudarEstado();
        pedido.mostrarEstado();
        pedido.cancelar();
    }
}