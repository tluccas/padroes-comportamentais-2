package org.example.command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {

    private List<Command> comandos = new ArrayList<>();

    public void adiciona(Command comando){
        this.comandos.add(comando);
    }

    public void executa(){
        for (Command comando: this.comandos)
            comando.executa();
    }

}
