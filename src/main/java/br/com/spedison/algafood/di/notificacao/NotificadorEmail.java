package br.com.spedison.algafood.di.notificacao;

import br.com.spedison.algafood.di.modelo.Cliente;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@TipoNotificador(TipoNotificacaoUrgencia.NORMAL)
@Component
@Log4j2
public class NotificadorEmail implements Notificador {

//    @Value("${notificador.email.caixaAlta}")
//    private boolean caixaAlta;
//    @Value("${notificador.email.servidorSmtp}")
//    private String servidorSmtp;
//
//    @Value("${notificador.email.porta}")
//    private int porta;

    //final private static Logger log = LogManager.getLogger(NotificadorEmail.class);

    @Autowired
    NotificadorEmailProperties notificadorEmailProperties;

    @Override
    public void nofiticar(Cliente cliente, String msg) {

        if (notificadorEmailProperties.getCaixaAlta()) {
            msg = msg.toUpperCase();
        }

        log.debug("%nNofificando Cliente %s por Email : %s, usando o servidor smtp://%s:%d - Com msg = %s%n"
                .formatted(
                        cliente.getNome(), cliente.getEmail(),
                        notificadorEmailProperties.getServidorSmtp(),
                        notificadorEmailProperties.getPorta(), msg)
        );
    }

    @Override
    public String getNome() {
        return "Email";
    }
}