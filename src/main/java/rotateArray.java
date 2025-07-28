public class rotateArray {
    // User function Template for Java
     // Function to rotate an array by d elements in counter-clockwise direction.
        static void rotateArr(int arr[], int d) {
            // add your code here
            int n=arr.length;
            d=d%n;
            reverseArr(arr,0,d-1);
            reverseArr(arr,d,n-1);
            reverseArr(arr,0,n-1);

        }
        static void reverseArr(int arr[], int s, int e){
            int i=s;
            int j=e;
            while(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        public static void main(String[] args){
            int[] arr={1,2,3,4,5,6,7,8,9};
            int d=2;

            rotateArr(arr,d);

            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
}
