class Solution {
    public double myPow(double x, int n) {

            if(n==0){
                return 1;
            }
            if(n<0){
                x=1/x;
                n = -(1+n);
                return x*myPow(x,n);
            }
            double half = myPow(x,n/2);
            return (n%2==0)?half*half:half*half*x;
    }

}