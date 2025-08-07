package org.example.chain;



public abstract class ValidadorHandler {
    protected ValidadorHandler proximo;

    public void setProximo(ValidadorHandler proximo) {
        this.proximo = proximo;
    }

    public abstract void processa(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos);

}
