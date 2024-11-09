public class MessedArrays{

    public void greetThem(String[] names) {
        for (String string : names) {
            System.out.println("Hello there " + string + ", nice to meet you");
        }
    }
    public int[] twoSum(int[] nums, int target) {
	for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
		if (nums[j] == target - nums[i]) {
		  return new num[] { i , j };
		}
	   }
	}
	throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        MessedArrays m = new MessedArrays();
        String[] names = {"Kofi", "Ama", "Joe", "Yaa", "Kobi", "Aba"};

        m.greetThem(names);
    }
}
