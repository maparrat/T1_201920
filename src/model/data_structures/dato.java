package model.data_structures;

public class dato<T extends Comparable <T>> implements IDato<T>
{
	/**
	 * Atributos de la clase
	 */
	private T elemento;
	private dato siguiente;
	/**
	 * Constructor que cunado crea el dato lo esta agregando
	 */
	public dato(T elem)
	{
		elemento = elem;
		siguiente = null;
	}

	/**
	 * Retornar el elemento 
	 * 
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	public T darElemento() {

		return elemento;
	}

	/**
	 * Cambia elemento
	 * @param elemento Nuevo elemento
	 */
	public void cambiarElemento(T elem) {
		elemento = elem;

	}



	/**
	 * Da el siguiente 
	 * @return el siguiente dato
	 */
	public dato darSiguente() 
	{
		return siguiente;
	}

	/**
	 * Cambia el siguiente
	 */
	public void cambiaSiguiente(dato dt) {
		siguiente =  dt;

	}

}
