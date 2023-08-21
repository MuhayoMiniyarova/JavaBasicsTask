package CodingTasks;

public class Task9 {
    public static void main(String[] args) {
        int [] numbers={10,65,75,33,50,40};
        int size=numbers.length;
        int n;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if (numbers[i]>numbers[j]){
                    n=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=n;
                }
            }
        }
        System.out.println("The second largest number is "+numbers[size-2]);
    }
}
