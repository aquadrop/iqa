package com.automata.core.quiz.model;

import java.util.Random;

/**
 * @author deep
 *
 */
public class ArithmeticQuiz extends GeneratedQuiz {
	
	Random rand = new Random();
	int bound = 100;
	

	/* (non-Javadoc)
	 * @see com.automata.core.quiz.model.GeneratedQuiz#randomize()
	 */
	@Override
	protected void randomize() {
		String prefix = "What is ";
		String postfix = "=?";
		
		int a = rand.nextInt(bound/2);
		int b = rand.nextInt(bound/2);
		int answer  = 0;
		String question;
		int op = rand.nextInt(2);
		if (0 == op) {
			answer = a + b;
			question = a + "+" + b;
		} else {
			answer = Math.abs(a - b);
			if (a > b) {
				question = a + "-" + b;
			} else {
				question = b + "-" + a;
			}
		}
		
		question = prefix + question + postfix;
		this.question = new Question(question);
		this.answer = new Answer(String.valueOf(answer));
	}

}
