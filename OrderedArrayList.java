public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public int findIndex(T newVal){
    for (int i = 0; i < size(); i++) {
      if (newVal.compareTo(this.get(i)) < 0) {
          return i;
      }
    }
    return size();
  }

  public void add(int index, T newVal) {
      int index1 = findIndex(newVal);
      super.add(index1, newVal);
    }



  public T set(int index, T value){
    T ans = get(index);
    super.remove(index);
    super.add(index, value);
    return ans;
  }



}
