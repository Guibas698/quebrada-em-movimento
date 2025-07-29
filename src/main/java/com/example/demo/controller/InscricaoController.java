// src/main/java/com/example/demo/controller/InscricaoController.java
package com.example.demo.controller;


import com.example.demo.model.Inscricao;
import com.example.demo.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class InscricaoController {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @GetMapping("/inscricoes")
    public String mostrarFormulario(Model model) {
        model.addAttribute("inscricao", new Inscricao());
        return "inscricoes"; // templates/inscricoes.html
    }

    @PostMapping("/inscricoes")
    public String processarInscricao(
        @RequestParam String nome,
        @RequestParam Integer idade,
        @RequestParam String responsavel,
        @RequestParam(required = false) String comunidade,
        @RequestParam(required = false) String observacoes,
        @RequestParam(required = false) String[] modalidade
    ) {
        Inscricao inscricao = new Inscricao();
        inscricao.setNome(nome);
        inscricao.setIdade(idade);
        inscricao.setResponsavel(responsavel);
        inscricao.setComunidade(comunidade);
        inscricao.setObservacoes(observacoes);

        if (modalidade != null) {
            for (String mod : modalidade) {
                if (mod.equals("futmesa")) inscricao.setFutmesa(true);
                if (mod.equals("travinha")) inscricao.setTravinha(true);
            }
        }

        inscricaoRepository.save(inscricao);
        return "redirect:/inscricoes?sucesso";
    }
}
