
package com.PortafolioWebAT.mgb.Interface;

import com.PortafolioWebAT.mgb.Entity.Persona;
import java.util.List;

public interface IpersonaService {
    //Ingresar lista de Users//
    public List <Persona> getPersona();
    //Guardar Users//
    public void savePersona (Persona persona);
    
    //Eliminar User por ID//
    public void deletePersona(Long id);
    
    //Buscar User//
    public Persona findPersona(Long id);
    
}
