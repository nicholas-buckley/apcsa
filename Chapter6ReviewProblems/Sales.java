import java.util.Scanner;

public class Sales{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of salepeople: ");
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum, avg, max = Integer.MIN_VALUE, maxMan = 0, min = Integer.MAX_VALUE, minMan = 0;

        for(int x = 0; x < sales.length; x++){
            System.out.println("Etner sales for salesperson " + x + ": ");
            sales[x] = scan.nextInt();
        }

        System.out.println("\nSalesperson\tSales\n-------------");
        sum = 0;
        for(int x = 0; x<sales.length; x++){
            System.out.println(x+1 + "\t\t" + sales[x]);
            sum += sales[x];
            if(sales[x] > max){
                max = sales[x];
                maxMan = x;
            }if(sales[x] < min){
                min = sales[x];
                minMan = x;
            }
        }
        avg = sum/SALESPEOPLE;

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + avg);
        System.out.println("\nSalesperson " + (maxMan+1) + " had the highest sale with $" + max);
        System.out.println("Salesperson " + (minMan+1) + " had the lowest sale with $" + min);

        System.out.println("Enter a value: ");
        int value = scan.nextInt();
        int total = 0;
        System.out.println("\nSalesperson\tSales\n-------------");
        for(int x = 0; x<sales.length; x++){
            if(sales[x] > value){
                System.out.println(x+1 + "\t\t" + sales[x]);
                total++;
            }
        }
        System.out.println("\n" + total + " totale salespeople over $" + value);
        scan.close();
    }
}