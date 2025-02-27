package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ListNumber;

class TestListNumber {
	
	ListNumber lista;
	
	@BeforeEach
	void setUp() throws Exception {
		lista=new ListNumber();
		lista.add(5);
		lista.add(10);
		lista.add(15);
	}

	@Test
	void testAddInteger() {
		assertEquals(3, lista.size());
		lista.add(5);
		assertEquals(3, lista.size());
	}

	@Test
	void testSum() {
		assertEquals(30, lista.sum());
	}

	@Test
	void testAverage() {
		assertEquals(10, lista.average());
	}

	@Test
	void testEliminarDatos() {
		lista.eliminarDatos(n->n%2==0);
		assertEquals(2, lista.size());
	}

	@Test
	void testProcesaDatos() {
		List<Integer> aux=new ArrayList<>();
		lista.procesaDatos(a->aux.add(a));
		assertEquals(3, aux.size());
	}

}
