class Solution {
    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalin(str.toCharArray(), 0, str.length() - 1);        
    }
    public static boolean isPalin(char[] s, int l, int r){
        if (l > r) return true;
        else if(s[l] == s[r]){
            l++;
            r--;
            return isPalin(s, l, r);
        } 
        else return false;
    }
}
