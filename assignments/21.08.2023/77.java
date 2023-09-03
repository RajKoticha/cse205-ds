import java.util.*;
class Solution {
    public static void solve(int ind,int k,int arr[],  List<List<Integer>>l, List<Integer>l1){
        
        if(ind==arr.length){      
            l.add(new ArrayList<>(l1));
            return;       
        }
                
        l1.add(arr[ind]);
        solve(ind+1,k,arr,l,l1);
        l1.remove(l1.size()-1);
        solve(ind+1,k,arr,l,l1);
    }

    public static List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = i+1;
        }
        List<List<Integer>>l = new ArrayList<>();
        List<Integer>l1 = new ArrayList<>();
        solve(0,k, arr, l,l1 );
       
        List<List<Integer>>l2 = new ArrayList<>();
        
        for(int i =0; i<=l.size()-1;i++){
                if(l.get(i).size() == k){
                l2.add(l.get(i));    
                    
                }}
                           
        return l2;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =  sc.nextInt();
        System.out.println(combine(n,k));
    }
}