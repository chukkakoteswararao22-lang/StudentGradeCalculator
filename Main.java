import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Java marks: ");
        int java = sc.nextInt();

        System.out.print("Enter SQL marks: ");
        int sql = sc.nextInt();

        System.out.print("Enter DSA marks: ");
        int dsa = sc.nextInt();

        int total = java + sql + dsa;
        double average = total / 3.0;

        System.out.println("\nStudent Name = " + name);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        if (average >= 80) {
            System.out.println("Grade = A");
        } else if (average >= 60) {
            System.out.println("Grade = B");
        } else if (average >= 40) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = Fail");
        }

        sc.close();
    }
}