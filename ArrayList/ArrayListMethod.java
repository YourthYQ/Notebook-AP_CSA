package Note.ArrayList;

import java.util.*;

//add(), set(), get(), remove(), size()
public class ArrayListMethod {

    public static void main(String[] args) {

        //new ArratList
        ArrayList<String> arrList = new ArrayList<String>();

        ArrayList<String> arrListI = new ArrayList<>();
        List<String> arrListII = new ArrayList<String>();


        // ArrayList.add(E element)
        /* 在已有的列表末尾加上一个E类型对象element(其返回值永远为true)
           如若element与声明的E类型不匹配(element不为E类型)，则抛出ClassCastException
         */
        arrList.add("Hello");
        arrList.add("World");
        arrList.add("Java");
        System.out.println(arrList);

        // ArrayList.add(int index, E element)
        /* 将E元素插入到index下标处，并将原来下标为index及以上的元素向后移动一个位置(即下标index + 1)，List.size() + 1
           如若index = ArrayList.size()，则等同于ArrayList.add(E element)，即在列表的末尾加上一个E类型对象
           如若index > ArrayList.size()，则抛出IndexOutOfBoundsException
        */
        arrList.add(1,"JavaSE");//index = ArrayList.size()
        arrList.add(4,"iPhone SE");//原本是 index > ArrayList.size()
        System.out.println(arrList);

        // ArrayList.set(int index, E element)
        /* 将下标为index的元素替换为element，并返回原先index下标处的元素
           如若element不是E元素，则抛出ClassCastException
         */
        System.out.println(arrList.set(3,"Yo"));//返回原先index下标处的元素
        System.out.println(arrList);

        // ArrayList.remove(int index)
        /* 删除并返回下标为index的元素
           被删除元素右边的所有元素向左挪一位(index - 1)
           ArrayList.size() - 1
         */
        System.out.println(arrList.remove(3));
        System.out.println(arrList);

        // ArrayList.size()
        int listSize = arrList.size();
        System.out.println(listSize);

        // ArrayList.get(int index)
        // 返回下标为index的元素，类似于String中的charAt
        String thirdOfList = arrList.get(3);
        System.out.println(thirdOfList);

    }

}
