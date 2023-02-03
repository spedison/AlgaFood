package br.com.spedison.algafood.di.listener;

import br.com.spedison.algafood.di.eventos.ClienteAtivarEvento;
import br.com.spedison.algafood.di.notificacao.Notificador;
import br.com.spedison.algafood.di.notificacao.TipoNotificacaoUrgencia;
import br.com.spedison.algafood.di.notificacao.TipoNotificador;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@Data
public class EmissaoNFService {
    @EventListener
    public void onClienteAtivo(ClienteAtivarEvento clienteAtivarEvento) {
        log.debug("Emitindo NF para o Cliente %s".formatted(clienteAtivarEvento.getCliente().getNome()));
    }

}
