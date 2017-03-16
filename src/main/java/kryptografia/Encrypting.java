package kryptografia;

/**
 * Created by RENT on 2017-03-04.
 */
public class Encrypting {
    public static String caesar(String text, int offset){
        if(text==null)
            return null;
        char [] chars=text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i]+=offset;
        }

        return new String (chars);
    }

    public static String vigenere(String text, String kluczSzufrujacy){
        char[] textChars=text.toCharArray();
        char []passwordCHar=new char[text.length()];
        char [] correctLengthPassword=new char[text.length()];
        for (int i = 0; i <correctLengthPassword.length ; i++) {
            correctLengthPassword[i]=passwordCHar[i%passwordCHar.length];
        }
        return "ko";
    }

    public static char[][] generateVigenereArray(){
        char[][] arrray = new char[26][26];

        for (int i = 0; i < arrray.length; i++) {
            for (int j = 0; j < arrray[0].length; j++) {
                arrray[i][j] = (char) (97 + (j + i) % 26);
            }
        }

        return arrray;
    }

    public static void main(String[] args) {
        String slowo="ABCD";
        int x=1;
        System.out.println(caesar(slowo,x));
        vigenere("a","a");
    }
}
