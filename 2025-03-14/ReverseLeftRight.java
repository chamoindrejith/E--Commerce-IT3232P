import java.util.*;

public class ReverseLeftRight{
    void revNumbers(int start, int end ){
        for(int i=start; i>end; i--){
            System.out.print(i+ " ");
        }
    }
    public static void main(String args[]){
        int input;
        System.out.print("Input Number:");
        Scanner sc = new Scanner(System.in);
        input=sc.nextInt();

        int half = input/2;
        ReverseLeftRight rv = new ReverseLeftRight();
        rv.revNumbers(half,0);
        System.out.print(half+1+" ");
        rv.revNumbers(input,half+1);
    }
}