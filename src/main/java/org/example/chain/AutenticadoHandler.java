package org.example.chain;

public class AutenticadoHandler extends ValidadorHandler {
    @Override
    public void processa(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos) {
        if (!autenticado) {
            System.out.println("Usuário não autenticado");
            return;
        }
        if(proximo != null){
            proximo.processa(usuario, autenticado, autorizado, dadosValidos);
        }

    }
}
