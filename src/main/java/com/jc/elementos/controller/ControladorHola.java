/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorHola {
/*
    //primero hacemos el get
    @RequestMapping(value="/hola", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String holaConGet(){
        return "Este es mi primer controller con un get";
    }
    //Crear un m�todo get para los usuarios que me devuelva TODOSSS
    
    @RequestMapping(value="/usuario", method=RequestMethod.GET, headers={"Accept=Application/json"})
    public @ResponseBody String obtenerTodos()throws IOException{
        //Vamos a usar la implementaci�n json para java fasterxml o codehouse
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(GenerarUsuarios.obtenerUsuarios());
    }*/
}
