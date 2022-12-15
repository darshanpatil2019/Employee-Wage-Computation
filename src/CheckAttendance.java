import java.util.Random;

public class CheckAttendance {
    public static void main(String[] args) {
        int is_Present = 1;

        Random random = new Random();
        int empCheck = random.nextInt(2);

        if (empCheck == is_Present){
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Present");
        }


    }
}
