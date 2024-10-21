
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class practice
{
    static int first = 0, second = 1, third = 0;
    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int additon(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }

    public static int multiply(int a, int b){
        int mult = a * b;
        return mult;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static void factorial(int n){
        int factor = 1;
        for(int i = n; i>= 1; i--){
             factor = factor * i;
        }
        System.out.println(factor);
    }

    public static int average(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;

        return avg;
    }

    public static void even(int n){
        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void sumOfOdd(int n){
        int sum = 0;
        for(int i = 1; i<=n; i = i + 2){
            sum = sum + i;
        }

        System.out.println(sum);
    }

    public static void max(int a, int b){
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    
    public static void counts(int a, int b){
        int positive = 1;
        int negative = 1;
        int zeroes = 0;

        for(int i=0; i<a; i++){
            if(b > 0){
                positive++;
            }else{
                negative++;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
    }



    public static void swap(int a, int b){
        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("After Swapping, a is: " + a + ", After Swapping, b is: "+b);
    }

    public static void vowel(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    public static void fin(int n){
        if(n>0){
            third = first + second;
            first = second;
            second = third;
            System.out.print(" "+third);
            fin(n-1);
        }
    }

    public static void Reverse(String str){

        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for(int i = 0; i<strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        System.out.println("Reverse: "+ new String(result));
    }

    public static boolean prime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void fibonacci(int n){
        if(n > 0){
            third = first + second;
            first = second;
            second = third;
            System.out.print(" " + third);
            fibonacci(n - 1);
        }
    }

    public static void fibona(int n){
        int first = 0;
        int second = 1;
        int third;
        System.out.print(first+" "+second);
        for(int i = 2; i<n; i++){
            third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
    }
    
	public static void main(String[] args) {
		// if(isPrime(12)){
		//     System.out.println("true");
		// }else{
		//     System.out.println("false");
		// }

        // System.out.println(additon(5, 6));

        int n = 5;
        int m = 6;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        // System.out.println(multiply(5, 6));

        // factorial(5);

        Scanner input = new Scanner(System.in);

        // int a = input.nextInt();
        // int b= input.nextInt();
        // int c = input.nextInt();

        // System.out.println(average(a, b, c));

        //  int a = input.nextInt();
        //  int b = input.nextInt();

        //  swap(a, b);

        // max(a, b);
        // sumOfOdd(a);

        // counts(a, b);

        // Reverse the name aditya
        // String str = "Aditya Kumar", nstr = "";
        // char ch;

        // for(int i = 0; i<str.length(); i++){
        //     ch = str.charAt(i);
        //     nstr = ch + nstr;
        // }

        // System.out.println("Reverse: " + nstr);

        // Reverse("Sanjana Aditya Singh");
        // int count = 5;
        // System.out.print(first+" "+second);
        // fibonacci(count-2);
        // System.out.println();
        // fibona(5);
        // Reverse("123");

        // vowel("aditya");

        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("e");
        // cars.add("d");
        // // cars.clear();  clear() is used to remove all elements
        // System.out.println("cars: " + cars);
        // cars.add("f");
        // cars.add(1,"a");
        // System.out.println("cars: "+ cars);
        // System.out.println(cars.get(0)); //get is used to search the element of a specific position
        // System.out.println("cars: " + cars.set(0, "a")); //set is used to change the element of a specific position
        // System.out.println("cars: "+ cars);
        // cars.set(1, "b");
        // cars.set(2,"c");
        // cars.set(3, "d");
        // System.out.println("cars: " +  cars);
        // cars.remove(3);
        // System.out.println("cars: " +  cars);
        // System.out.println(cars.size()); // size if use to know the size of an array

        // for(int i = 0; i<cars.size(); i++){
        //     System.out.println("cars at position " + i + ": " + cars.get(i));
        // }

        // for(String car : cars){
        //     System.out.println(car);
        // }

        // System.out.println("--------------------");

        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(1);
        // numbers.add(5);
        // numbers.add(3);
        // numbers.add(2);

        // for(Integer number: numbers){
        //     System.out.println(number);
        // }

        // System.out.println("--------------------");

        // Collections.sort(numbers);
        // for(Integer number: numbers){
        //     System.out.println(number);
        // }

        // LinkedList<String> cars = new LinkedList<String>();
        // cars.add("tata");
        //         cars.add("bmw");
        // cars.add("nano");
        // System.out.println("cars: " + cars);
        // cars.addFirst("alto");
        // System.out.println("cars: " + cars);
        // cars.set(4, "swift");
        // System.out.println("cars: " + cars);
        // Collections.sort(cars);
        // for(String i : cars){
        //     System.out.println("cars: " + i);
        // }
        // Collections.sort(cars, Collections.reverseOrder());
        // for(String i : cars){
        //     System.out.println("cars: " + i);
        // }

        // System.out.println("add: " + add(4, 5));
        // System.out.println("double add: " + add(4.5, 4.5));

        // System.out.println("sum: " + sum(4));

        // HashMap<String,String> capitalCities = new HashMap<String,String>();

        // capitalCities.put("England", "London");
        // capitalCities.put("India", "Bihar");
        // capitalCities.put("Usa", "Washington");
        // capitalCities.put("Germany", "Patna");
        // System.out.println("--------------------------------------------");
        // System.out.println(capitalCities.size());
        // for(String i: capitalCities.keySet()){
        //     System.out.println(i);
        // }
        // System.out.println("--------------------------------------------");
        // System.out.println(capitalCities.get("Germany"));
        // capitalCities.remove("Germany");
        // System.out.println("--------------------------------------------");
        // System.out.println(capitalCities);
        // System.out.println(capitalCities.size());
        // for(String i: capitalCities.values()){
        //     System.out.println(i);
        // }
        // System.out.println("--------------------------------------------");
        // for(String i:capitalCities.keySet()){
        //     System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        // }

        // capitalCities.replace("Usa", "Washington", "Begusaray");

        // for(String i:capitalCities.keySet()){
        //     System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        // }

        // System.out.println(capitalCities);

        // HashMap<String,Integer> person = new HashMap<String,Integer>();
        // person.put("Aditya", 22);
        // person.put("Sanjana", 26);

        // for(String i: person.keySet()){
        //     System.out.println("Name: " + i + ", Age: "+person.get(i));
        // }

        // for(Map.Entry x: person.entrySet()){
        //     System.out.println(x.getKey() + " " + x.getValue());
        // }

        // for(int i = 0; i<person.size(); i++){
        //     if(person.values() == null){
        //         System.out.println("Null Values present");
        //     }else{
        //         System.out.println("No Null value");
        //     }
        // }
        // System.out.println("size: " + person.size());

        // System.out.println("-------------------------------------------");
        // person.put("AdiSan", null); 

        // for(String i: person.keySet()){
        //     System.out.println("keys: " + i + ", value: "+person.get(i));
        // }

        // for(int i = 0; i<person.size(); i++){
        //     if(person.values() == null){
        //         System.out.println("Null value present");
        //     }else{
        //         System.out.println("no null value");
        //     }
        // }

        // System.out.println(person.values());

        // boolean result = person.isEmpty();
        // System.out.println(result);

        // System.out.println("size: " + person.size());

        // HashMap<String,Integer> person1 = new HashMap<String, Integer>();
        // person1.putAll(person);
        // System.out.println(person1);

        // HashMap<String,Integer> newPerson = new HashMap<String, Integer>();
        // newPerson = (HashMap)person.clone();

        // System.out.println(newPerson);

        HashSet<String> cars = new HashSet<String>();
        cars.add("TATA");
        cars.add("Alto");
        cars.add("Swift");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println("Cars: " + cars);
        if(cars.contains("BMW")){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

        System.err.println("size: " + cars.size());


        HashSet<String> newCar = new HashSet<String>();
        // newCar.addAll(cars);
        newCar = (HashSet)cars.clone();
        System.out.println(newCar.size());

        HashSet<Integer> number = new HashSet<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);

        for(Integer i:  number){
            System.out.println("number: " + i);
        }

        Iterator<Integer> p = number.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }

        HashSet<Integer> newNumber = new HashSet<Integer>();
        newNumber.add(3);
        newNumber.add(5);
        newNumber.add(2);

        // HashSet<Integer> result = new HashSet<Integer>();
        for(Integer i: number){
            System.out.println(newNumber.contains(i) ? "Yes" : "No");
        }

	}
}
