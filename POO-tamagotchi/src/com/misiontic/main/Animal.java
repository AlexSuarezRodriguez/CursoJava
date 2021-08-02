package com.misiontic.main;
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
    	if (sleep <=10 ) {
    		sleep=5;
    		System.out.println("Estoy inperactivo ");
    		health = health +1;	
    	}else {
    		sleep=sleep-3;
    		weight=weight-1;
    	}
    }
    private void makeExercise() {
    	if (sleep <40) {
    		System.out.println("que comienze el ejercicio");
    		health=health + 1;
    		weight=weight - 0.1;
    		hungry=hungry-2;
    	}else {
    		System.out.println("trata de descansar");	  
    		sleep=sleep-3;
    		weight=weight+1;
    		hungry=hungry-1;
    	}
    }
    private void play() {
    	if (happiness< 30) {
    		System.out.println("que empieze el juego");
    		happiness =happiness-1;
    		health=health + 1;
    	}else {
    		System.out.println("busca la manera de ser feliz");
    		hungry=hungry-2;
    		sleep=sleep-1;
    		happiness=happiness+2;	
    	}     
    }
    private void gotoVeterinary() {
    	health =health+2;
    	hungry= hungry +1;
    	happiness=happiness+1; 	
    }
    private void awake() {
    	
    }
    
}
