package model.data_structures;

public class Node<T> implements INode<T>
{
	/**
	 * Atributos de la clase
	 */
	private T dato;
	private Node siguiente;

	/**
	 * Contructor de la clase
	 */
	public Node()
	{
		dato = null; 
		siguiente = null;
	}

	public void asignarDato(T pDato) 
	{
		dato = pDato;
	}
	
	public void asignarSiguiente(Node pSiguiente) 
	{
		siguiente = pSiguiente;
	}
	
	public Node darSiguente()
	{
		return siguiente;
	}
	
	public T darDato()
	{
		return dato;
	}
}
