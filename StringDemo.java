public class StringDemo {

    public static void main(String args[]) {

        System.out.println("STRING DEMO--");

        String s1 = new String("Sjpcs");
        String s2 = "sjp ";
        String s3 = "";

        System.out.println("the string s1=" + s1); 
        System.out.println("the string s2=" + s2);
        System.out.println("Char at =" + s2.charAt(2));
        System.out.println("the length of the string s1=" + s1.length());
        System.out.println("SubString Begin index =" + s1.substring(1));
        System.out.println("SubString Begin & end index=" + s1.substring(1, 4));
        System.out.println("s1 equals s2 is=" + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase s2 is=" + s1.equalsIgnoreCase(s2));
        System.out.println("check isempty=" + s3.isEmpty());
        System.out.println("s1 concatination s2 is=" + s1.concat(s2));
        System.out.println("the length of the string s1=" + s1.length()); 
        System.out.println("Replace=" + s1.replace("S", "A"));

        System.out.println("Lower case is=" + s1.toLowerCase());
        System.out.println("Upper case is=" + s1.toUpperCase());
    }
}