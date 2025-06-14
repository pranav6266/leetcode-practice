import java.util.Scanner;
public class day3_romanToInteger {
    public static void main(String[] args) {
//        values of roman numerals in integers: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the roman numeral.");
        String romanString = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < romanString.length() ; i++) {
            int current = getInt(romanString.charAt(i));

            if ( i < romanString.length()-1 ){
                int next = getInt(romanString.charAt(i+1));
                if(current<next){
                    result -= current;
                }else{
                    result += current;
                }
            }else{
                result += current;
            }

        }
        System.out.printf("The integer value is: "+result);
        scanner.close();
    }


    private static int getInt(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}