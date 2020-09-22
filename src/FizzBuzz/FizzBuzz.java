package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);
        fizzBuzzBetter(100);
    }
    public static void fizzBuzzBetter(int n){
        for(int i = 1; i <= n ; i++){
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }
            if(!output.equals("")){
                System.out.println(output);
                continue;
            }
            System.out.println(i);
        }


    }
    public static void fizzBuzz(int n){
        for( int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
