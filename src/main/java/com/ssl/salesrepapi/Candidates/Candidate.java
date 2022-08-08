package com.ssl.salesrepapi.Candidates;

public class Candidate {
	
	int Id;
	String CandidateName;
	String PrimarySkill;
	String SecondarySkill;
	
	
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Candidate(int id, String candidateName, String primarySkill, String secondarySkill) {
		super();
		Id = id;
		CandidateName = candidateName;
		PrimarySkill = primarySkill;
		SecondarySkill = secondarySkill;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getcandidateName() {
		return CandidateName;
	}
	public void setcandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public String getPrimarySkill() {
		return PrimarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		PrimarySkill = primarySkill;
	}
	public String getSecondarySkill() {
		return SecondarySkill;
	}
	public void setSecondarySkill(String secondarySkill) {
		SecondarySkill = secondarySkill;
	}
	
	

}
