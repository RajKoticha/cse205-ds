import java.util.*;
public class Solution
{
    

    public static void solve(int ind,int[] arr,List<List<Integer>>l,List<Integer>l1){
        if(ind==arr.length){
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(arr[ind]);
        solve(ind+1,arr,l,l1);
        l1.remove(l1.size()-1);
        solve(ind+1,arr,l,l1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        solve(0,nums,l,l1);
        return l;
    }

    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array inputting: ");
        int b = sc.nextInt();
        int[] s = new int[b];
        for(int i=0; i<s.length; i++){
            int a = sc.nextInt();
            s[i] = a;
        }
       
        
        

		System.out.println(subsets(s));
	}
}
