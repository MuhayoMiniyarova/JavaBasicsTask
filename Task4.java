package CodingTasks;

public class Task4 {
    public static void main(String[] args) {
        int[][]numbers={
                {45,55,66,88},
                {89,90,23,45},
                {12,34,56,77}};
        int sum=0;
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers.length; col++) {
                sum=sum+numbers[row][col];
            }

        }
        System.out.println(sum);
        }
    }
