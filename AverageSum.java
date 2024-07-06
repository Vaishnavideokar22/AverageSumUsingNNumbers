import java.util.Scanner;
public class AverageSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      System.out.print("Enter the n integer Numbers:");
        int n;
        n = sc.nextInt();

        int sum = 0;

        for(int i = 0; i <n ; i++){
            int num;
            num = sc.nextInt();
            sum += num;
           }
           System.out.println("The Sum Of Numbers is: "+ sum);
    int avg;
    avg = sum / n;
    System.out.println("The  Averege Of Numbers is: " + avg);
}
    
}
