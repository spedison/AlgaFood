package br.com.spedison.algafood.domain.dao;

import br.com.spedison.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class CozinhaDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Cozinha addOrUpdate(Cozinha cozinha) {
        return entityManager.merge(cozinha);
    }

    public Cozinha getPorId(Long id) {
        return entityManager.find(Cozinha.class, id);
    }

    public List<Cozinha> getCozinhasHabilitadasComString(boolean habilitada, String nome) {
        // Bom para treinar JPQL.
        // Usar o site : https://thorben-janssen.com/jpql/
        Query q = entityManager.createQuery("select c from Cozinha c where c.habilitado = ?1 and c.nome like ?2", Cozinha.class);
        q.setParameter(1, habilitada);
        q.setParameter(2, "%" + nome + "%");
        return q.getResultList();
    }

    @Transactional
    public void remover(Long id) {
        Cozinha c = entityManager.find(Cozinha.class, id);
        entityManager.remove(c);
    }

}
