package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

//	@Autowired
	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
		System.out.println("Inside SpellChecker Constructor");
	}

	
	// @Autowired
	// public void setSpellchecker(SpellChecker spellchecker) {
	// this.spellChecker = spellchecker;
	// }

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void checkSpell() {
		spellChecker.checkSpelling();
	}

}
