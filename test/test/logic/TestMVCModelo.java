package test.logic;

import static org.junit.Assert.*;

import model.data_structures.Node;
import model.logic.MVCModelo;

import org.junit.Before;
import org.junit.Test;

public class TestMVCModelo
{	
	private MVCModelo modelo;

	@Before
	public void setUp()
	{
		modelo= new MVCModelo();
		
	}

	//Está así para que no se ejecute, son muchos elementos
	/**
	@Test
	public void testCargarArchivoCSV()
	{
		try
		{
			modelo.cargarArchivoCSV(1);
			assertTrue("Deberian haber elementos", modelo.darTamano()>1000000);
		}
		catch (Exception e)
		{
			fail("No debería mandar error");
		}
	}
	*/

	@Test
	public void testDarTamano()
	{
		// TODO Completar la prueba
		

	}	
	
	@Test
	public void testBusquedaPorMesYZonaOrigen()
	{
		Node respuesta = modelo.busquedaPorMesYZonaOrigen(1, 567);
		assertNull("La lista de la respuesta debería estar vacía y su primer nodo debería ser nulo.", respuesta);
	}

	@Test
	public void testNumeroViajesSegunMes()
	{
		// TODO Completar la prueba
	}

	@Test
	public void testNumeroViajesSegunMesYZonaOrigen()
	{
		// TODO Completar la prueba

	}
}