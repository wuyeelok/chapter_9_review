package ques.seventeen;

import java.util.List;
import java.util.Map;

public class MMMM {

	public static <T> T identity(T t) {
		return t;
	}

	public static void main(String[] ssss) {
		var map = Map.of(1, 2, 3, 6);
		var list = List.copyOf(map.entrySet());
		list.forEach(b -> System.out.println(b.getKey()));

		List<Integer> one = List.of(8, 16, 2);
		var copy = List.copyOf(one);
		copy.forEach(System.out::println);

		// list.replaceAll(x -> x * 2);
		one.replaceAll(x -> x * 2);
	}
}
