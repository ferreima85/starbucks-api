package com.project.starbucksapi.service;

import com.project.starbucksapi.model.Bebidas;
import com.project.starbucksapi.repository.BebidasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebidasService {

private final BebidasRepository bebidasRepository;

    public BebidasService(BebidasRepository bebidasRepository) {
        this.bebidasRepository = bebidasRepository;
    }

    public List<Bebidas> findAll() {
        return bebidasRepository.findAll();
    }
}
