import java.util.Scanner;

class day1_twoSum {

public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }

public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size=sc.nextInt();
        int[] numb =new int[size];
        System.out.println("Enter an array of numbers.");
        for(int i=0;i<numb.length;i++){
            numb[i]=sc.nextInt();
        }
        System.out.println("Enter the target element.");
        int target = sc.nextInt();

        int[] result=twoSum(numb,target);
        for (int j : result) {
            System.out.print(j);
        }
        sc.close();
    }
}