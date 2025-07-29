import java.util.ArrayList;
public class pushZerosToTheEnd {
    // User function Template for Java
    static void pushZerosToEnd(int[] arr) {
            // code here
            int n=arr.length;
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    temp.add(arr[i]);
                }
            }
            int m=temp.size();
            int noz=n-m;
            for(int i=0;i<noz;i++){
                temp.add(0);
            }
            for(int i=0; i<n; i++){
                arr[i]=temp.get(i);
            }
        }
        public static void main(String[] args){
            int[] arr={1,0,3,0,5,0,7,0,9};


            pushZerosToEnd(arr);

            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
}
