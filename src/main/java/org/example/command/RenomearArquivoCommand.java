package org.example.command;

public class RenomearArquivoCommand implements Command{
    private EditorDeArquivos editor;
    private String arquivo;

    public RenomearArquivoCommand(EditorDeArquivos editor, String arquivo){
        this.editor = editor;
        this.arquivo = arquivo;
    }
    @Override
    public void executa() {
        editor.renomear(arquivo);
    }
}
