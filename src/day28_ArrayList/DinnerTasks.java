package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DinnerTasks {
    public static void main(String[] args) {
        /*
        1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(list.size() - 1, 0);
        System.out.println(list);
      /*
      2. write a program that can swap the first and last elements
      of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
          */
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.set(0, 5);
        list2.set(4, 1);
        System.out.println(list2);
        /*
        3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
         */
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list3);
        for (int i = 0; i < list.size(); i++) {
            if (list2.get(i) % 2 != 0) {
                list3.set(i, list3.get(i) * 2);
            }
        }
        System.out.println(list3);

/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> merge = new ArrayList<>();
        for (String each3 : arr1) {
            merge.add(each3);
        }
        for (String each4 : arr2) {
            merge.add(each4);

        }
        System.out.println(merge);

        /*
        5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
         */
        ArrayList<Integer> listik = new ArrayList<>();
        listik.addAll(Arrays.asList(15, 5, 100, 4, 700));
        System.out.println(listik);
        int max = listik.get(0);
        for (int i = 0; i < listik.size(); i++) {
            int each = listik.get(i);
            if (each > max) {
                max = each;
            }

        }
        System.out.println(max);

        int min = listik.get(0);
        for (int i = 0; i < listik.size(); i++) {
            int each = listik.get(i);
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        System.out.println(numbers);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list) {
            if (result.contains(each)) {
                
            }
            result.add(each);
        }
        System.out.println(result);
    }






    }











