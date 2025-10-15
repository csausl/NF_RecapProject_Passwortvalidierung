//import java.util.Locale;

public class Main {
    public  static void main(String[] args) {
        System.out.println("Hello World");



        // ein kommentar in Master Branch

        // gib ein Passwort ein
        String pw = "Neuefische1";
        //String eingabe="hallo";
        //eingabe = eingabe == null ? "" : eingabe.trim().toLowerCase(Locale.ROOT);
        // checke passwort
        if(isValid(pw)) System.out.println("come in");
        else System.out.println("nope");

        // ein kommentar in dev branch
    }

    // Passwort Methoden

    // Minimum Länge prüfen
    public static boolean hasMinLength(String password, int min){
        if(Main.isNullOrEmpty(password)){return false;}
        else return password.length() >= min;
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
        String[] commonList={"password", "Passwort1", "12345678", "Aa345678","Neuefische1"};

        boolean flag=false;
        if(Main.isNullOrEmpty(password)){return false;}
        else{
            for(String commonItem : commonList){
                if(commonItem.equals(password)){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }





    public static boolean isValid(String password){
        boolean flag=false;
        int minimumLength=8;
        int maximumLength=32;
        //String allowedSpecialChars="!@#$%^&*()-_+=?.,;:";
        if(Main.isNullOrEmpty(password)){return false;}
        else if(
                Main.hasMinLength(password, minimumLength) &&
                Main.isUnderMaximumLength(password, maximumLength) &&
                Main.containsDigit(password) &&
                Main.containsUpperAndLower(password) &&
                //Main.containsSpecialChar(password, allowedSpecialChars) &&
                !Main.isCommonPassword(password)
        ){
            flag=true;
        }
        return flag;
    }

    // request for comments
    public static boolean containsSpecialChar(String password, String allowed){
        //check if a char in password is equal to allowed list of special chars
        char[] passwordChars=password.toCharArray();
        char[] allowedChars=allowed.toCharArray();
        boolean flag=false;
        for (char passwordChar : passwordChars) {
            for (char allowedChar : allowedChars) {
                if (passwordChar == allowedChar) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }


    // Hilfsmethode
    public static boolean isUnderMaximumLength(String password, int max){
        if(Main.isNullOrEmpty(password)){return false;}
        else return password.length() < max;
    }


    public static boolean isNullOrEmpty(String password){
        return password == null || password.isBlank();
    }
}
