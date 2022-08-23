/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gnt.Interface;

import com.portfolio.gnt.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traigo lista de personas
    public List<Persona> getPersona();
    
    //Guardo obeto de tipo persona
    public void savePersona(Persona persona);
    
    //Elimino objeto(usuario), buscado por ID
    public void deletePersona(Long id);
    
    //Busco persona por ID
    public Persona findPersona(Long id);
}
