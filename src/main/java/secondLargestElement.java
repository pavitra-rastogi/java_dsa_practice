public class secondLargestElement {
        static int getSecondLargest(int[] arr) {
            // code here
            int ans=-1;
            int n=arr.length;
            if(n<2){
                ans=-1;
            }
            int first = -1;
            int second = -1;
            for(int i = 0; i<n; i++){
                if (arr[i]>first){
                    second=first;
                    first=arr[i];
                }
                else if(arr[i]>second && arr[i]!=first){
                    second=arr[i];
                }
            }
            ans=second;
            return ans;
        }
        public static void main(String[] args){
            int[] arr={1,2,3,4,5,6,7,8,9};

            System.out.print(getSecondLargest(arr));


        }
}
