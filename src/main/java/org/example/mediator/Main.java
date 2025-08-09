package org.example.mediator;

public class Main {
    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediator();

        Usuario maria = new Usuario("Maria", chatMediator);
        Usuario joao = new Usuario("João", chatMediator);
        Usuario carlos = new Usuario("Carlos", chatMediator);

        maria.adicionaContato(joao);
        joao.adicionaContato(carlos);
        carlos.adicionaContato(maria);

        maria.enviaMensagem("Olá, João!", joao);
        joao.enviaMensagem("Oi, Carlos!", carlos);
        carlos.enviaMensagem("Bom dia, Maria!", maria);
    }
}