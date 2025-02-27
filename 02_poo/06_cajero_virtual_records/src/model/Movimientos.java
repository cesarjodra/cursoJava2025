package model;

import java.time.LocalDateTime;

public record Movimientos(double cantidad, LocalDateTime fecha, String tipo) {

}
