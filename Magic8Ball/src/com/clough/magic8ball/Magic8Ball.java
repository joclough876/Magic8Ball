package com.clough.magic8ball;

import java.util.ArrayList;
import java.util.List;

public class Magic8Ball {//POJO plain old java object
	
	private List<String> answers;
	private String question;
	
	public Magic8Ball() {
		this.question = null;
		answers = new ArrayList<String>();
		answers.add("As I see it, yes.");
		answers.add("Ask again later/");
		answers.add("Yes");
		answers.add("No");
	}
	public boolean askQuestion(String question) {
		// TODO Auto-generated method stub
		if(question instanceof String) {
			return true;
		}
		else {
		return false;
		}
	}
	public String getQuestion() {
		question = "Should I cut my own bangs?";
		return question;
	}
	public String shake() {
		//Return a random element from the array
		//Use Random Class to create random number
		//use random number to get answer from list
		return "Ask again later.";
	}

}
