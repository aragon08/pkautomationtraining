package com.animals;


import com.abtraction.Animal;
import com.interfaces.IAnimalBasicActions;
import com.interfaces.IWings;

public class Ostrich extends Animal implements IAnimalBasicActions, IWings{
	
	public int wingsNumber;

	public Ostrich(String name) {
		super(name);
		
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return sound;
	}

	@Override
	public void setSound(String sound) {
		// TODO Auto-generated method stub
		this.sound = sound;

	}

	@Override
	public String eat(String food) {

		// TODO Auto-generated method stub
		return "I am an ostrich and i am eating"+food;

	}

	@Override
	public String sleep(int time) {

		// TODO Auto-generated method stub
		return "I am an ostrich and i am sleeping"+time;

	}

	@Override
	public boolean fly() {

		

		return false;
	}

	@Override
	public int getWingsNumber() {

		
		return 2;

	}

	@Override
	public void setWingsNumber(int number) {
		this.wingsNumber = number;

		
	}

	@Override
	public String toString() {
		return "This is the Ostrich class, and i am "+name+" do i fly?" + fly();
	}
	

	
}
