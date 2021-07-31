package com.misiontic.main;
import java.awt.Color;
public class Animal {
    
    double weight;
    int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
    int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
    int hungry;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
    int sleep; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
    boolean isSleep;
    
    //Tengo que dar una respuesta cuando termine de comer?
    //Yo quiero decir si ya termine de comer
    private void eat() {
        if(hungry <= 5) {
        	hungry = 0;
            System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
            health = health -2;
            weight =weight+2;
        }else {
        	hungry = hungry - 5;
        }
    }
    private void sleep() {
    	if (sleep <=5 ) {
    		sleep=0;
    		System.out.println("Estoy inperactivo ");
    		health = health -1;
    		
    	}
    	else {
    		sleep=sleep-10;
    		weight=weight-1;
    	}
        
    }
    private void makeExercise() {
    	if (sleep <40) {
    		System.out.println("que comienze el ejercicio");
    		health=health-3;
    		weight=weight -0.5;
    	}
    	else {
    		System.out.println("trata de descansar");	  
    		sleep=sleep-3;
    	}
    }
    private void play() {
    	if (happiness< 30) {
    		System.out.println("que empieze el juego");
    		happiness =happiness-5;
    	}
    	else {
    		System.out.println("");
    	}
    	
        
    }
    private void gotoVeterinary() {
    	health =health+2;
    	hungry= hungry -1;
    	
    }
    private void awake() {
    	
    }
    
}
