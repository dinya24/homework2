package ru.geekbrains.lesson2;

public class Main {

    public static void main(String[] args) {
       // invertArray();
       // fillArray();
        // changeArray();
       // fillDiagonal();
               

    }
//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray(){
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
    }
//    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 1, j = 0; i < arr.length; i++) arr[i] = j += 3; {
        for (int i : arr) System.out.print(i + " ");

        }
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;  {
                System.out.print(arr[i] + " ");
            }
            }
        }
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами;

    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
        for (int j = 0, j1 = arr[i].length; j < arr[i].length; j++, j1--){
            if(i == j || i == (j1 - 1)) arr[i][j] = 1;
            System.out.print(arr[i][j] + " ");
        }
        System.out.print("\r\n");
        }
    }




}
