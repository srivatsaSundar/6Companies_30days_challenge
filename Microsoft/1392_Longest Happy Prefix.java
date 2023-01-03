//Question no: 1392

//Question Name: Longest Happy Prefix

class Solution {
    public String longestPrefix(String s) {
        int lps[] = new int[s.length()];
        int length=0;lps[0]=0;int i=1;
        int m=lps.length;
        while(i<m){
            if(s.charAt(i)==s.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }
            else{
                if(length!=0){
                    length=lps[length-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0,lps[m-1]);
    }
}