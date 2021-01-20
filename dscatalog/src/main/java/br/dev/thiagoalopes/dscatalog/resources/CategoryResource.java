package br.dev.thiagoalopes.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.thiagoalopes.dscatalog.entities.Category;

@RestController
@RequestMapping("categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1L, "Alimentos"));
		categories.add(new Category(2L, "Produtos de Higiene"));
		categories.add(new Category(3L, "Frios"));

		return ResponseEntity.ok(categories);
	}
	
}
