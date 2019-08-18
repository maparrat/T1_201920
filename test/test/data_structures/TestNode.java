package test.data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.data_structures.Node;

public class TestNode
{
	private Node node;

	@Before
	public void setUp1() 
	{
		node= new Node();
		node.asignarDato("hola");

	}
	@Before
	public void setUp2() 
	{
		int x= 1;
		int y = 2;
		Node psig = new Node();
		node= new Node();
		node.asignarDato( x);
		node.asignarSiguiente(psig);
		psig.asignarDato(y);

	}
	@Test
	public void testNode() {
		assertTrue(node !=null);
		assertEquals("hola", node.darDato());
		assertEquals(null, node.darSiguente());
	}
	@Test
	public void testNode2() {
		setUp2();
		assertTrue(node !=null);
		assertEquals(1, node.darDato());
		assertEquals(2, node.darSiguente().darDato());
	}

}
