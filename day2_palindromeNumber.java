import java.util.Scanner;
public class day2_palindromeNumber {

    public static boolean isPalindrome(int x) {
            String s = Integer.toString(x);
            int length = s.length();
            for(int i=0;i<length;i++){
                for(int j=length-1;j>=0;j--){
                    if (s.charAt(i) != s.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int x = sc.nextInt();
            boolean check = isPalindrome(x);
            if(check){
                System.out.println("false");
            }
            else System.out.println("true");
            sc.close();
        }
    }