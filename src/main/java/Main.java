public class Main {
    public  static void main(String[] args) {
        System.out.println("Hello World");

        // gib ein Passwort ein

        // checke passwort
        isValid("test");

    }

    // Passwort Methoden

    // Minimum Länge prüfen
    public static boolean hasMinLength(String password, int min){
        if(Main.isNullOrEmpty(password)){return false;}
        else if(password.length() < min){return false;}
        else if(password.length() >= min){return true;}
        else{return false;}
    }

    // Auf min. eine Ziffer Prüfen
    public static boolean containsDigit(String password){
        if(Main.isNullOrEmpty(password)){return false;}
        else {
            boolean flag = false;
            for(int i = 0; i < password.length(); i++){
                char character = password.charAt(i);
                if(Character.isDigit(character)){flag = true;}
            }
            return flag;
        }
    }


    public static boolean containsUpperAndLower(String password){return true;}
    public static boolean isCommonPassword(String password){return true;}
    public static boolean containsSpecialChar(String password, String allowed){return true;}
    public static boolean isValid(String password){return true;}


    // Hilfsmethode
    public static boolean isUnderMaximumLength(String password, int max){
        if(Main.isNullOrEmpty(password)){return false;}
        else if(password.length() < max){return true;}
        else{return false;}
    }


    public static boolean isNullOrEmpty(String password){
        if(password==null || password.isEmpty() || password.isBlank()){
            return true;
        }
        else{return false;}
    }
}
