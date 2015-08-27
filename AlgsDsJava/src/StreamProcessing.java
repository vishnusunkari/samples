import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamProcessing {

	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();

		items.add("one");
		items.add("two");
		items.add("three");

		Stream<String> stream = items.stream();
		System.out.println(stream.filter( item -> item.startsWith("o") ));

		//Stream.map()		
		items.stream().map( item -> item.toUpperCase() );
		
		//Stream.collect()
		List<String> filtered = items.stream()
			    .filter( item -> item.startsWith("o") )
			    .collect(Collectors.toList());
		
		// Stream.min() and Stream.max()
		 String shortest = items.stream()
			        .min(Comparator.comparing(item -> item.length()))
			        .get();
		 
		 //Stream.count()
		 long count = items.stream()
			     .filter( item -> item.startsWith("t"))
			     .count();
		 
		 //Stream.reduce()
		 String reduced2 = items.stream()
			        .reduce((acc, item) -> acc + " " + item)
			        .get();
		 
		

	}

}
