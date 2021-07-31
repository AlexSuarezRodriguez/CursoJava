package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.hungry = 50;
		cat.happiness = 50;
		
		/*
		Animal gatico = new Animal();
		gatico.hungry = 70;
		gatico.happiness = 70;
		*/
		
		System.out.println("hambre perrito: " + cat.hungry);
		//System.out.println("hambre gatico: " + gatico.hambre);
		
		//System.out.println("felicidad perrito: " + perrito.felicidad);
		System.out.println("felicidad gatico: " + cat.happiness);

	}

}
