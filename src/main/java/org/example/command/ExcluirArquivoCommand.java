package org.example.command;

public class ExcluirArquivoCommand implements Command {

        private EditorDeArquivos editor;
        private String arquivo;

        public ExcluirArquivoCommand(EditorDeArquivos editor, String arquivo){
            this.editor = editor;
            this.arquivo = arquivo;
        }
        @Override
        public void executa() {
            editor.excluir(arquivo);
        }
}
