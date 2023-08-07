class 2413 {
    public static int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        } else {
            return n*2;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        smallestEvenMultiple(n);
    }
}