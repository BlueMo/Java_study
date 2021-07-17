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
		
		/*stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.print("\n");
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s + "\t"));
		System.out.print("\n");
		sList.stream().filter(s->s.length()>3).forEach(s->System.out.print(s + "\t"));*/
		
		System.out.println(stream.reduce("", (s1, s2) ->
				{if (s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;}));
		
		String str = sList.stream().reduce(new CompareString()).get();
		System.out.println(str);
	}
}
