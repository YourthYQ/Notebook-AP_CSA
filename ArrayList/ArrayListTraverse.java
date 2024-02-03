package Note.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTraverse {

    public static void main(String[] args) {


        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Hello");
        arrList.add("World");
        arrList.add("Java");
        System.out.println(arrList);
        for (int i = 0; i < arrList.size();i++) {
            System.out.println(arrList.get(i));
        }


        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.println(arr[i]);
        }
        ArrayList<Integer> arrListI = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arrListI.add(arr[i]);
        }
        System.out.println(arrListI);


    }

}
