package model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Pais {
	private String name;
	private String region;
	private String capital;
	private long population;
	
	// si no coincide tu nombre con el JSON, añades una anotación antes	
	@SerializedName("nativeName")
	private String nombreNativo;
	
	
	
}
