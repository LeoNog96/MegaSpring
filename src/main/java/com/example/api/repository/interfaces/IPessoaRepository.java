package com.example.api.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.entity.Pessoa;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa, Long> { }