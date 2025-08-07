package org.example.command;

public class EditorDeArquivos {

    public void criar(String nome) {
        System.out.println("Arquivo " + nome + " criado.");
    }

    public void renomear(String nome) {
        System.out.println("Arquivo " + nome + " renomeado.");
    }

    public void excluir(String nome) {
        System.out.println("Arquivo " + nome + " excluído.");
    }
}

