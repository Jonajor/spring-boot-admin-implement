package br.com.spring.boot.admin.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.boot.admin.client.model.Endereco;
import br.com.spring.boot.admin.client.service.ViaCEPClient;

@RestController
@RequestMapping("/oi")
public class BuscaController {

	@Autowired
	private ViaCEPClient buscaCep;
	
	@GetMapping
	private String busca() {
		String saudacao = "Ola, vamos juntos e shallow now";
		return saudacao;
	}
	
	@PostMapping("/{cep}")
	public Endereco enderecoOrigem(@PathVariable String cep) {
		Endereco meuCep = buscaCep.buscaEnderecoPor(cep);
		return meuCep;
	}
}
