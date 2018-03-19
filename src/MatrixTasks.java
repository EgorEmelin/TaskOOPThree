import java.util.*;


public class MatrixTasks {

    public void matrixSum(){
        int[][] matrix = new int[8][8];
        int sumOne=0, sumTwo=0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (1 + Math.random() * 98);
                System.out.format("%4d",matrix[i][j]);
                if (i == j) sumOne +=matrix[i][j];
                else if (i == matrix.length - 1 - j) sumTwo +=matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма главной диаглнали: " + sumOne + " Сумма побочной диагонали: " + sumTwo + "\n");
    }

    public void matrixMax(){
        int matrix[][] = new int[8][5], max[] = new int[8];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length-3; j++) {
                matrix[i][j] = (int) (-99 + Math.random() * 198);
                System.out.format("%4d",matrix[i][j]);
            }
            max[i] = Arrays.stream(matrix[i]).max().getAsInt();
            System.out.println();
        }
        int maxValue = Arrays.stream(max).max().getAsInt();

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length - 3; j++) {
                if (maxValue == matrix[i][j]){
                    System.out.println("Максимальное значение в матрице: " + maxValue + "(" + (i + 1) + "," + (j + 1) + ")\n");
                }
            }

        }

    }

    public void matrixMaxRow(){
        int matrix[][] = new int[8][5], mult[] = new int[8];
        int iIndex = 0, jIndex = 0;
        for (int i = 0; i < matrix.length ; i++) {
            mult[i] = 1;
            for (int j = 0; j < matrix.length-3; j++) {
                matrix[i][j] = (int) (-99 + Math.random() * 198);
                System.out.format("%4d",matrix[i][j]);
                mult[i]*= Math.abs(matrix[i][j]);
            }
            System.out.println();
        }
        int max = Arrays.stream(mult).max().getAsInt();
        for (int i = 0; i < matrix.length ; i++) {
            if(max == mult[i]) System.out.println("Максимальное произведение строки: " + max + "(" + (i + 1)  +")\n");
        }
    }

    public void matrixSort(){
        int matrix[][] = new int[10][7];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length-3; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.format("%4d",matrix[i][j]);
            }
            System.out.println();
            matrix[i] = Arrays.stream(matrix[i]).sorted().toArray();
        }
        System.out.println();
        for (int i = 0; i < matrix.length  ; i++) {
            for (int j = matrix.length -4; j >= 0; j--) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }


    }

}
