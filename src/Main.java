import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		// myList.add(0);
	
		 
		 Perimeter<Integer,Integer> perimeter = new Perimeter<>();
		 myList.add((perimeter.getWidth(5) * 2) +  (perimeter.getLength(4) * 2));
		 System.out.println(myList);
		// System.out.println((perimeter.getWidth(5) * 2) +  (perimeter.getLength(4) * 2));
		 
		 
		 Area<Integer, Integer> area = new Area<>();
		 myList.add((area.getLength(5) * area.getWidth(4)));
		 System.out.println(myList);
		//System.out.println(area.getLength(5) * area.getWidth(4));
		 
	}

}
