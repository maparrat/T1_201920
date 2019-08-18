package test.data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.data_structures.ArregloDinamico;
import model.data_structures.Node;

public class TestNode {
	private Node node;

	@Before
	public void setUp1() 
	{
		node= new Node();
		node.agregar( "hola");

	}
	@Before
	public void setUp2() 
	{
		int x= 1;
		int y = 2;
		node= new Node();
		node.agregar( x);
		node.agregar(y);

	}
	@Test
	public void testNode() {
		assertTrue(node !=null);
		assertEquals(1, node.darTamano());
		assertEquals("hola", node.darPrimero().darElemento());
	}
	@Test
	public void testNode2() {
	setUp2();
	assertTrue(node.darPrimero() !=null);
	assertEquals(2, node.darTamano());
	assertEquals(2, node.darPrimero().darSiguente().darElemento());
}

}
