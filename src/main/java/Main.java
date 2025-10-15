public class Main {
    public  static void main(String[] args) {
        System.out.println("Hello World");

        // gib ein Passwort ein
        String pw = "Neuefische1";

        // checke passwort
        if(isValid(pw)) System.out.println("come in");
        else System.out.println("nope");


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

    public static boolean containsUpperAndLower(String password){
        if(Main.isNullOrEmpty(password)){return false;}
        else if(password.length() < 2){return false;}
        else {
            boolean upperFlag = false;
            boolean lowerFlag = false;
            for(int i = 0; i < password.length(); i++){
                char character = password.charAt(i);
                if(Character.isUpperCase(character)){upperFlag = true;}
                else if(Character.isLowerCase(character)){lowerFlag = true;}
            }
            return upperFlag && lowerFlag;

        }
    }

    public static boolean isCommonPassword(String password){
        String[] common={"password", "Passwort1", "12345678", "Aa345678","Neuefische1"};

        boolean flag=false;
        if(Main.isNullOrEmpty(password)){return false;}
        else{
            for(String pw : common){
                if(pw.equals(password)){flag=true;}
            }
        }
        return flag;
    }


    public static boolean containsSpecialChar(String password, String allowed){return true;}


    public static boolean isValid(String password){
        boolean flag=false;
        int minimumLength=8;
        if(Main.isNullOrEmpty(password)){return false;}
        else if(
                Main.hasMinLength(password, minimumLength) &&
                Main.containsDigit(password) &&
                Main.containsUpperAndLower(password) &&
                !Main.isCommonPassword(password)
        ){
            flag=true;
        }
        return flag;
    }


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
