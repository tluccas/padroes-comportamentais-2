package org.example.state;

public class Pedido {

    private String estado;

    public Pedido() {
        this.estado = "Novo";
    }

    public void mudarEstado() {
        if (estado.equals("Novo")) {
            estado = "Processando";
        } else if (estado.equals("Processando")) {
            estado = "Enviado";
        } else if (estado.equals("Enviado")) {
            estado = "Entregue";
        } else {
            System.out.println("O pedido já foi entregue.");
        }
    }

    public void cancelar() {
        if (estado.equals("Novo") || estado.equals("Processando")) {
            estado = "Cancelado";
            System.out.println("Pedido cancelado.");
        } else {
            System.out.println("O pedido não pode ser cancelado.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado atual do pedido: " + estado);
    }
}
