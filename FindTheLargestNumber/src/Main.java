public class Main {
    public static void main(String[] args) {

        double maxDouble1;
        double maxDouble2;
        
        maxDouble1 = returnMax(34, 28.8, 16.6, 53, 55.5);
        maxDouble2 = returnMax(new double[]{1, 3, 5, 7});

        System.out.println("The max value is " + maxDouble1);
        System.out.println("The max value is " + maxDouble2);
    }
    
    public static double returnMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("number not entered!!!");
            return 0.0;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        return result;
    }
}
