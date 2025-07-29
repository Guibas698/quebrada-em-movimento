package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.GaleriaService;

import java.util.List;

@Controller
@RequestMapping("/galeria")
public class GaleriaController {

    private final GaleriaService galeriaService;

    public GaleriaController(GaleriaService galeriaService) {
        this.galeriaService = galeriaService;
    }

    @GetMapping("/{ano}")
    public String carregarGaleriaPorAno(@PathVariable int ano, Model model) {
        List<String> imagens = galeriaService.buscarImagensPorAno(ano);
        model.addAttribute("ano", ano);
        model.addAttribute("imagens", imagens);
        return "galeria-ano"; // Nome do template .html
    }
}
