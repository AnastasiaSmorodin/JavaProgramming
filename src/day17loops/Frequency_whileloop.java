package day17loops;

public class Frequency_whileloop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency = 0;

        while(str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println("-------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat CAT";
        sentence = sentence.toLowerCase();
        int countCat = 0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;

        }
        System.out.println(countCat);
    }
}
