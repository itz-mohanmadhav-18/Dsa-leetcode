class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        // for(int i = 0 ; i<nums.length ; i++){
        //     for(int j = i+1 ; j<nums.length;j++){
        //         for(int k = j+1 ; k<nums.length ; k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 l.sort(null);
        //                 ans.add(l);
        //             }
        //         }
        //     }
        // }
        //=================================================================
        //Using hashSet to reduce complexity from O(n^3) to O(n^2)
        //=================================================================
        // int target = 0;
        // for(int i = 0 ; i<nums.length -2 ; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j = i+1 ; j<nums.length ; j++){
        //         int second = target - nums[i] - nums[j];

        //         if(set.contains(second)){
        //             List<Integer> ans2 = new ArrayList();
        //             ans2.add(nums[i]);
        //             ans2.add(second);
        //             ans2.add(nums[j]);
        //             ans.add(ans2);
        //         }

        //         set.add(nums[j]);
        //     }
        // }

        int n = nums.length;

        for(int i = 0 ; i<n ; i++){
            int j = i+1 ,k=n-1;//declaring two pointers

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k&&nums[j]==nums[j+1]) j++;
                    while(j<k&&nums[k]==nums[k-1]) k--;

                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return new ArrayList<>(ans);
        
    }
}