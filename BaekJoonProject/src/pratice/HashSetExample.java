package pratice;

import java.util.HashSet;



public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(1);
		h.add(1);
		h.add(2);
		h.add(2);
		h.add(2);
		h.add(3);
		h.add(12);
		
		System.out.println(h);
		System.out.println(h.size());
		h.remove(3);
		System.out.println(h);
		System.out.println(h.size());
		h.clear();
		System.out.println(h);
		System.out.println(h.size());

	}

}
