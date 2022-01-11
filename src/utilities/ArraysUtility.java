package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }
    //prints each double of double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }
    //prints each char of char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }

    }
    //returns the maximum number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
    //returns the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static boolean contains(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;

    }
    public static boolean contains(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }

        return result;
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element;

        return result;


    }
    public static String[] addElement(String[] array, String element) {
        String[] result2 = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result2[i++] = each;
        }

        result2[result2.length - 1] = element;

        return result2;


    }
    public static char[] addElement(char[] array, char element) {
        char[] result2 = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result2[i++] = each;
        }

        result2[result2.length - 1] = element;

        return result2;

    }

    public static int frequencyOfElement(int[] array,int element) {
        int count=0;
        for(int each: array){
            if(each==element){
                count++;
            } 
        }

    return count;
    }
    public static int frequencyOfElement(double[] array,double element) {
        int count=0;
        for(double each: array){
            if(each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(char[] array,char element) {
        int count=0;
        for(char each: array){
            if(each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(String[] array, String element) {
        int count=0;
        for(String each: array){
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }

    public static int[] uniqueElements(int[] array ){
        int[] result={};
        for(int each: array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static String[] uniqueElements(String[] array ){
        String[] result={};
        for(String each: array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static char[] uniqueElements(char[] array ){
        char[] result={};
        for(char each: array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static double[] uniqueElements(double[] array ){
        double[] result={};
        for(double each: array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static int[] removeElementsByIndex(int[]array,int index){
        if(index<0 || index>=array.length-1){
            System.err.println("Invalid Index :"+ index);
            System.exit(0);
        }
        int[]newArray= new int[array.length-1];
        int j=0;//for the index numbers of newArray
        for (int i=0; i< array.length; i++) {
            if(i==index){//if the element of array is matching with the element at given index
                continue;
            }
            newArray[j++]=array[i];
        }
        return newArray;
    }
    public static String[] removeElementsByIndex(String[]array,int index){
        if(index<0 || index>=array.length-1){
            System.err.println("Invalid Index :"+ index);
            System.exit(0);
        }
        String[]newArray= new String[array.length-1];
        int j=0;//for the index numbers of newArray
        for (int i=0; i< array.length; i++) {
            if(i==index){//if the element of array is matching with the element at given index
                continue;
            }
            newArray[j++]=array[i];
        }
        return newArray;
    }
    public static char[] removeElementsByIndex(char[]array,int index){
        if(index<0 || index>=array.length-1){
            System.err.println("Invalid Index :"+ index);
            System.exit(0);
        }
        char[]newArray= new char[array.length-1];
        int j=0;//for the index numbers of newArray
        for (int i=0; i< array.length; i++) {
            if(i==index){//if the element of array is matching with the element at given index
                continue;
            }
            newArray[j++]=array[i];
        }
        return newArray;
    }
    public static double[] removeElementsByIndex(double[]array,int index){
        if(index<0 || index>=array.length-1){
            System.err.println("Invalid Index :"+ index);
            System.exit(0);
        }
        double[]newArray= new double[array.length-1];
        int j=0;//for the index numbers of newArray
        for (int i=0; i< array.length; i++) {
            if(i==index){//if the element of array is matching with the element at given index
                continue;
            }
            newArray[j++]=array[i];
        }
        return newArray;
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result= {};
       for (int each : arr1) {
          result= addElement(result,each);
       }
       for(int each : arr2){
           result= addElement(result,each);
       }
        return  result;
    }
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result= {};
        for (char each : arr1) {
            result= addElement(result,each);
        }
        for(char each : arr2){
            result= addElement(result,each);
        }
        return  result;
    }
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = addElement(result, each);
        }
        for (String each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result= {};
        for (double each : arr1) {
            result= addElement(result,each);
        }
        for(double each : arr2){
            result= addElement(result,each);
        }
        return  result;
    }


    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }

    public static int[] replaceElement(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index:");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static double[] replaceElement(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index:");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static char[] replaceElement(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index:");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static String [] replaceElement(String[]array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index:");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }

        }
        return array;
    }


    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}


