package com.revature.eval.java.core;

public class ScrabbleTile {

	char letter;
	int value; 
	
	public ScrabbleTile (char letter, int value) {
		this.letter = letter; 
		this.value = value;
	}
	public char getletter() {
		return this.letter;
	}
	
	public int getvalue() {
		return this.value;
	}
}
