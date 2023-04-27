
public class GenericMath<E>{
	
	public void print(E x) {
		System.out.print(x);
	}
	
	public static <T extends Number> double average(T x, T y) { //generic method
		return (x.doubleValue()+y.doubleValue())/2;
	}
}
