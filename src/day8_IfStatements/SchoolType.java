package day8_IfStatements;

import java.sql.SQLOutput;

public class SchoolType {
    public static void main(String[] args) {
        byte number = 3;
        boolean a = number>=1 && number<=5;
        boolean b = number>=6 && number<=8;
        boolean c = number>=9 && number <=12;
        boolean d = number>=13 && number<=16;
        boolean e = number>=17 && number<=18;

        if(a){
            System.out.println("Elementary school");}
        if(b){
            System.out.println("Middle School");}
        if(c){
            System.out.println("High School");}
        if(d){
            System.out.println("College");}
        if(e){
            System.out.println("Grad School");}

        }
    }

