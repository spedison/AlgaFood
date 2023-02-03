package br.com.spedison.algafood.di.listener;

import br.com.spedison.algafood.di.eventos.ClienteAtivarEvento;
import br.com.spedison.algafood.di.notificacao.Notificador;
import br.com.spedison.algafood.di.notificacao.TipoNotificacaoUrgencia;
import br.com.spedison.algafood.di.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @Autowired
    @TipoNotificador(TipoNotificacaoUrgencia.NORMAL)
    Notificador notificador;

    @EventListener
    public void onClienteAtivo(ClienteAtivarEvento clienteAtivarEvento) {
        notificador.nofiticar(clienteAtivarEvento.getCliente(),"Nofificado por eventos !");
    }

}
