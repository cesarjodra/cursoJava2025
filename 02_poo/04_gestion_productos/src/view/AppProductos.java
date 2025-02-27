package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Producto;
import service.ProductosService;

public class AppProductos {
	static ProductosService productosService=new ProductosService();
	public static void main(String[] args) {
		int opcion;
		Scanner scan=new Scanner(System.in);
		do {
			//mostrar menú
			menu();
			opcion=Integer.parseInt(scan.nextLine());
			switch(opcion) {
				case 1->guardarProducto();
				case 2->buscarProductoCodigo();					
				case 3->buscarProductosCategoria();									
				case 4->System.out.println("Adios");
			}
			
		}while(opcion!=4);

	}
	static void menu() {
		System.out.println("1.- Nuevo producto");
		System.out.println("2.- Buscar por código");
		System.out.println("3.- Productos por categoría");
		System.out.println("4.- Salir");
	}
	static void guardarProducto() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce el nombre:");
		String nombre=scan.nextLine();
		System.out.println("Introduce código:");
		String codigo=scan.nextLine();
		System.out.println("Introduce precio: ");
		double precio=Double.parseDouble(scan.nextLine());
		System.out.println("Introduce categoria: ");
		String categoria=scan.nextLine();
		Producto producto=new Producto(nombre, codigo, precio, categoria);
		productosService.guardar(producto);
	}
	static void buscarProductoCodigo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce el código del producto que quieres buscar:");
		String codigo=scan.nextLine();
		Producto articulo = productosService.buscar(codigo);
		if(articulo!=null) {
			System.out.println(articulo.getNombre());
		}
		else {
			System.out.println("No hay resultados.");
		}
	}
	static void buscarProductosCategoria() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce la categoría que quieres buscar:");
		String categoria=scan.nextLine();
		ArrayList<Producto> productos = productosService.buscarPorCategoria(categoria);
		if(productos.size()>0) {
			for(Producto p:productos) {
				System.out.println(p.getNombre());
			}
		}
		else {
			System.out.println("No hay resultados.");
		}
		
	}
}
