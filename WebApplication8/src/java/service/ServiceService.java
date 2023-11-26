
package service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ServiceService extends AbstractFacade<entities.Service> {

    private EntityManager em;

    

    
    public ServiceService(Class<entities.Service> entityClass) {
		super(entityClass);
		
	}


	public ServiceService(Class<entities.Service> entityClass, EntityManager em) {
		super(entityClass);
		this.em = em;
	}


	public EntityManager getEm() {
		return em;
	}


	public void setEm(EntityManager em) {
		this.em = em;
	}

    protected EntityManager getEntityManager() {
        return em;
    }
}
