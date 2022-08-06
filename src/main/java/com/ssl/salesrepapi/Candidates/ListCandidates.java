package com.ssl.salesrepapi.Candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
	
	@DeleteMapping("/users/{userName}/candidates/{id}")
	public ResponseEntity deleteCandidate(@PathVariable String userName, @PathVariable int id) {
		
		Candidate c = listCandidateService.removeCandidate(id);
		
		if(c!=null)
		{
			return ResponseEntity.noContent().build();
		}
		
		
		return ResponseEntity.notFound().build();
	}

}
