package model;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Provincia {
	@SerializedName("CODPROV")
	private String codigoProvincia;
	@SerializedName("NOMBRE_PROVINCIA")
	private String nombreProvincia;
	@SerializedName("CAPITAL_PROVINCIA")
	private String capitalProvincia;
	
}

