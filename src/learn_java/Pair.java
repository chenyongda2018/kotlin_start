package learn_java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pair {


   public List<? extends Object> getList() {
       List<String> list = new ArrayList<>();
       list.add("cyd");
       return list;

   }

    public static void main(String[] args) {
        List<? extends Object> list = new ArrayList<>();
        list.get(0);

       // List<Number> numberList = new ArrayList<>();
       // numberList.addAll(new ArrayList<String>());

        List list1 = new Pair().getList();
        list1.add("asdasd");

    }


}
