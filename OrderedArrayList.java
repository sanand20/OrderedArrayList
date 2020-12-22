public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public int findIndex(T newVal){
    if (newVal == null){
      throw new IllegalArgumentException("error: value is null");
    }
      for (int i = 0; i < size(); i++) {
      if (newVal.compareTo(this.get(i)) <= 0) {
          return i;
      }
    }
    return size();


  }

  public void add(int index, T newVal) {
      int index1 = findIndex(newVal);
      super.add(index1, newVal);
    }
  public boolean add(T newVal) {
      int index = findIndex(newVal);
      super.add(index, newVal);
      return this.get(index) == newVal;
    }



  public T set(int index, T value){
    if(value == null)
    throw new IllegalArgumentException();
    T ans = get(index);
    remove(index);
    add(value);
    return ans;
  }



}
