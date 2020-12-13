import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public static void main(String[] args){
    //Holder<Integer> data = new Holder<Integer>();
    NoNullArrayList<Integer> test = new NoNullArrayList<Integer>();
    System.out.println();

  }
}
