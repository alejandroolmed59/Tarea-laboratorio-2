package com.olmedo.laboratorio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class home {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public static String welcome(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @PostMapping(value="/validacion")
    public static String testpost(@ModelAttribute User user){
        boolean estado = false;
        System.out.println(user.getNombre()+ " "+user.getContrasennia());
        if(user.getNombre().equals("root") && user.getContrasennia().equals("root")) {
            System.out.println("LLEGO");
            estado = true;
        }
        if(estado) {
            return "MostrarMensajeV";
        }else{
            return "MostrarMensajeF";
        }
    }
}
