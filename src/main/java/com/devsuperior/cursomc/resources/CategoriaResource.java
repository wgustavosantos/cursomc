package com.devsuperior.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method =RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(1, "Escritório");
		
		List<Categoria> categorias = new ArrayList<>();
		
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;
		
	}

}
