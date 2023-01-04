//Question no: 1358

//Question Name:Number of Substrings Containing All Three Characters
class Solution {
    public int numberOfSubstrings(String s) {
        int a=0;
        int b=0;
        int c=0;
        int result=0;
        int increment=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            else if(s.charAt(i)=='b'){
                b++;
            }
            else if(s.charAt(i)=='c'){
                c++;
            }
            while(a>0 && b>0 && c>0){
                if(s.charAt(increment)=='a'){
                    a=a-1;
                    increment++;
                }
                else if(s.charAt(increment)=='b'){
                    b=b-1;
                    increment++;
                }
                else if(s.charAt(increment)=='c'){
                    c=c-1;
                    increment++;
                }
            }
            result+=increment;
        }
        return result;
    }
}