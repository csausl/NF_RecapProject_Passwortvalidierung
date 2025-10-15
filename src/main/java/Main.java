public class Main {
    public  static void main(String[] args) {
        System.out.println("Hello World");

        // gib ein Passwort ein

        // checke passwort
        isValid("test");

    }

    // Passwort Methoden
    public static boolean hasMinLength(String password, int min){
        if(password==null || password.isEmpty() || password.isBlank()){return false;}
        else if(password.length() < min){return false;}
        else if(password.length() >= min){return true;}
        else{return false;}
    }


    public static boolean containsDIgit(String password){return true;}
    public static boolean containsUpperAndLower(String password){return true;}
    public static boolean isCommonPassword(String password){return true;}
    public static boolean containsSpecialChar(String password, String allowed){return true;}
    public static boolean isValid(String password){return true;}

}
