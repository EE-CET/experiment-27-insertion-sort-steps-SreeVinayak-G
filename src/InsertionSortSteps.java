import java.util.Scanner;

public class InsertionSortSteps {
        private static void printArr(int[] arr,int n){
                for(int i=0;i<n;i++){
                        if(i!=n-1){
                                System.out.print(arr[i]+" ");
                        }else{
                                System.out.print(arr[i]);
                        }
                }
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                }
                int key = arr[n-1];
                for(int i=n-2;i>=0;i--){
                        if(arr[i]>key){
                                arr[i+1]=arr[i];
                                printArr(arr,n);
                                if(i!=0){
                                        System.out.println();
                                }
                        }else{
                                arr[i+1]=key;
                                printArr(arr,n);
                                break;
                        }
                }
                if(arr[0]>key){
                        arr[0]=key;
                        System.out.println();
                        printArr(arr,n);
                }
        }
    
}
