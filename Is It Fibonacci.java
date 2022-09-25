class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        while(GeekNum.size()!=N){
            int i=GeekNum.size()-1;
            int e=K;
            long sum=0;
            while(e>0){
                sum+=GeekNum.get(i);
                i--;
                e--;
            }
            GeekNum.add(sum);
        }
        long ans = GeekNum.get(N-1);
        return ans;
    }
}
