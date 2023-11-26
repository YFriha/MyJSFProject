
package service;

import entities.Employee;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmployeService extends AbstractFacade<Employee> {

    @PersistenceContext(unitName = "")
    private EntityManager em;

    public EmployeService() {
        super(Employee.class);
    }

    
    protected EntityManager getEntityManager() {
        return em;
    }
}

