//Question no: 299

//Question Name:Bulls and Cows
class Solution {
    public String getHint(String secret, String guess) {
        int[] frq = new int[10];
        int bull=0;
        int cow=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            frq[secret.charAt(i)-48]++;
        }
        for(int j=0;j<guess.length();j++){
            if(frq[guess.charAt(j)-48]>0){
                cow++;
                frq[guess.charAt(j)-48]--;
            }
        }
    cow=cow-bull;
    return bull+"A"+cow+"B";
    }
}