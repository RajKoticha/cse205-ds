class Solution {
    public int findKthPositive(int[] arr, int k) {
        int index=0;
        // int arrRev[] = new int[arr.length+k];
        List<Integer> arrRev = new ArrayList<>();
        
        for(int i=0; i<arr[arr.length-1]+k+1;i++){
            arrRev.add(i);
        }
        
        for(int j=0;j<arr.length;j++){
        for(int i=0;i<arrRev.size();i++){    
            if(arrRev.get(i) == arr[j]){    
                arrRev.remove(i);    
            }    
        } 
        }

            
       return arrRev.get(k);
    }
}