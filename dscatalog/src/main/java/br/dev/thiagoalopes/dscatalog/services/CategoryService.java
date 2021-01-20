package br.dev.thiagoalopes.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.thiagoalopes.dscatalog.dtos.CategoryDTO;
import br.dev.thiagoalopes.dscatalog.entities.Category;
import br.dev.thiagoalopes.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<CategoryDTO> findAll(){
		List<Category> categories =  this.categoryRepository.findAll();
		return categories.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
}
