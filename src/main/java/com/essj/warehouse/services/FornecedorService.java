package com.essj.warehouse.services;

import com.essj.warehouse.entities.Fornecedor;
import com.essj.warehouse.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {


    @Autowired
    private FornecedorRepository fornecedorRepository;


    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }
}
