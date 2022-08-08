package com.ssl.salesrepapi.Candidates;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ssl.salesrepapi.services.ListCandidatesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ListCandidates {
	
	@Autowired
	private ListCandidatesService listCandidateService;
	
	@GetMapping("users/{userName}/all_listCandidates")
	public List<Candidate> getCandidatesList(@PathVariable String userName) {
		return listCandidateService.getCandidates();
	}
	
	@GetMapping("users/{userName}/candidates/{id}")
	public Candidate getCandidatesList(@PathVariable String userName,@PathVariable int id) {
		return listCandidateService.getCandidate(id);
		
	}
	
	@DeleteMapping("/users/{userName}/candidates/{id}")
	public ResponseEntity deleteCandidate(@PathVariable String userName, @PathVariable int id) {
		
		Candidate c = listCandidateService.removeCandidate(id);
		
		if(c!=null)
		{
			return ResponseEntity.noContent().build();
		}
		
		
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/users/{userName}/candidates/{id}")
	public ResponseEntity<Candidate> updateCandidate(@PathVariable String userName, @PathVariable int id, @RequestBody Candidate c) {
		
		Candidate updatedCandidate = listCandidateService.save(c);
		
		return new ResponseEntity<Candidate>(updatedCandidate,HttpStatus.OK);

		
	}
	
	@PostMapping("/users/{userName}/candidates")
	public ResponseEntity<Void> updateCandidate(@PathVariable String userName, @RequestBody Candidate c) {
		
		Candidate createdCandidate = listCandidateService.save(c);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdCandidate.getId()).toUri();
		
		
		return ResponseEntity.created(uri).build();

		
	}

}
