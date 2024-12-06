class LC169_MajorityElement {
    public int majorityElement(int[] nums) {
        int mejority = nums[0];
        int votes = 1;

        for(int i=1;i<nums.length;i++){
            if(votes==0){
                mejority=nums[i];
                votes++;
            }else if(nums[i]==mejority){
                votes++;
            }else{
                votes--;
            }
        }

        return mejority;
    }

    // public int majorityElement(int[] nums) {
    //     int n = nums.length;
    //     Map<Integer, Integer> map = new HashMap<>();
        
    //     for (int i = 0; i < n; i++) {
    //         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    //     }
        
    //     n = n / 2;
    //     for (var entry : map.entrySet()) {
    //         if (entry.getValue() > n) {
    //             return entry.getKey();
    //         }
    //     }
        
    //     return 0;
    // }

    // public int majorityElement(int[] nums) {
    //     int count = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         count = 1;

    //         for (int j = i+1; j < nums.length; j++) {
    //             if (nums[j] == nums[i]) {
    //                 count++;
    //             }
    //         }

    //         if (count > nums.length / 2) {
    //             return nums[i];
    //         }

    //     }

    //     return -1;
    // }
}