package CodingTasks;

public class Task1 {
    public static void main(String[] args) {

        int [] temp={67,78,90,102,37,81,40};
        int highest=temp[0];
        int lowest=temp[0];
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i] > highest) {
                highest = temp[i];
            }
            if (temp[i] < lowest) {
                lowest = temp[i];
            }
        }
        System.out.println("The highest temperature of the week is "+highest);
                System.out.println("The lowest temperature of the week is "+lowest);

            }
        }







