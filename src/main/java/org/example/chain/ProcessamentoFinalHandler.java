package org.example.chain;

public class ProcessamentoFinalHandler extends ValidadorHandler{
    @Override
    public void processa(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos) {
        System.out.println("Requisição processada com sucesso!");
    }
}
