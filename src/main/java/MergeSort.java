public class MergeSort{
    public static void main(String[] args){
        int[] A={5,9,3,1,8};
        int[] B={7,10,2,0,11};
        int[] merged=new int[A.length + B.length];

        int k =0;
        for(int n:A){
            merged[k++]=n;
        }
        for(int n:B){
            merged[k++]=n;
        }

        for(int i=0; i< merged.length-1; i++){
            for(int j=0; j< merged.length-1-i; j++){
                if(merged[j]>merged[j+1]){

                    int temp=merged[j];
                    merged[j]=merged[j+1];
                    merged[j+1]=temp;

                }
            }
        }
        for(int n:merged){
            System.out.println(n);
        }

    }
}