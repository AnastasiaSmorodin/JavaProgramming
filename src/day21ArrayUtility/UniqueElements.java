package day21ArrayUtility;

public class UniqueElements {
    public static void main(String[] args) {
        String[]words={"Layan","Layan","Olga","Adam","Adam","Adam","Cihad","Cihad",
        "Oleksandr","Cydeo"};


        for (String each : words) {    //each stands for every single element from array like "cydeo"
            int count=0;
            for (String element : words) {//element also stands for each element
                if(element.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
        }

        }

    }
}
