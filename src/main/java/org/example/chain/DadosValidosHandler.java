package org.example.chain;

public class DadosValidosHandler extends ValidadorHandler{
    @Override
    public void processa(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos) {
        if (!dadosValidos){
            System.out.println("Dados do usuário inválidos!");
            return;
        }
        if(proximo != null){
            proximo.processa(usuario, autenticado, autorizado, dadosValidos);
        }
    }
}
