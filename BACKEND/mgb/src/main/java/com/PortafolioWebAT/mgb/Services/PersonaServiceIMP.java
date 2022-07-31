
package com.PortafolioWebAT.mgb.Services;

import com.PortafolioWebAT.mgb.Entity.Persona;
import com.PortafolioWebAT.mgb.Interface.IpersonaService;
import com.PortafolioWebAT.mgb.Repository.IPersonarepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceIMP implements IpersonaService {
    @Autowired IPersonarepository Ipersonarepository;
    
    @Override
    public List<Persona> getPersona() {
            List<Persona> persona = Ipersonarepository.findAll();
            return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        Ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
     Ipersonarepository.deleteById(id);
    }

    @Override
     public Persona findPersona(Long id) {
        Persona persona = Ipersonarepository.findById(id).orElse(null);
        return persona;
    }
}
