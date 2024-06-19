import java.util.Scanner;

public class Main {
    public static Scanner scanner; // Note: Do not change this line.
    /**
     *We are building two arrays, one will contain the names and the other one
     * will contain the grades, the list that contains the names will be one
     * dimensional where it will contain all the student's names with a maximum
     * capacity of 100 names.
     * The other array will be kind of a matrix - meaning it will be two dimensional
     * and it will contain all the grades of 100 different students meaning the column
     * will be in a length of one hundred names and the length of each row will change
     * depending on the amount of grades updated for the suitable student.
     */
    public static int [][] listOfGrades = new int [100][];
    public static String [] listOfNames = new String [100];
    static int MAX_AMOUNT_OF_STUDENTS_IN_THE_SYSTEM = 100;
    public static void addingAStudent(){
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter grades:");
        int... grades = scanner.nextInt();

    }
    public static void presentinAllStudents(){
        boolean isTheListEmpty  = isTheListOfStudentsEmpty();
        if (isTheListEmpty){
            System.out.println("No student records available.");
            return;
        } else {

        }

    }
    public static void averageOfASpecificStudent(){
        System.out.println("Enter student name:");
        String studentName = scanner.next();
        int i = findTheSpecifcStudent(studentName);
        if (i == -1){
            System.out.println("No student found with name "+studentName);
            return;
        }
        System.out.println("Average grade for <name>: <average>");
    }
    public static void averageOfPerformingStudent(){
        boolean isTheListEmpty  = isTheListOfStudentsEmpty();
        if (isTheListEmpty){
            System.out.println("No student records available.");
            return;
        }
        int maxAverage = 0;
        int indexOfPerformingStudent = 0;
        for (int i = 0; i < listOfGrades.length; i++){
            if (averageOfStudent[i] > maxAverage){
                maxAverage = averageOfStudent[i];
                indexOfPerformingStudent = i;
            }

        }

    }

    /**
     * In this function
     * @param studentName
     * @return
     */
    public static int findTheSpecifcStudent(String studentName){
        for (int i = 1; i <= MAX_AMOUNT_OF_STUDENTS_IN_THE_SYSTEM; i++){
            if (listOfNames[i] == studentName){
                return i;
            }
        }
        return -1;
    }

    public static boolean isTheListOfStudentsEmpty (){
        for (int i = 0; i<= MAX_AMOUNT_OF_STUDENTS_IN_THE_SYSTEM; i++){
            if (listOfNames[i] != null);
            return false;
        }
        return true;
    }
    public static int numberOfStudentsInTheSystem(){
        int counterOfStudentsInTheSystem = 0;

    }
    public static int averageOfStudent(){

    }

    public static void manageGrades() {
        boolean flag = true;
        while (flag == true) {
            System.out.println("Welcome to the Student Grade Management System!");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Calculate a student’s average grade ");
            System.out.println("4. Find the top performing student");
            System.out.println("5. Exit");
            System.out.println(",Please enter your choice");
            int choice = scanner.nextInt();
            while (choice < 0 && choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    addingAStudent();
                case 2:
                    presentinAllStudents();
                case 3:
                    averageOfASpecificStudent();
                case 4:
                    averageOfPerformingStudent();
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    flag = false;
            }
        }
    }
    /*
    executing the program as long as the fifth choice hasn't been chosen, this will
    require a boolean variable
     */


    public static void main(String[] args) throws IOException {
        String path = args[0];
        scanner = new Scanner(new File(path));
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTests; i++) {
            System.out.println("Test number " + i + " starts.");
            try {
                manageGrades();
            } catch(Exception e){
                System.out.println("Exception " + e);
            }
            System.out.println("Test number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All tests have ended.");
    }
}