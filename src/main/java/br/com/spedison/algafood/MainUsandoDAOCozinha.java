package br.com.spedison.algafood;

import br.com.spedison.algafood.domain.dao.CozinhaDAO;
import br.com.spedison.algafood.domain.model.Cozinha;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Log4j2
public class MainUsandoDAOCozinha {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new SpringApplicationBuilder(AlgaFoodApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        Random random = new Random();
        CozinhaDAO cozinhaDAO = ctx.getBean(CozinhaDAO.class);
        IntStream.range(0, 1500).forEach(i -> {
            boolean habilitado = random.nextBoolean();
            Cozinha c = new Cozinha(null, "Nome Brazileiro %04d".formatted(i), habilitado, null);
            log.debug("Adicionado a Cozinha : " + c.toString());
            cozinhaDAO.addOrUpdate(c);
        });

        log.debug("Cozinhas Habilitadas");
        List<Cozinha> cozinhasHabilitadas = cozinhaDAO.getCozinhasHabilitadasComString(true, "000");
        cozinhasHabilitadas.forEach(log::debug);
        log.debug("Cozinhas Desabilitadas");
        List<Cozinha> cozinhasDesabilitadas = cozinhaDAO.getCozinhasHabilitadasComString(false, "000");
        cozinhasDesabilitadas.forEach(log::debug);
    }
}
