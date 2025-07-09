package Problems;

public class Problem8 {
    public static void main(String[] args) {
        /*
         * Problem 8:-
         * Write a program that:
         * • Creates a String object with value "Java"
         * • Creates another String using new String("Java")
         * • Compares them using == and .equals()
         * • Prints clear output showing the difference in results
         */
        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        str1 = "Software";
        System.out.println(str2);
    }
    
}
