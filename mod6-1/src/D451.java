public class D451 {
//Given an array, find the max sum of contiguous element of the array
    //KADANE'S algorithm
    public static int sol(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(max, sum);
            if(sum<0)
                sum=0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,-3,2,-10,-12,8,12,21,-4,7};
        System.out.println( D451.sol(arr));
    }
}
