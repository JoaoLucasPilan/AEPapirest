package br.unicesumar.aluno;

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
@RequestMapping("/api/alunos")
public class AlunoController {
	@Autowired
	private AlunoRepository repo;
	
	@GetMapping
	public List<Aluno> get() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody Aluno nova) {
		nova = repo.save(nova);
		return nova.getId();
	}
	
	@GetMapping("/{id}")
	public  Aluno getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	} 

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

}

