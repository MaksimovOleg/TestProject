package strings;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "XXXXIV";
        int result = 0; int num = 0;
        for (int i = s.length()-1; i >=0; i--) {
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < result) {
                result -= num;
            } else {
                result += num;
            }
        }
        System.out.println(result);
    }
}
