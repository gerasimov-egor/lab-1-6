import java.util.Scanner;

import static java.lang.Math.*;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable_x = scanner.nextInt();
        double variable_y = part1(variable_x) + part2(variable_x) + part3(variable_x);
        int xa = 0;
        int ya = 0;
        int xb = 1;
        int yb = 0;
        int xc = 0;
        int yc = 1;
        int xd = variable_x;
        double yd = variable_y;

        if ((((xd - xa)*(yb-ya)-(yd-ya)*(xb-xa))*((xc - xa)*(yb-ya)-(yc-ya)*(xb-xa)) >= 0) &&
                (((xd - xb)*(yc-yb)-(yd-yb)*(xc-xb))*((xa - xb)*(yc-yb)-(ya-yb)*(xc-xb)) >= 0) &&
                (((xd - xc)*(ya-yc)-(yd-yc)*(xa-xc))*((xb - xc)*(ya-yc)-(yb-yc)*(xa-xc)) >= 0 )){
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    private static double part1(int x){
        double result = pow(asin(pow(x, 2) / (pow(x, 2)+1)), 7);
        return result;
    }

    private static double part2(int x){
        double result = pow((sqrt(2*abs(x+3)))+4, 1.0/3);
        return result;
    }

    private static double part3(int x){
        double result = log(pow(3, 1.0/tan(x))+pow(abs(x), cos(x)))/log(7.0);
        return result;
    }
}
