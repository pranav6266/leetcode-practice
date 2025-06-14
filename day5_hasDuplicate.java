class day5_hasDuplicate{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        boolean is = hasDuplicate(nums);
        System.out.println(is);
    }

    public static boolean hasDuplicate(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            for(int j=0; j < nums.length; j++){
                if(nums[i] == nums[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}