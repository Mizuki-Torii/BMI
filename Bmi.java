public class Main {
    public static void main(String[] args ){
        int repeat;
        double height, weight, bmi;

        repeat = 0;

        while( repeat <= 1 ){

            height = 160;

            weight = 50;

            bmi = weight / height / height;

            System.out.println("BMI is " + bmi);
            repeat++;
        }

    }
}