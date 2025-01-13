package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
	// save(Objeto objeto)
	
	// findById (Long id)
	
	// existingById(Long id)
	
	// findAll()
	
	// deleteById(Long id)
	
	// deleteAll()

}
