package principal;

import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		
		Date f1=new Date();
		Date f2=new Date(993211654565L);
		
		//System.out.println(f1);
		//System.out.println(f2);

		// Mostrar la que sea posterior
		
		if(f1.after(f2)) {
			System.out.println(f1);
		}
		else {
			System.out.println(f2);
		}
		
	}

}
