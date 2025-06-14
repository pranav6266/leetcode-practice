class daay6_getConcatenation{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ans = getConcatenation(nums);
        for (int element : ans) {
        System.out.print(element + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
}