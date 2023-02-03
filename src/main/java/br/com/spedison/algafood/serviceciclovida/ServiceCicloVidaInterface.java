package br.com.spedison.algafood.serviceciclovida;

import org.apache.logging.log4j.Logger;

public interface ServiceCicloVidaInterface extends Runnable{

    void init();
    void destroy();

}
