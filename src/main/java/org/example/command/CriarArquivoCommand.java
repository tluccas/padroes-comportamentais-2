package org.example.command;

public class CriarArquivoCommand implements Command{
    private EditorDeArquivos editor;
    private String arquivo;

    public CriarArquivoCommand(EditorDeArquivos editor, String arquivo){
        this.editor = editor;
        this.arquivo = arquivo;
    }
    @Override
    public void executa() {
        editor.criar(arquivo);
    }
}
