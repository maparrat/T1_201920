package model.data_structures;

public class Node<T extends Comparable <T>> implements INode<T>
{
	/**
	 * Atributos de la clase
	 */
	private int tamanio;
	private dato primero;
	private dato siguiente;

	/**
	 * Contructor de la clase
	 */
	public Node()
	{
		tamanio = 0;
		primero = null; 
		siguiente = null;


	}	

	/**
	 * Retornar el numero de elementos en la lista
	 * @return
	 */
	public int darTamano() {
		int i = 0;
		if (primero != null)
		{
			dato x = primero;
			i++;
			while(x.darSiguente() != null)
			{
				i++;
				x = (dato) x.darSiguente();
			}
		}
		tamanio = i;
		return i;
	}

	/**
	 * Retornar el elemento en la posicion i
	 * @param i posicion de consulta
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	public T darElemento(int i) {
		T r = null; 	
		int t = this.darTamano();
		if(i <= t)
		{
			dato x = primero;
			boolean encontro = false;
			for(int j=0; j<t &&encontro == false; j++ )
			{ 
				if (j== i)
				{
					r = 	(T) x.darElemento()	;
					encontro = true;
				}
				x= (dato) x.darSiguente();
			}
		}
		
		return r;
	}


	/**
	 * 
	 * @param elemento Nuevo elemento
	 */
	public void agregar(T elemento) 
	{
		if(primero == null)
		{
			primero = new dato(elemento);	
		}
		else
		{
			dato x = primero;
			while(x.darSiguente()!= null)
			{
				x= (dato) x.darSiguente();
			}
			x.cambiaSiguiente(new dato(elemento));
		}

	}

	/**
	 * 
	 * @param dato Objeto de busqueda en el arreglo
	 * @return elemento encontrado en la lista (si existe). null si no se encontro el dato.
	 */
	public dato buscar(T elem) {
		dato encontrado = null;
		if(primero != null)
		{
			if (primero.darElemento().equals(elem))
			{
				encontrado= primero;
			}
			else
			{
				dato x = primero;
				while(x.darSiguente()!= null)
				{
					if(x.darElemento().equals(elem))
					{
						encontrado = x;
					}
				}
			}
		}
		return encontrado;

	}

	/**
	 * Elimina un dato de la lista.
	 * @param dato Objeto de eliminacion en el arreglo
	 * @return dato eliminado
	 */
	public T eliminar(T elem) {
		if(this.buscar(elem) != null) 
		{


			if (primero.darElemento().equals(elem))
			{
				primero = null;;
			}
			else
			{
				dato x = primero;
				while(x.darSiguente()!= null)
				{
					if(x.darSiguente().darElemento().equals(elem))
					{
						if(x.darSiguente().darSiguente() == null)
						{
							x.cambiaSiguiente(null);
						}
						else
						{
							x.cambiaSiguiente(x.darSiguente().darSiguente());
						}
					}
				}
			}

			return elem; 
		}
		else
		{
			return null; 
		}


	}
	/**
	 * Dar sigueiente Dato 
	 * @return el dato siguente 
	 */
	public dato darSiguente()
	{
		return siguiente;
	}

	/**
	 * Cambiar el primero 
	 */
	public void cambiarPrimero(dato dt) {

		primero = dt;
	}



	/**
	 * Da el primer dato
	 * @return el primer dato
	 */
	public dato darPrimero() {
		
		return primero;
	}





}
