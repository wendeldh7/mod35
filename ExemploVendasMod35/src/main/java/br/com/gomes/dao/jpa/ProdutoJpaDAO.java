/**
 * 
 */
package br.com.gomes.dao.jpa;

import br.com.gomes.dao.generic.jpa.GenericJpaDAO;
import br.com.gomes.domain.jpa.ProdutoJpa;

/**
 * @author wendel.gomes
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
