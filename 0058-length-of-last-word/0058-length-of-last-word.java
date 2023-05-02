class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int start = s.length() - 1;
        for(int i=start; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}