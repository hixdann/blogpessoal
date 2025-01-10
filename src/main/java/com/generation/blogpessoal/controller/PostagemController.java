package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController   // Define ao Spring que essa classe é uma Controller
@RequestMapping("/postagens") // Define qual endpoint vai ser tratado por essa Classe
@CrossOrigin(origins = "*", allowedHeaders = "*")  //Libera o acesso a qualquer front que não | Se quisermos definir os dominios a ser acessado usamos entre aspas o endereço, Ex: www.generation.com/front
public class PostagemController {
	
	@Autowired  // O spring dá autonomia para a Interface poder invocar os métodos
	private PostagemRepository postagemRepository;
	
	@GetMapping  // Indica que esse método é chamado em Vérbos/Métodos HTTP do tipo Get
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll()); // SELECT * FROM tb_postagens
	}

}
