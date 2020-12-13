public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public T set(int index, T value){
    T ans = get(index);
    super.remove(index);
    super.add(index, value);
    return ans;
  }
}
