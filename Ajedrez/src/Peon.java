
public class Peon extends Ficha{

	public Peon(boolean color) {
		super(color);
	}

	@Override
	public void mover() {
		//setY(getY()+1);
		//Cambiar la posici�n en la matriz
		//Si esa posici�n est� ocupada no se puede mover porque eso ser�a comer
		
		//Si esa posici�n est� ocupada por una ficha contraria, puede remplazar la ficha en la matriz
		//si el movimeinto es en diagonal hacia adelante
		//de lo contrario si est� ocupada por una ficha rival y el movimeinto no es en diagonal ascendente no se puede mover
	}

}
