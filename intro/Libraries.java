package intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

class Pair<T> {
    T first;
    T second;

    Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

public class Libraries {
 public static void main(String[] args) {
   List<String> list =  new ArrayList<>();

   list.add("Hello");
   list.add("World!");

  for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
  }

  Map<String, Integer> map = new TreeMap<>();
  map.put("Suraj", 100);
  map.put("Suraj2", 300);

  for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " "+ entry.getValue());
  }

  // optional 

//   System.out.println(map.get("Shubham") > 20);

Optional<Integer> marks = Optional.ofNullable(map.get("Shubham"));

System.out.println(marks.isPresent() ? "skjdcfnk" : "jhdbcvfjd");

 }
}