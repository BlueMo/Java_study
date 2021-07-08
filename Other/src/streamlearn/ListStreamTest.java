package streamlearn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Moon");
		sList.add("Lee");
		sList.add("Kim");
		sList.add("Gang");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.print("\n");
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s + "\t"));
		System.out.print("\n");
		sList.stream().filter(s->s.length()>3).forEach(s->System.out.print(s + "\t"));
	}
}
