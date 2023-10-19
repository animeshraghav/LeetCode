class Solution {
    public String func(String s){
        int n=s.length();
        String str="";
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                cnt++;
            }else{
                if(cnt>0){
                    cnt--;
                }else{
                    str=s.charAt(i)+str;
                }
            }
        }
        return str;
    }
    public boolean backspaceCompare(String s, String t) {
        return func(s).equals(func(t));
    }
}