package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/torneios")
    public String torneios() {
        return "torneios";
    }

    @GetMapping("/quem_somos")
    public String quem_somos() {
        return "quem_somos";
    }

    @GetMapping("/galeria")
    public String galeria() {
        return "galeria";
    }
    @GetMapping("/patrocinadores")
    public String patrocinadores() {
        return "patrocinadores";
    }

    @GetMapping("/acoes_futuras")
    public String acoes_futuras() {
        return "/acoes_futuras";
    }
    
}
