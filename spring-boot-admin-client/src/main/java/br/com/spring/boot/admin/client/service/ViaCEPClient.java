package br.com.spring.boot.admin.client.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.spring.boot.admin.client.model.Endereco;

@Component
public class ViaCEPClient {

	public Endereco buscaEnderecoPor(String cep){
        RestTemplate template = new RestTemplate();
        return template.getForObject("https://viacep.com.br/ws/{cep}/json",Endereco.class, cep);
    }
}
