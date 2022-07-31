
package com.PortafolioWebAT.mgb.Controller;

import com.PortafolioWebAT.mgb.Entity.Persona;
import com.PortafolioWebAT.mgb.Services.PersonaServiceIMP;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired PersonaServiceIMP personaserviceimp;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return personaserviceimp.getPersona();
    }
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        personaserviceimp.savePersona(persona);
        return "Su Usuario ha sido creado con Éxito";
    }
    
    @DeleteMapping ("/personas/eliminar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaserviceimp.deletePersona(id);
        return "El usuario ha sido eliminado";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String NuevoNombre,
                                @RequestParam("apellido") String NuevoApellido,
                                @RequestParam("img") String NuevoImg){
        Persona persona = personaserviceimp.findPersona(id);
                   
        persona.setNombre(NuevoNombre);
        persona.setApellido(NuevoApellido);
        persona.setImg (NuevoImg);
                                    
                   personaserviceimp.savePersona(persona);
                   return persona;
                                }
    

}
    
    

