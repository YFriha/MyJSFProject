package domaines;

import entities.Service;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;


@ManagedBean
@SessionScoped
public class ServiceBean implements Serializable {

    private Service service;
    private List<Service> services;
    
    public ServiceBean() {
        service = new Service();
        services = new ArrayList<>();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void onCreateAction(){
        services.add(service);
        service = new Service();
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
    

    
    
}
