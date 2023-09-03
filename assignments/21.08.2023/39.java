

import java.util.*;

class Solution {
    public static void solve(int ind, int[] arr, int target, List<List<Integer>> m, List<Integer> m1) {
        if (target == 0) {
            m.add(new ArrayList<>(m1));
            return;
        }

        if (ind == arr.length || target < 0) {
            return;
        }

        
        m1.add(arr[ind]);
        solve(ind, arr, target - arr[ind], m, m1);
        m1.remove(m1.size() - 1);

        
        solve(ind + 1, arr, target, m, m1);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> m = new ArrayList<>();
        List<Integer> m1 = new ArrayList<>();
        solve(0, candidates, target, m, m1);
        return m;
    }}