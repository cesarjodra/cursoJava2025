import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> foods=new ArrayList<>(
				Arrays.asList("Chocolate","Milk","Honey"));
				foods.sort((f1,f2)->f1.length()-f2.length());
				foods.forEach(f->System.out.print(f+" ")); 

	}

}
