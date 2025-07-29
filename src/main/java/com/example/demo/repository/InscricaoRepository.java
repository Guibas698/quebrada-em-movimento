// src/main/java/com/example/demo/repository/InscricaoRepository.java
package com.example.demo.repository;

import com.example.demo.model.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
}
