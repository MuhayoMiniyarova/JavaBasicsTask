package CodingTasks;

public class Task10 {
    public static void main(String[] args) {
        String [] names={"Aliya","Anisa","Bonu","Aliya","Muhayo","Anisa"};
        for (int i = 0; i <names.length-1 ; i++)
        {
            for (int j=i+1; j<names.length ; j++)
            {
                if ((names[i].equals(names[j])) && (i!=j))
                {
                    System.out.println("Duplicate name is: "+names[j]);
                }
            }
        }
    }
}
