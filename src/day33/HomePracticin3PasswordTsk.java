package day33;

public class HomePracticin3PasswordTsk {
    public static void main(String[] args) {
        String password= "Waterpolo88!";
        boolean r1= false;
        boolean r2= false;
        boolean r3= false;
        boolean r4= false;

        boolean passwordIsStrong=false;
        if(password.length()>=6 && !password.contains(" ")){
            for (int i = 0; i <password.length() ; i++) {
                char ch= password.charAt(i);
                if(ch>='A' && ch<='Z'){
                    r1= true;
                } else if(ch>='a' && ch<='z'){
                    r2=true;

                } else if(ch>=0 && ch<9){
                    r3= true;
                }
                else if(ch<'A' || ch>'Z' && ch<'a'|| ch>'z')
                    r4=true;
                }

if(r1&&r2&&r3&&r4==true){
    passwordIsStrong=true;
}else{
    passwordIsStrong= false;
}
            }
        System.out.println("passwordIsStrong="+ passwordIsStrong);
        }

    }

