package controller;

import java.util.Scanner;

import model.data_structures.Node;
import model.logic.MVCModelo;
import view.MVCView;

public class Controller {

	/* Instancia del Modelo*/
	private MVCModelo modelo;

	/* Instancia de la Vista*/
	private MVCView view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller()
	{
		view = new MVCView();
		modelo = new MVCModelo();
	}

	/**
	 * Hilo de ejecución del programa
	 */
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;

		while( !fin )
		{
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				System.out.println("--------- \nCargar archivo \nDar numero del trimestre: ");
				int numeroTrimestre = lector.nextInt();
				if(numeroTrimestre == 1 || numeroTrimestre == 2)
				{
					modelo = new MVCModelo();
					try
					{
						modelo.cargarArchivoCSV(numeroTrimestre);
						System.out.println("Archivo cargado");
						System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");
					}
					catch (Exception e)
					{
						System.out.println("Se ha producido un error al cargar el archivo\n---------");
					}
				}
				else
				{
					System.out.println("Ingrese un valor válido (1 o 2)\n---------");	
				}
				break;

			case 2:
				System.out.println("--------- \nDar cadena (simple) a ingresar: ");
				//dato = lector.next();
				//modelo.agregar(dato);
				System.out.println("Dato agregado");
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;

			case 3:
				System.out.println("--------- \nDar mes a buscar: ");
				double mes = lector.nextInt();
				System.out.println("--------- \nDar id zona de origen a buscar: ");
				double zonaOrigen = lector.nextInt();
				Node lista = modelo.busquedaPorMesYZonaOrigen(mes, zonaOrigen);
				if (lista == null)
				{
					System.out.println("No hay viajes registrados con las condiciones dadas.\n---------");
				}
				else
				{
					while(lista != null)
					{
						Double[] datos = (Double[]) lista.darDato();
						System.out.println("Id zona de origen: " + datos[0] + "\nId zona de destino: " + datos[1] + "\nTiempo promedio: " + datos[3] + "\nDesviación estandar: " + datos[4] + "\n---------");
						lista = lista.darSiguente();
					}
				}
				break;

			case 4:
				System.out.println("El número de viajes reportados en el semestre es: " + modelo.darTamano() + "\n---------");						
				break;

			case 5:
				if(modelo.darTamano() == 0)
				{
					System.out.println("No hay viajes registrados en ningún mes\n---------");
				}
				else
				{
					System.out.println("--------- \nDar mes a buscar: ");
					double mesABuscar = lector.nextInt();
					double cantidad = modelo.numeroViajesSegunMes(mesABuscar);
					System.out.println("El número de viajes reportados en el mes es: " + cantidad + "\nEl porcentaje respecto al total de viajes del semestre es: "+ (cantidad/modelo.darTamano())*100 + "\n---------");
				}
				break;
				
			case 6:
				if(modelo.darTamano() == 0)
				{
					System.out.println("No hay viajes registrados en ningún mes\n---------");
				}
				else
				{
					System.out.println("--------- \nDar mes a buscar: ");
					double mesABuscar = lector.nextInt();
					System.out.println("--------- \nDar id zona de origen a buscar: ");
					double zonaDeOrigen = lector.nextInt();
					double cantidad = modelo.numeroViajesSegunMesYZonaOrigen(mesABuscar, zonaDeOrigen);
					System.out.println("El número de viajes reportados en el mes es para esa zona es: " + cantidad + "\nEl porcentaje respecto al total de viajes del mes es: "+ (cantidad/modelo.numeroViajesSegunMes(mesABuscar))*100 + "\n---------");
				}
				break;
				
			case 7: 
				System.out.println("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			default: 
				System.out.println("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}
	}	
}