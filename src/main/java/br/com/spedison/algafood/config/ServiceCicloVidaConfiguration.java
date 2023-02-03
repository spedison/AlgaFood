package br.com.spedison.algafood.config;

import br.com.spedison.algafood.serviceciclovida.ServiceCicloVidaImpl;
import br.com.spedison.algafood.serviceciclovida.ServiceCicloVidaInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceCicloVidaConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    ServiceCicloVidaInterface serviceCicloVida(){
        return new ServiceCicloVidaImpl();
    }
}
