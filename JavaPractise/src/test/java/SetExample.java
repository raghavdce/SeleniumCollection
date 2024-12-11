import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<Integer> set = new HashSet<>();
			set.add(0);
			set.add(1);
			set.add(2);
			set.add(3);
			set.add(4);
			set.add(5);
			
			for(int i : set) {
				System.out.println(i);
			}
			
	}

}
