package org.example.mediator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChatMediator implements Mediator {

    private Map<Usuario, Set<Usuario>> contatos = new HashMap<>();

    public void registraUsuario(Usuario usuario) {
        contatos.putIfAbsent(usuario, new HashSet<>());
    }

    public void adicionaContato(Usuario usuario, Usuario contato) {
        contatos.get(usuario).add(contato);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente, Usuario destinatario) {
        Set<Usuario> contatosDoRemetente = contatos.get(remetente);
        if (contatosDoRemetente != null && contatosDoRemetente.contains(destinatario)) {
            destinatario.receberMensagem(mensagem, remetente);
        } else {
            System.out.println("Usuário " + destinatario.getNome() + " não está na lista de contatos de " + remetente.getNome());
        }
    }
}
