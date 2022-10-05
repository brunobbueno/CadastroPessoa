package com.br.cadastropessoa.service;

import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    public String verificaIdentidade(String identif) {

        String tipo = "";

        if (identif.length() == 11) {
            tipo = identif.replace("-", "");
            tipo = identif.replace(".", "");

            return tipo = "CPF";
        } else {
            if (identif.length() == 14) {
                tipo = identif.replace(".", "");
                tipo = identif.replace("/", "");
                tipo = identif.replace("-", "");

                return tipo = "CNPJ";
            }
        }
        return tipo;
    }
}
