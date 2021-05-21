import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        double total;
        x = scanner.nextInt();
        if (x<=1){
            total = part1(x);
        } else if (x>1 && x<3){
            total = part2(x);
        } else {
            total = part3(x);
        }
        System.out.print(total);
    }

    private static double part1(int x){
        double tmp1 = abs(pow(x-3, 7));
        double tmp2 = pow(7, x)-tmp1;
        return log(abs(tmp2))/log(7.0);
    }

    public static double part2(int x){
        return log(pow(x, 8) / (1+pow(x, 2)));
    }

    public static double part3(int x){
        return asin(x/(1+pow(x, 2)));
    }
}