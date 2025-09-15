package ola.com.senai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class controller {

    @RestController

    public static class Controller{

        @GetMapping("/ola")

        public String ola() {
            return "ola";
        }
    }
}
