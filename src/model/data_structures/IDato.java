package model.data_structures;

public interface IDato<T extends Comparable <T>>
{
	/**
	 * Retornar el elemento 
	 * 
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	public T darElemento( );
	/**
	 * Cambia elemento
	 * @param elemento Nuevo elemento
	 */
	public void cambiarElemento(T elemento);
	
	/**
	 * Da el siguiente 
	 * @return el siguiente dato
	 */
	public dato darSiguente();
	
	/**
	 * Cambia el siguiente
	 */
	public void cambiaSiguiente(dato dato);

}
