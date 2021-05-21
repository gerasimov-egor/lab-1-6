import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_2 {
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
                boolean ap[] = new boolean[row_count];
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

                for (int i = 0; i < row_count; i++)
                {
                    boolean res = true;

                    if (column_count < 2)
                    {
                        res = false;
                    }
                    else
                    {
                        int d = array[i][1] - array[i][0];
                        for (int j = 2; j < column_count; j++)
                        {
                            if (array[i][j] - array[i][j - 1] != d)
                            {
                                res = false;
                                break;
                            }
                        }
                    }

                    ap[i] = res;
                }

                System.out.println("Вывод массива образований арифметической прогрессии: ");
                for (int i = 0; i < row_count; i++)
                {
                    if (ap[i])
                        System.out.println(i + 1 + " является арифметической прогрессией");
                    else
                        System.out.println(i + 1 + " не является арифметической прогрессией");
                }


            }
        } catch (Throwable t) {
            System.out.println("Вы вышли из программы, спасибо за использование и хорошего дня =)");
        }
    }

}