package br.com.spedison.algafood.di.service;

import br.com.spedison.algafood.di.eventos.ClienteAtivarEvento;
import br.com.spedison.algafood.di.modelo.Cliente;
import br.com.spedison.algafood.di.notificacao.Notificador;
import br.com.spedison.algafood.di.notificacao.NotificadorEmail;
import br.com.spedison.algafood.di.notificacao.TipoNotificacaoUrgencia;
import br.com.spedison.algafood.di.notificacao.TipoNotificador;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
@Log4j2
public class AtivacaoClienteService implements AtivacaoClienteServiceInterface {


    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    List<Notificador> notificadores;

    //@Autowired
    //@TipoNotificador(TipoNotificacaoUrgencia.NORMAL)
    //private Notificador notificador;
    @Override
    public void ativar(Cliente cliente){
        cliente.ativar();

        //--->notificador.nofiticar(cliente,"Seu cadastro está ativo.");
        // Evento de Cliente Ativado.

        applicationEventPublisher.publishEvent(new ClienteAtivarEvento(cliente));

        log.debug("\n\nLista notificadores ...: \n\n");
        notificadores.stream().map(Notificador::getNome).forEach(log::debug);
    }

    @PostConstruct
    public void init(){
        log.debug("EDISON :: Depois da criação");
    }

    @PreDestroy
    public void destroy(){
        log.debug("EDISON :: Antes de destruir");
    }

}
