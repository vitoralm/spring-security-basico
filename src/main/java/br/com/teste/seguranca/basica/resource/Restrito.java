package br.com.teste.seguranca.basica.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restrito")
public class Restrito {
	
	@GetMapping
	public ResponseEntity<?> ok() {
		return ResponseEntity.ok("Acesso restrito! Apenas com autenticação");
	}
}
