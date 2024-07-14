package collectionexample;
import java.util.List;
import java.util.ArrayList;
public class CollectionDemo {
     @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List l1 = new ArrayList();
		System.out.println(" " +l1.isEmpty());
		l1.add("Hello");
		l1.add(234);
		l1.add(45.23);
		l1.add('H');
		l1.add(100);
		System.out.println(" " +l1.isEmpty());
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(100);
		l2.add(150);
		l2.add(20);
		l2.add(29);
		System.out.println(l2);

	}

}
