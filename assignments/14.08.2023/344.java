import java.util.*;
class 344 {
  public static void reverseString(char[] s) {
    reverse(s, 0, s.length - 1);
}
private static void  reverse(char[]s, int left, int right){
    if(left >= right) 
        return;
    char temp = s[right];
    s[right] = s[left];
    s[left] = temp;
    reverse(s, left + 1, right - 1);
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of string inputting: ");
        int b = sc.nextInt();
        char[] s = new char[b];
        for(int i=0; i<s.length - 1; i++){
            char a = sc.next().charAt(0);
            s[i] = a;
        }
        reverseString(s);
    }

}