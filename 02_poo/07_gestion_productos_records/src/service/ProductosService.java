package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import model.Producto;

public class ProductosService {
	private String ruta="/ficheros-tarde/productos.txt";
	public void guardar(Producto producto) {
		String linea=producto.nombre()+","+producto.codigo()+","+producto.precio()+","+producto.categoria();
		try (FileOutputStream fos=new FileOutputStream(ruta, true);
				PrintStream out=new PrintStream(fos);){
			out.println(linea);		
		}		
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Producto buscar(String codigo) {	
		Producto resultado=null;
		try( 
			FileReader fr=new FileReader(ruta); 
			BufferedReader br=new BufferedReader(fr) 
			){
				
			String linea=br.readLine();
			while(linea!=null) {
				
				String[] datos = linea.split(",");
				if(datos[1].equals(codigo)) {
					resultado= new Producto(datos[0],datos[1],Double.parseDouble(datos[2]),datos[3]);
					break;
				}				
				linea=br.readLine();
			}
				
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
	
	public ArrayList<Producto> buscarPorCategoria(String categoria){
		ArrayList<Producto> resultado = new ArrayList<>();		
		try( 
			FileReader fr=new FileReader(ruta); 
			BufferedReader br=new BufferedReader(fr) 
			){
				
			String linea=br.readLine();
			while(linea!=null) {
				
				String[] datos = linea.split(",");
				if(datos[3].equals(categoria)) {
					resultado.add(new Producto(datos[0],datos[1],Double.parseDouble(datos[2]),datos[3]));
				}				
				linea=br.readLine();
			}
				
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
}
