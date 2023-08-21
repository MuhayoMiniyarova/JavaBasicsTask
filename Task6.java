package CodingTasks;

public class Task6 {
    public static void main(String[] args) {

        int number=33;
        boolean cond=false;
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                cond=true;
                break;
            }
        }
        if (!cond)
            System.out.println(number+" is a prime number!");
        else System.out.println(number+" is not a prime number!");
    }
}

