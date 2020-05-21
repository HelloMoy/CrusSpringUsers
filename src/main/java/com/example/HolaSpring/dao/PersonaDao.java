/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.HolaSpring.dao;

import com.example.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bruma
 */

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
