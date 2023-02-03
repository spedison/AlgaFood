package br.com.spedison.algafood.di.notificacao;

import br.com.spedison.algafood.di.modelo.Cliente;

public interface Notificador {
    void nofiticar(Cliente cliente, String msg);

    default String getNome(){
        return "Sem nome atribuido";
    }
}
