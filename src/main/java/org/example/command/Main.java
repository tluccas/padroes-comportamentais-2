package org.example.command;


// TODO: Você está desenvolvendo um aplicativo que permite ao usuário realizar comandos como:
//  - Criar um arquivo
//  - Renomear um arquivo
//  - Excluir um arquivo
//  .
//  APlique o padrão Command para que o usuário consiga adicionar novos comandos facilmente


public class Main {

    public static void main(String[] args) {

       /* EditorDeArquivos editor = new EditorDeArquivos();
        editor.executarAcao("criar", "documento.txt");
        editor.executarAcao("renomear", "documento.txt");*/

        EditorDeArquivos editor = new EditorDeArquivos();
        ListaDeComandos listaDeComandos = new ListaDeComandos();

        listaDeComandos.adiciona(new CriarArquivoCommand(editor, "documento.txt"));
        listaDeComandos.adiciona(new RenomearArquivoCommand(editor, "documento.txt"));
        listaDeComandos.adiciona(new ExcluirArquivoCommand(editor, "documento.txt"));

        listaDeComandos.executa();
    }
}
