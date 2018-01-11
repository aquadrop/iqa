package com.automata.core.quiz.model;

/**
 * 
 * @author deep
 * https://github.com/aquadrop/iqa/blob/master/wiki.md
 */
public class Quiz {
	String realm;
	String difficulty;
	String quizType;
	String source = "db";
	Question question;
	Answer answer;
	
	public Quiz(String source) {
		this.source = source;
	}
}
