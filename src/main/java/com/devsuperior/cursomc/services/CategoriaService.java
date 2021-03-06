package com.devsuperior.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.cursomc.domain.Categoria;
import com.devsuperior.cursomc.repositories.CategoriaRepository;
import com.devsuperior.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorId(Integer id) {
		
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ". Tipo: " + Categoria.class));
	
	}

}
