package com.dk.demo.stereotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	@Value("RCB")
	private String teamName;
	@Value("Virat Kohli")
	private String teamCaption;
	@Value ("#{teamID}")
	private List<String> TeamName;
	
	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaption=" + teamCaption + "]";
	}
	public Ipl(String teamName, String teamCaption) {
		super();
		this.teamName = teamName;
		this.teamCaption = teamCaption;
	}
	public Ipl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCaption() {
		return teamCaption;
	}
	public void setTeamCaption(String teamCaption) {
		this.teamCaption = teamCaption;
	}
	
}
