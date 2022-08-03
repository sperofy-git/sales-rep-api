package com.ssl.salesrepapi.Candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssl.salesrepapi.services.ListCandidatesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ListCandidates {
	
	@Autowired
	private ListCandidatesService listCandidateService;
	
	@GetMapping("/all_listCandidates")
	public List<Candidate> getCandidatesList() {
		return listCandidateService.getCandidates();
	}

}
