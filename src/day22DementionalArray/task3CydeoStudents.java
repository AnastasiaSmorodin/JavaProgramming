package day22DementionalArray;

public class task3CydeoStudents {
    public static void main(String[] args) {


        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
String[][]batch25Groups={{"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"},
        {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"},
        {"Fady", "Break", "Clock", "Cihad", "Muhtar"}};
        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
String[][]batch24Groups={batch24Group1,batch24Group2,batch24Group3};
String[][][]cydeoStudents={batch25Groups,batch24Groups};
        for (String[][]eachbatch : cydeoStudents) {
            for (String[] group : eachbatch) {
                for (String student : group) {
                    System.out.print(student+" ");


                }
                System.out.println();
            }

        }



           }

    }

