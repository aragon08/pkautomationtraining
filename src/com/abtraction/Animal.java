package com.abtraction;

public abstract class Animal {
	 
	public String name;
	public String sound;
	
	 
	public Animal(String name) {
		this.name = name;
	}
		
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public abstract String getSound();
	public abstract void setSound(String sound);
	 

	@Override
	public String toString() {
		return "Animal [name=" + name + ", sound=" + sound + "]";
	}
	
	
	

}
