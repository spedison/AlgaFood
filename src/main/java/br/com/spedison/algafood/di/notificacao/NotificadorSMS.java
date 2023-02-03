package br.com.spedison.algafood.di.notificacao;

import br.com.spedison.algafood.di.modelo.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@TipoNotificador(TipoNotificacaoUrgencia.PRIORIARIA)
@Component
@Log4j2
public class NotificadorSMS implements Notificador {
    @Override
    public void nofiticar(Cliente cliente, String msg) {
        log.debug(
                "Nofificando Cliente %s por SMS : %s - Com msg = %s"
                        .formatted(
                                cliente.getNome(), cliente.getTelefone(), msg
                        )
        );
    }

    @Override
    public String getNome() {
        return "SMS";
    }
}
