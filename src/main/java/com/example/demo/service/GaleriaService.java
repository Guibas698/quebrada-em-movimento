package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GaleriaService {

    private final Map<Integer, List<String>> bancoDeImagens = new HashMap<>();

    public GaleriaService() {
        bancoDeImagens.put(2022, List.of(
            "https://i.pinimg.com/736x/51/d9/eb/51d9eb6e516caf636f5a72bb45fe338f.jpg",
            "https://i.pinimg.com/736x/78/b9/07/78b9077dff8a431150f55a9cb818af5a.jpg"
        ));
        bancoDeImagens.put(2023, List.of(
            "https://i.pinimg.com/1200x/46/1a/0d/461a0d8f59725ec8fe822312215f8620.jpg",
            "https://i.pinimg.com/736x/5a/ef/25/5aef25815f12969734607f53cf617d54.jpg"
        ));
        bancoDeImagens.put(2024, List.of(
            "https://i.pinimg.com/1200x/89/72/19/89721930d8c66f1d211312ea5f56bb69.jpg",
            "https://i.pinimg.com/736x/7b/32/e4/7b32e46a272fd6f7cc980d5fb8e20ccd.jpg"
        ));
    }

    public List<String> buscarImagensPorAno(int ano) {
        return bancoDeImagens.getOrDefault(ano, new ArrayList<>());
    }
}
