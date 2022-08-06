package com.ssl.salesrepapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssl.salesrepapi.Candidates.Candidate;

@Service
public class ListCandidatesService {
	
	private static  List<Candidate> candidateList = new ArrayList();
	private static int idCounter = 1005;

	static {
		candidateList.add(new Candidate(idCounter++,"Rama", "Java", "Devops" ));
		candidateList.add(new  Candidate(idCounter++,"Raghav", ".Net", "DB2" ));
		candidateList.add(new  Candidate(idCounter++,"Vijay", "DB2", "Scala" ));
		candidateList.add(new  Candidate(idCounter++,"Krishna", "PHP", "Java" ));

	}

	public List<Candidate> getCandidates() {
		return candidateList;
	}
	
	public Candidate removeCandidate(int candidateId) {
		
		Candidate c = findById(candidateId);
		if (c==null) return null;
		candidateList.remove(c);
		return c;
		
	}
	
	public Candidate findById(int candidateId) {
		for(Candidate c:candidateList) {
			if (c.getId() == candidateId) {
				return c;
			}			
		}
		return null;
	}
	
}
