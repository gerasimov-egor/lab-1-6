import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива m на n: ");
                System.out.print("m = ");
                int row_count = scanner.nextInt();
                System.out.print("n = ");
                int column_count = scanner.nextInt();
                int array[][] = new int[row_count][column_count];
                int array2[][] = new int[row_count][column_count];
                double evclid[] = new double[column_count];
                double evclid_buff[] = new double[column_count];
                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < column_count; j++) {
                        System.out.println((i + 1) + " строка " + (j + 1) + " столбец = ");
                        array[i][j] = scanner.nextInt();
                    }
                }

                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < column_count; j++) {
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println("");
                }

                for (int i = 0; i < column_count; i++)
                {
                    double res = 0;
                    for (int j = 0; j < row_count; j++)
                    {
                        res += (double)Math.pow(array[j][i], 2);
                    }
                    evclid[i] = Math.sqrt(res);
                    evclid_buff[i] = Math.sqrt(res);

                }

                Arrays.sort(evclid);
                int pos[] = new int[column_count];
                for (int i = column_count - 1; i >= 0; i--) {
                    double buff = evclid[i];
                    for (int j = 0; j < column_count; j++)
                    {
                        if (evclid_buff[j] == buff)
                        {
                            pos[column_count - 1 - i] = j;
                            evclid_buff[j] = -1000000;
                            break;
                        }
                    }
                }




                System.out.println("------------------");
                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < column_count; j++) {
                            System.out.print(" " + array[i][pos[j]] + " ");
                    }
                    System.out.println("");
                }


            }
        } catch (Throwable t) {
            System.out.println("Вы вышли из программы, спасибо за использование и хорошего дня =)");
        }
    }

}