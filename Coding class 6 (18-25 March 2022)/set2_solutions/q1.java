public class q1 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        System.out.println("1st method --> "+str2);
        // or 
        reverseStr(str);

    }

    private static void reverseStr(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str.charAt(i)+str2; 
        }
        System.out.println("2nd method --> "+str2);
    }
}
