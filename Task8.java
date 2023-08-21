package CodingTasks;

public class Task8 {
    public static void main(String[] args) {
        int [] numbers={20,14,36,78,11};
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

    }
}
