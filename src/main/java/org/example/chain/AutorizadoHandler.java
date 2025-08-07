package org.example.chain;

public class AutorizadoHandler extends ValidadorHandler {
    @Override
    public void processa(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos) {
        if (!autorizado){
            System.out.println("Usuário não autorizado!");
            return;
        }
        if(proximo != null){
            proximo.processa(usuario, autenticado, autorizado, dadosValidos);
        }
    }
}