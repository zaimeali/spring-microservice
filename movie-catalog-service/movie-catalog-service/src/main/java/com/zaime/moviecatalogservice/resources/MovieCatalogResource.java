package com.zaime.moviecatalogservice.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaime.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@GetMapping("/{userID}")
	public List<CatalogItem> getCatalog(@PathVariable("userID") String userID) {
		return List.of(
			new CatalogItem("Transformers", "Test", 5)
		);
	}
}
