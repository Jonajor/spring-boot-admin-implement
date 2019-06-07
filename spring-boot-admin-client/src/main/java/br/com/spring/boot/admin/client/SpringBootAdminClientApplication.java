package br.com.spring.boot.admin.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.spring.boot.admin.client.model.Endereco;
import br.com.spring.boot.admin.client.service.ViaCEPClient;

@SpringBootApplication
public class SpringBootAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminClientApplication.class, args);
	}
//	
//	@Bean
//    public CommandLineRunner run(ViaCEPClient client){
//        return args -> {
//            if (args.length > 0) {
//                String cep = args[0];
// 
//                Endereco endereco = client
//                                     .buscaEnderecoPor(cep);
// 
//                System.out.println(endereco);
//            }
//        };
//    }

}
