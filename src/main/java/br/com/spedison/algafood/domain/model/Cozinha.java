package br.com.spedison.algafood.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@Table(name = "tb_cozinha")
public class Cozinha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String nome;
    boolean habilitado;
    @Column(name = "dt_criacao" , columnDefinition = "timestamp not null default now()")
    private LocalDateTime criacao;

}
