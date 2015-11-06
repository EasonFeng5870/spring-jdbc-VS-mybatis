package leetcode;

public class TwoSum {

	public static void main(String[] args) {
		int[] m = {2, 7, 11, 15};
		m = twoSum(m, 23);
		if (m != null) {
			System.out.println(m[0] + "|" + m[1]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            for(int j = (i+1); j<nums.length; j++){
                int b = nums[j];
                if((a+b) == target ){
                	int[] k = {i+1, j+1};
                    return k;
                }
            }
        }
        
        return null;
    }

}
