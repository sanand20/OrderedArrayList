import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set (int index, T value){
    if (value == null){
      throw new IllegalArgumentException("error: value is null");
    }
    return super.set(index, value);
}
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("error: value is null");
      
    }
    super.add(value);
    return true;
  }
  public static void main(String[] args){
    //Holder<Integer> data = new Holder<Integer>();
    NoNullArrayList<Integer> test = new NoNullArrayList<Integer>();
    System.out.println();

  }
}
