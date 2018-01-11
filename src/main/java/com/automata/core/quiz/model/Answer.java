package com.automata.core.quiz.model;

/**
 * @author deep
 *
 */
public class Answer {
	String textContent;
	String imageContent;
	String audioContent;
	
	public Answer(String textContent) {
		this.textContent = textContent;
	}
	
	public Answer(String textContent, String imageContent, String audioContent) {
		this.textContent = textContent;
		this.imageContent = imageContent;
		this.audioContent = audioContent;
	}

	/**
	 * @return the textContent
	 */
	public String getTextContent() {
		return textContent;
	}

	/**
	 * @param textContent the textContent to set
	 */
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	/**
	 * @return the imageContent
	 */
	public String getImageContent() {
		return imageContent;
	}

	/**
	 * @param imageContent the imageContent to set
	 */
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	/**
	 * @return the audioContent
	 */
	public String getAudioContent() {
		return audioContent;
	}

	/**
	 * @param audioContent the audioContent to set
	 */
	public void setAudioContent(String audioContent) {
		this.audioContent = audioContent;
	}
	
	
}
