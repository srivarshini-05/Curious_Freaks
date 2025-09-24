//mtd 1:shifting each element(my mtd)  o(n) o(1)

class Solution {
    public void rotate(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
}

//Mtd 2:two pointer

class Solution {
    public void rotate(int[] arr) {
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
        }
    }
}

//MTD 3: reversing the array
class Solution {
    public void rotate(int[] arr) {
        int n=arr.length;
        for(int i=0,j=n-2;i<j;i++,j--){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
}
