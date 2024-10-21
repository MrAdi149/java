

public class GFGQuestions {

    int real, imagin;

    public static void fibonacci(int n){
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        for(int i = 2; i<n; i++){
            int third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }

    public static float multiply(float a, float b){
        return a * b;
    }

    public static void swap(int a, int b){
        b = a + b;
        a = b-a;
        b = b - a;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void binaryString(String a, String b){
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);
        System.out.println("String: " + result);
    }

    public GFGQuestions(int a, int b){
        this.real = a;
        this.imagin = b;
    }

    public void show(){
        System.out.println(this.real + " +i" + this.imagin);
    }

    public static GFGQuestions add(GFGQuestions n1, GFGQuestions n2){
        GFGQuestions res = new GFGQuestions(0, 0);

        res.real = n1.real + n2.real;
        res.imagin = n1.imagin + n2.imagin;
        return res;
    }

    static boolean evenOrOdd(int n){

        if(n%2 == 0){
            return true;
        }
        return false;
    }

    public static void isPrime(int n){
                // Declaring the variables
                int x, y, flg;

                // Printing display message
                System.out.println(
                    "All the Prime numbers within 1 and " + n
                    + " are:");
        
                // Using for loop for traversing all
                // the numbers from 1 to N
                for (x = 1; x <= n; x++) {
        
                    // Omit 0 and 1 as they are
                    // neither prime nor composite
                    if (x == 1 || x == 0)
                        continue;
        
                    // Using flag variable to check
                    // if x is prime or not
                    flg = 1;
        
                    for (y = 2; y <= x / 2; ++y) {
                        if (x % y == 0) {
                            flg = 0;
                            break;
                        }
                    }
        
                    // If flag is 1 then x is prime but
                    // if flag is 0 then x is not prime
                    if (flg == 1)
                        System.out.print(x + " ");
                }
    }

    public static void largest(int a, int b, int c){
        if(a > b  && a> c){
            System.out.println(a + " is greater");
        }else if(b > a && b > c){
            System.out.println(b + " is greater");
        }else{
            System.out.println(c + " is greater");
        }
    }

    public static void lcm(int a, int b){
        int c = Integer.max(a, b);
        int d = Integer.min(a,b);
        int e;
        int f;
        if(c%d != 0){
            f = c * d;
            System.out.println("lcm of a " + a + " and " + b + " is: " + f);
        }else{
            e = c/d;
            f =  e * d;
            System.out.println("lcm of a " + a + " and " + b + " is: " + f);            
        }
    }

    public static void leap(int n){
        if(n % 4 == 0){
            System.out.println("its leap year");
        }else {
            System.out.println("not a leap year");
        }
    }

    public static void amstrong(int n){
        int original = n;
        String s = String.valueOf(n);
        double c = s.length();
        double sum = 0;
        while(n > 0){
            double mod = n % 10;
            // System.out.println(" " + mod);
            n = n / 10;
            double d = Math.pow(mod, c);
            sum = sum + d;
        }
        if(original == sum){
            System.out.println("its an amstrong number");
        }else{
            System.out.println("its not an amstrong number");
        }
    }

    public static void neon(int n){
        int original = n;
        int sum = 0;
        int square = n * n;
        // System.out.println("square: " + square);
        while(square > 0){
            int mod = square % 10;
            // System.out.println(" " + mod);
            square = square / 10;
            sum = sum + mod;
        }
        if(original == sum){
            System.out.println("neon number");
        }else{
            System.out.println("not neon number");
        }
    }

    public static int factorial(int n){
        if (n == 0)    
            return 1;    
        else 
            return (n) * factorial(n-1); 
    }

    public static void main(String[] args) {
        // fibonacci(5);
        // System.out.println();
        // System.out.println("multiply: " + multiply(3.5f, 4.0f));
        // swap(4,5);
        // GFGQuestions g1 = new GFGQuestions(4,5);
        // GFGQuestions g2 = new GFGQuestions(7, 8);

        // g1.show();
        // g2.show();

        // GFGQuestions res = add(g1,g2);
        // res.show();
        // binaryString("110", "011");
        // System.out.println(10%5);

        // System.out.println(evenOrOdd(5));
        // lcm(5, 15);
        // largest(7, 4, 5);
        // isPrime(10);
        // System.out.println();
        // leap(1620);
        // amstrong(153);
        // neon(10);
        // System.out.println(factorial(5));

        //pattern
        
    }
}