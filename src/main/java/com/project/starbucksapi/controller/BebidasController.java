package com.project.starbucksapi.controller;

import com.project.starbucksapi.model.Bebidas;
import com.project.starbucksapi.repository.BebidasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BebidasController {

        @Autowired
        BebidasRepository bebidasService;

        @GetMapping("/bebidas")
        public List<Bebidas> listBebidas() {
                return bebidasService.findAll();
        }
}
