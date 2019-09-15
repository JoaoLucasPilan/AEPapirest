package br.unicesumar.avaliacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

	@Autowired
	private AvaliacaoRepository repo;
	
	@GetMapping
	public List<Avaliacao> get() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody Avaliacao nova) {
		nova = repo.save(nova);
		return nova.getId();
	}
	
	@GetMapping("/{id}")
	public  Avaliacao getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	} 

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

}
