package CodingTasks;

public class Task3 {
    public static void main(String[] args) {
        int [][] num={
                {23,12,45,46},
                {65,76,88,97},
                {34,56,78,99}};
        for (int row = 0; row < num.length ; row++) {
            for (int col = 0; col < num.length; col++) {
                if (num[row][col]%2==0){
                    System.out.print(num[row][col]+" ");
                }

            }
            System.out.println();

        }
        }
    }
