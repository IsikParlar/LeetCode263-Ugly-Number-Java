class Solution {
    public boolean isUgly(int n) {
        for(int i=2; n>0 && i<6;i++ ){
            while(n%i==0){
                n/=i;
            }
            if(n==1){
                return true;
            }
            
        }
        return false;
    }
}