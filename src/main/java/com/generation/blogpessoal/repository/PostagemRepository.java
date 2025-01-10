package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	// save(Objeto objeto)
	
	// findById (Long id)
	
	// existingById(Long id)
	
	// findAll()
	
	// deleteById(Long id)
	
	// deleteAll()

}
