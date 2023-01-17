package Collection;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> flowers = new ArrayList<>();
		
		flowers.add("Rose");
		flowers.add("lily");
		flowers.add("Lotus");
		flowers.add("Sunflower");
		flowers.add("Jasmin");
		
		System.out.println(flowers);
		
//		Iterator
		Iterator itr = flowers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
//			Adding one more element 
			
			flowers.add("Dasiy");
			System.out.println(flowers);
			
//			Adding the element in middle
			
			flowers.add(3, "Lavendar");
			System.out.println(flowers);
			
//			removing the element from arraylist
			
			flowers.remove(4);
			System.out.println(flowers);
			
//			replacing the element from arraylist
			
			flowers.set(1,"Butterfly pea");
			System.out.println(flowers);
			
//			delete all the element from arraylist
			
			flowers.clear();
			System.out.println(flowers);
			
		}

	}

}
