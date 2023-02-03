package br.com.spedison.algafood.controller;

import br.com.spedison.algafood.di.modelo.Cliente;
import br.com.spedison.algafood.di.service.AtivacaoClienteServiceInterface;
import br.com.spedison.algafood.serviceciclovida.ServiceCicloVidaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteBancoControler {


    @Autowired
    ServiceCicloVidaInterface cicloVida;
    @Autowired
    private AtivacaoClienteServiceInterface ativacaoClienteService;

    @GetMapping("/testDB")
    @ResponseBody
    public String hello(){
        Cliente c = new Cliente("Edison", "spedison@gmail.com", "+5511996218336");
        ativacaoClienteService.ativar(c);
        cicloVida.run();
        return "\n\nHello 1-2-3\n\n";
    }

}
