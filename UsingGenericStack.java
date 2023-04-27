
public class UsingGenericStack {
	
	public static void main(String[] args) {
		//Generic instantiation using an actual concrete type String
		GenericStack<String> names = new GenericStack<String>();
		
		names.push("George");
		names.push("Marvin");
		names.push("Abominable Snowman");
		
		System.out.println(names);
		
		//Generic type must be a reference type
		GenericStack<Integer> nums = new GenericStack<>();
		nums.push(1);        //autoboxing
		nums.push(2);
		nums.push(3);
		System.out.println(nums);
		
		//static array for our method below
		Integer[] numbers = new Integer[4];
		numbers[0] = 3;
		numbers[1] = 0;
		numbers[2] = 1029;
		numbers[3] = 90;
		
		print(numbers);
		
	}
	
	public static <E> void print(E[] s) { //works for all sorts of arrays of whatever
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
