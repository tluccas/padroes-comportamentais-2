package org.example.mediator;

public class Usuario {

    private String nome;
    private ChatMediator mediator;

    public Usuario(String nome, ChatMediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
        mediator.registraUsuario(this);
    }

    public void adicionaContato(Usuario usuario) {
        mediator.adicionaContato(this, usuario);
    }

    public void enviaMensagem(String mensagem, Usuario destinatario) {
        mediator.enviarMensagem(mensagem, this, destinatario);
    }

    public void receberMensagem(String mensagem, Usuario remetente) {
        System.out.println(nome + " recebeu de " + remetente.getNome() + ": " + mensagem);
    }

    public String getNome() {
        return nome;
    }
}