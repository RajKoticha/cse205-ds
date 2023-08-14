class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n%2==0){
        n = n/2;
        }

        if(n==1){
            return true;
        }
        if(n%2!=0 || n==0){
            return false;
        }
        // System.out.println(n);
        return isPowerOfTwo(n);
    }
    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPowerOfTwo(n);
    }
}
