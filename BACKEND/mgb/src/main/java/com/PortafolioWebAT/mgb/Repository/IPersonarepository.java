
package com.PortafolioWebAT.mgb.Repository;

import com.PortafolioWebAT.mgb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonarepository extends JpaRepository<Persona, Long>{
    
}
