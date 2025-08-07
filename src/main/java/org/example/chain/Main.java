package org.example.chain;

// TODO: Imagine que você está desenvolvendo uma API REST para uma empresa.
//  Cada requisição feita a um endpoint precisa passar por uma sequência de validações antes que possa ser processada:
//      Autenticação: o usuário está logado no sistema?
//      Autorização: o usuário tem permissão para acessar esse recurso?
//      Validação dos dados: os dados enviados estão completos e corretos?
//      .
//      Aplique o padrão de projeto Chain of responsability no contexto.
public class Main {

    public static void main(String[] args) {

        ValidadorHandler autenticacao = new AutenticadoHandler();
        ValidadorHandler autorizado = new AutorizadoHandler();
        ValidadorHandler dadosValidos = new DadosValidosHandler();
        ValidadorHandler fim = new ProcessamentoFinalHandler();

        autenticacao.setProximo(autorizado);
        autorizado.setProximo(dadosValidos);
        dadosValidos.setProximo(fim);

        autenticacao.processa("Maira", false, true, true);
    }
}
