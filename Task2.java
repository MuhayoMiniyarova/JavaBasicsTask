package CodingTasks;

public class Task2 {
    public static void main(String[] args) {
        int [] numb={23,26,87,19,85,45};
        int sum=0;
        for (int i = 0; i < numb.length ; i++) {
            sum=sum+numb[i];
        }
        System.out.println(sum);
    }
}
