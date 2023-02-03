package br.com.spedison.algafood.di.eventos;

import br.com.spedison.algafood.di.modelo.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClienteAtivarEvento {
    Cliente cliente;
}
