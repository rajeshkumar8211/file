package problemsoltion.java;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if((nums[i]+nums[i+1])==target)
            {
                System.out.println("["+i+","+i+1+"]");
            }
        }
        return i,i+1;
    }
}
