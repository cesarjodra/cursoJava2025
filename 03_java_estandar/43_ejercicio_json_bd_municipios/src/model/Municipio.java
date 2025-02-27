package model;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Municipio {
	@SerializedName("COD_GEO")
	private String codigoMunicipio;
	@SerializedName("NOMBRE")
	private String nombreMunicipio;
	@SerializedName("POBLACION_MUNI")
	private int poblacionMunicipio;
	@SerializedName("SUPERFICIE")
	private double superficieMunicipio;
	@SerializedName("ALTITUD")
	private int altitudMunicipio;
	@SerializedName("CODPROV")
	private String codigoProvincia;
}
