package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cuenta {
	private String numeroCuenta;
	private String titular;
	private LocalDate fechaApertura;
	private String divisa;
	private double saldo;
}
