public class D45_2_Cla {

    //Given an array of size n find the smallest +ve number which is not present in the array

    /**
     * time complexity O(n)
     * space Complexity O(1)
     * @param arr
     * @return
     */
    public static  int sol(int[] arr){
        int n = arr.length;
        //first iteration for converting all -ve numbers +ve(n+1)
        for(int i=0;i<n;i++){
            if(arr[i]<=0)
                arr[i]=n+1;
        }

        for (int i = 0; i<n; i++){
            if(Math.abs(arr[i])<n){
                arr[Math.abs(arr[i])-1]*=-1;
            }
        }

        for (int i=0; i<n; i++){
            if(arr[i]>0)
                return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,-3,6,1,4};
        System.out.println(D45_2_Cla.sol(arr));
        int[] arr1 = {-1, -2, 1, 3, 4};
        System.out.println(D45_2_Cla.sol(arr1));
    }
}
