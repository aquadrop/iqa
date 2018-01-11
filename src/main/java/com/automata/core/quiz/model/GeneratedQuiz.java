package com.automata.core.quiz.model;

/**
 * @author deep
 *
 */
public abstract class GeneratedQuiz extends Quiz {
	
	/**
	 * @param source
	 */
	public GeneratedQuiz() {
		super("generated");
		this.randomize();
	}

	/**
	 * @param source
	 */
	public GeneratedQuiz(String source) {
		super(source);
		this.randomize();
	}
	
	abstract protected void randomize();

}
