
public class GenericStack<E> { //when this class is called, E is replaced with what you want. String, Int, Double, etc
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();

  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public void push(E o) {//If E was a string, it would be String o
    list.add(o);	//so this would add a string to the end of the arraylist
  }

  public E pop() {
    E o = list.get(getSize() - 1); //how many elements there are in the arraylist and gets the last one
    list.remove(getSize() - 1); //removes the last one(on the top of the stack)
    return o; //if a string, returns the last one (the top one)
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  @Override
  public String toString() {
	return "stack: " + list.toString();
  }
}
