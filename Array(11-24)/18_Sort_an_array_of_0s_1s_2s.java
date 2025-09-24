//BASIC
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[i]){
                   int t=arr[i];
                   arr[i]=arr[j];
                   arr[j]=t;
               }
            
        }
    }
    }
}


//(optimised o(n) o(1))
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int t=arr[low];
                arr[low]=arr[mid];
                arr[mid]=t;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
                
            }
            else{
                int t2=arr[mid];
                arr[mid]=arr[high];
                arr[high]=t2;
                high--;
            }
            
        }
    }
}
