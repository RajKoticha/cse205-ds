class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = "";
        String string2 = "";
        for(int i=0; i<=word1.length-1; i++){
            string1 += word1[i];
        }
        for(int i=0; i<=word2.length-1; i++){
             string2 += word2[i];
        }
       return string1.equals(string2);
    }
}