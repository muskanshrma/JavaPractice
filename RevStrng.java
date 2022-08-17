package JavaPractice;

public class RevStrng {
    public static void main(String[] args) {
        String str= "abcd", nstr="";
        char ch;

        System.out.print("Original word:" + str);
        System.out.println("");

        for (int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.print("Reversed word:" + nstr);
    }
}
