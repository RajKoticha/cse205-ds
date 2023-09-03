class Solution {
    public void solve( int[] nums, boolean[] freq, List<Integer> m1, List<List<Integer>> m){
        if(m1.size() == nums.length ){
            
            m.add(new ArrayList<>(m1));
            return;
        }
        for(int i = 0; i<= nums.length-1; i++){
                if(!freq[i]){
                    freq[i]= true;
           m1.add(nums[i]);
            solve(nums,freq,m1,m);
            m1.remove(m1.size()-1);
            freq[i] = false;
                }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> m = new ArrayList<>();
    boolean[] freq = new boolean[nums.length];
    solve(nums, freq, new ArrayList<>(), m);
    return m;    
    }
}