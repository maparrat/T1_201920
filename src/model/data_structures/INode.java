package model.data_structures;

public interface INode <T extends Comparable <T>>
{
	/**
	 * Retornar el numero de elementos en la lista
	 * @return
	 */
	int darTamano( );

	/**
	 * Retornar el elemento en la posicion i
	 * @param i posicion de consulta
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	public T darElemento( int i );

	/**
	 * 
	 * @param elemento Nuevo elemento
	 */
	public void agregar(T elemento);

	/**
	 * 
	 * @param dato Objeto de busqueda en el arreglo
	 * @return elemento encontrado en la lista (si existe). null si no se encontro el dato.
	 */
	public T buscar(T dato);

	/**
	 * Elimina un dato de la lista.
	 * @param dato Objeto de eliminacion en el arreglo
	 * @return dato eliminado
	 */
	public T eliminar( T dato );

}