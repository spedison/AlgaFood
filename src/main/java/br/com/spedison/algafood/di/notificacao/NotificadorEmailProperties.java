package br.com.spedison.algafood.di.notificacao;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "notificador.email")
@Data
@ToString
public class NotificadorEmailProperties {
    /**
     * Servidor de email utilizado no envio.
     */
    private String servidorSmtp;
    /**
     * Se o envio da mensagem será em caixa alta ou a mensagem original.
     * Se for true, caixa alta, false será a original.
     */
    private Boolean caixaAlta = false;
    /**
     * Porta do servidor email utilizado no envio.
     */
    private int porta = 25;
}
