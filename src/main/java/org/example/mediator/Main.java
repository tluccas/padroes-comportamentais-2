package org.example.mediator;

public class Main {
    public static void main(String[] args) {

        Usuario maria = new Usuario("Maria");
        Usuario joao = new Usuario("João");
        Usuario carlos = new Usuario("Carlos");

        maria.adicionaContato(joao);
        joao.adicionaContato(carlos);
        carlos.adicionaContato(maria);

        maria.enviaMensagem("Olá, João!", joao);
        joao.enviaMensagem("Oi, Carlos!", carlos);
        carlos.enviaMensagem("Bom dia, Maria!", maria);
    }
}