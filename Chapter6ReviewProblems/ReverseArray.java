import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){
        System.out.println("Enter a value");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int x = 0; x < arr.length; x++){
            System.out.println("Enter array value: ");
            arr[x] = scan.nextInt();
        }
        System.out.println("{");
        for(int x = 0; x < arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x]+"}");
                break;
            }
            System.out.print(arr[x] + ", ");
        }

        int temp = 0;
        for(int x = 0; x < arr.length/2; x++){
            temp = arr[arr.length-1-x];
            arr[arr.length-1-x] = arr[x];
            arr[x] = temp;
        }

        System.out.println("{");
        for(int x = 0; x < arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x]+"}");
                break;
            }
            System.out.print(arr[x] + ", ");
        }
    }
}