package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private List<Usuario> contatos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void adicionaContato(Usuario usuario) {
        contatos.add(usuario);
    }

    public void enviaMensagem(String mensagem, Usuario destinatario) {
        if (contatos.contains(destinatario)) {
            destinatario.receberMensagem(mensagem, this);
        } else {
            System.out.println("Usuário " + destinatario.getNome() + " não está na sua lista de contatos.");
        }
    }

    public void receberMensagem(String mensagem, Usuario remetente) {
        System.out.println(nome + " recebeu de " + remetente.getNome() + ": " + mensagem);
    }

    public String getNome() {
        return nome;
    }
}
