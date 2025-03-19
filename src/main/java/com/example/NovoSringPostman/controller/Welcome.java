package com.example.NovoSringPostman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Welcome {



    @RequestMapping("/")
    public String welcome() {

        return "Bem vindo ao teste";

    }

   @RequestMapping("/Curso")
    public String Curso(){

        return "Curso de desenvolvimento de sistemas ";
   }

   @RequestMapping("/spring")
   public String Spring(){

        return "Utilizando Spring boot  java e Postman ";
   }





}
