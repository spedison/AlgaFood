package br.com.spedison.algafood.serviceciclovida;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/***
 * Outra forma é implementar os métodos das interfaces DisposableBean e InitializingBean.
 * Pouco recomendado.
 */
public class ServiceCicloVidaImpl implements ServiceCicloVidaInterface {

    Logger log  = LogManager.getLogger(ServiceCicloVidaImpl.class);
    @Override
    public void run() {
       log.debug("EDISON :: Executando o RUN do CicloVida - Usando Configuration");
    }

    public void init(){
        log.debug("EDISON :: Chamou o INIT do CicloVida - Usando Configuration");
    }
    public void destroy(){
        log.debug("EDISON :: Chamou o DESTROY do CicloVida - Usando Configuration");
    }
}
