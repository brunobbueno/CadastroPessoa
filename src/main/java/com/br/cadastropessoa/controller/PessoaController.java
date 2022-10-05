package com.br.cadastropessoa.controller;

import com.br.cadastropessoa.model.Pessoa;
import com.br.cadastropessoa.repository.PessoaRepository;
import com.br.cadastropessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;
    @Autowired
    PessoaService pessoaService;

    @PostMapping("/salvaPessoa")
    public void verificaPessoa(@RequestBody Pessoa pessoa){

        if(pessoaService.verificaIdentidade(pessoa.getIdentificador()) == "CPF"){
            pessoa.setIdentificador("CPF");
            pessoaRepository.save(pessoa);
        }else{
            if(pessoaService.verificaIdentidade(pessoa.getIdentificador()) == "CNPJ"){
                pessoa.setIdentificador("CNPJ");
                pessoaRepository.save(pessoa);
            }
        }
    }
}
