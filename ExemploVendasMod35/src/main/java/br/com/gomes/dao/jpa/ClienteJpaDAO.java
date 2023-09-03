/**
 * 
 */
package br.com.gomes.dao.jpa;

import br.com.gomes.dao.generic.jpa.GenericJpaDAO;
import br.com.gomes.domain.jpa.ClienteJpa;

/**
 * @author wendel.gomes
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
