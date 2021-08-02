package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal();		
		dog.weight = 40;
		dog.happiness = 50;//va de 0 a 100, 0 es triste; 100 es feliz.
		dog.health = 25;//va de 0 a 100, 0 muerto, 100 muy saludable.
		dog.hungry = 4;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
		dog.sleep = 8; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
		
		/*
		Animal gatico = new Animal();
		gatico.hungry = 70;
		gatico.happiness = 70;
		*/
		
		System.out.println("el peso del perro es de : " + dog.weight);
		System.out.println("la felicidad del perro es de : " + dog.happiness);
		System.out.println("la salud del perro esta en : " + dog.health);
		System.out.println("porcentaje de hambre del perro es de: " + dog.hungry +"%");
		System.out.println("la energia del perro esta en: "+dog.sleep);
		

	}

}
