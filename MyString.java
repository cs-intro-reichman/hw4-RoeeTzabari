public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        int index = 0;
        
        if (str1.length() != 0 && str2.length() == 0) return true;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = i; j < str1.length() && index < str2.length(); j++) {
                    if (str2.charAt(index) != str1.charAt(j)) break;
                    index++;
                }
                if (index == str2.length()) return true;
                index = 0;
            }
        }
        
        return false;
    }
}
