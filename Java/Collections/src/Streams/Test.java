package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int arr[] = {5,3,21,1,5,7,9,5,2,4,5,7};
        String str[] = {"Thank you"," Hi There"," Okay now"};

        Optional<String> opstr = Arrays.stream(str).reduce((first,second)->first+"-"+second);
        if(opstr.isPresent()){
            System.out.println(opstr);
        }
        //IntStream.of(arr).sorted().skip(arr.length-3).forEach(System.out::println);Max 3
       // IntStream.of(arr).distinct().sorted().limit(3).forEach(System.out::println);//Min 3
        IntStream.of(arr).filter(n-> n%2==1).forEach(System.out::println);
        Arrays.stream(arr).filter(k->k%2==0).forEach(k-> System.out.println(k));
        Arrays.stream(str).forEach(k->System.out.println(k));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice", "Eve", "Bob", "Frank");

		// 1. filter: keep names starting with 'A'
		List<String> filtered = names.stream()
				.filter(s -> s.startsWith("A"))
				.collect(toList());
		System.out.println("filter: " + filtered);  // [Alice, Alice]

		// 2. max: find longest name
		Optional<String> maxName = names.stream()
				.max(Comparator.comparingInt(String::length));
		maxName.ifPresent(s -> System.out.println("max (longest name): " + s));

		// 3. map: convert names to uppercase
		List<String> upper = names.stream()
				.map(String::toUpperCase)
				.collect(toList());
		System.out.println("map (uppercase): " + upper);

		// 4. reduce: concatenate all names with comma
		String concatenated = names.stream()
				.reduce("", (a,b) -> a.isEmpty() ? b : a + "," + b);
		System.out.println("reduce (concatenated): " + concatenated);

		// 5. sorted: sort names alphabetically
		List<String> sorted = names.stream()
				.sorted()
				.collect(toList());
		System.out.println("sorted: " + sorted);

		// 6. boxed: convert IntStream to Stream<Integer>
		IntStream intStream = IntStream.range(1, 5); // 1,2,3,4
		Stream<Integer> boxed = intStream.boxed();
		System.out.println("boxed: " + boxed.collect(toList()));  // [1, 2, 3, 4]

		// 7. mapToInt: map strings to their lengths as IntStream
		int totalLength = names.stream()
				.mapToInt(String::length)
				.sum();
		System.out.println("mapToInt + sum (total length): " + totalLength);

		// 8. collect: frequency count of each name
		Map<String, Long> frequency = names.stream()
				.collect(groupingBy(s -> s, counting()));
		System.out.println("frequency (count): " + frequency);

		// 9. collect: group names by length
		Map<Integer, List<String>> groupByLength = names.stream()
				.collect(groupingBy(String::length));
		System.out.println("groupingBy length: " + groupByLength);

		// 10. collect: partition names by length > 3
		Map<Boolean, List<String>> partitioned = names.stream()
				.collect(partitioningBy(s -> s.length() > 3));
		System.out.println("partitioningBy length > 3: " + partitioned);

		// 11. distinct: unique names only
		List<String> distinctNames = names.stream()
				.distinct()
				.collect(toList());
		System.out.println("distinct: " + distinctNames);

		// 12. limit & skip: first 3 names after skipping 2
		List<String> limitedSkipped = names.stream()
				.skip(2)
				.limit(3)
				.collect(toList());
		System.out.println("skip 2 and limit 3: " + limitedSkipped);

		// 13. anyMatch / allMatch / noneMatch
		boolean anyStartsWithA = names.stream().anyMatch(s -> s.startsWith("A"));
		boolean allStartWithA = names.stream().allMatch(s -> s.startsWith("A"));
		boolean noneStartsWithZ = names.stream().noneMatch(s -> s.startsWith("Z"));
		System.out.println("anyMatch starts with A: " + anyStartsWithA);
		System.out.println("allMatch starts with A: " + allStartWithA);
		System.out.println("noneMatch starts with Z: " + noneStartsWithZ);

		// 14. findFirst / findAny
		names.stream()
				.filter(s -> s.startsWith("B"))
				.findFirst()
				.ifPresent(s -> System.out.println("findFirst starting with B: " + s));

		names.stream()
				.filter(s -> s.startsWith("B"))
				.findAny()
				.ifPresent(s -> System.out.println("findAny starting with B: " + s));

		// 15. peek (debugging intermediate operation)
		List<String> peeked = names.stream()
				.peek(s -> System.out.println("peek: " + s))
				.filter(s -> s.length() > 3)
				.collect(toList());

		// 16. flatMap example: flatten List<List<String>>
		List<List<String>> nested = Arrays.asList(
				Arrays.asList("a", "b"),
				Arrays.asList("c", "d", "e")
		);
		List<String> flat = nested.stream()
				.flatMap(Collection::stream)
				.collect(toList());
		System.out.println("flatMap: " + flat);

		// 17. Collectors joining (concatenate with delimiter)
		String joined = names.stream()
				.distinct()
				.collect(joining(", "));
		System.out.println("joining distinct names: " + joined);

		// 18. Collectors toSet()
		Set<String> namesSet = names.stream()
				.collect(toSet());
		System.out.println("toSet: " + namesSet);

		// 19. Collectors toMap() (name -> length)
		Map<String, Integer> nameLengthMap = names.stream()
				.distinct()
				.collect(toMap(s -> s, String::length));
		System.out.println("toMap: " + nameLengthMap);

		// 20. Collectors summarizingInt (statistics on lengths)
		IntSummaryStatistics stats = names.stream()
				.collect(summarizingInt(String::length));
		System.out.println("summarizingInt: " + stats);

		// 21. reduce with identity and accumulator (sum of name lengths)
		int sumLength = names.stream()
				.map(String::length)
				.reduce(0, Integer::sum);
		System.out.println("reduce sum length: " + sumLength);



    }
}
