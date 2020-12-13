public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public set(int index, T value){
    super.remove(index);
    super.add(index, value);
  }
}
