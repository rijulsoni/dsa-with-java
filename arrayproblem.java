import java.util.Scanner;

public class arrayproblem {
    public static void main(String[] args) {
        //Prefix Sum Array Generation from Queries
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int arr[]=new int[N];

        for (int i=0;i<Q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
             arr[l]=arr[l]+1;
             if(r+1<N){
                arr[r+1]-=1;
             }
        }
        for(int i=1;i<N;i++){
            arr[i]+=arr[i-1];
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
