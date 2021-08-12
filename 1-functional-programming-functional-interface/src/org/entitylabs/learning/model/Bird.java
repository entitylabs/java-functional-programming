package org.entitylabs.learning.model;

public class Bird {

	private boolean isEndangered;
	private String name;
	private boolean isCarnivorous;

	public Bird(boolean isEndangered, String name, boolean isCarnivorous) {
		super();
		this.isEndangered = isEndangered;
		this.name = name;
		this.isCarnivorous = isCarnivorous;
	}

	public boolean isEndangered() {
		return isEndangered;
	}

	public void setEndangered(boolean isEndangered) {
		this.isEndangered = isEndangered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

}
