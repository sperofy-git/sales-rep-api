package com.ssl.salesrepapi.Candidates;

public class Candidate {
	
	int Id;
	String Name;
	String PrimarySkill;
	String SecondarySkill;
	
	
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Candidate(int id, String name, String primarySkill, String secondarySkill) {
		super();
		Id = id;
		Name = name;
		PrimarySkill = primarySkill;
		SecondarySkill = secondarySkill;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
