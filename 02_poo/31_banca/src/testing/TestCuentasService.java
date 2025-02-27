package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CuentasService;

class TestCuentasService {
	static CuentasService cuentasService;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuentasService=new CuentasService();
	}

	@Test
	void testCuentaExiste() {
		assertTrue(cuentasService.cuentaExiste("ES1420800222823000247854"));
		assertFalse(cuentasService.cuentaExiste("001122334455"));
	}

	@Test
	void testMismaDivisa() {
		assertEquals(2, cuentasService.mismaDivisa("EUR")); 
		assertEquals(0, cuentasService.mismaDivisa("BIT")); 
	}

	@Test
	void testSaldoMedioFecha() {
		assertTrue(cuentasService.saldoMedioFecha(LocalDate.of(2024,04,14))<1);
		assertTrue(cuentasService.saldoMedioFecha(LocalDate.of(2000,01,01))>1500000);
	}

	@Test
	void testCuentaAsociada() {
		assertNotNull(cuentasService.cuentaAsociada("ES3520800014523000687719"));
		assertEquals(9465.59, cuentasService.cuentaAsociada("ES3520800014523000687719").getSaldo());
	}

	@Test
	void testMayorSaldo() {
		assertEquals("ES4720800136253000145866", cuentasService.mayorSaldo().getNumeroCuenta());
	}

}
