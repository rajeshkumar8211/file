/*package SmallPrograms;

import java.util.Scanner;

class example {
    static int ch;
    static double gpacal=0.0;
    private static void CgpaCal(){
        int sems;
        char st = 0;
        double cgpa = 0.0;
        int i;
        System.out.println("\nEnter your Semester");
        sems =sc.nextInt();
        for (i=1;i<=sems;i++) {
            System.out.println("\nDo you know your semester - "+ i+" gpa(Y/N)");
            st = sc.next().toUpperCase().charAt(0);
            if (st == 'Y') {
            } else if (st == 'N') {
                cgpa=0.0;
                cgpa= Semester(i);
            } else {
                System.out.println("SORRY YOU ENTER A WRONG LETTER \n\n THANK YOU");
                System.exit(0);
            }

        }
        switch (sems){
            case 1:{
                if(st=='Y'){
                System.out.println("\nEnter your semester - "+i+" gpa:");
                cgpa= sc.nextDouble();
                }
                System.out.println("Your 1st semester gpa is your current cgpa"+cgpa);
                break;
            }
            case 2:{
                if(st=='Y'){
                    double first;
                    double second;
                    System.out.println("\nEnter your 1st semester gpa:");
                    first= sc.nextDouble();
                    System.out.println("\nEnter your 2nd semester gpa:");
                    second= sc.nextDouble();
                    cgpa=((first*22)+(second*26))/48;
                } else if (st=='N') {
                    cgpa/=48;
                }
                else {
                    System.out.println("SORRY YOU ENTER A WRONG LETTER \n\n THANK YOU");
                    System.exit(0);
                }
                System.out.println("Your CGPA is :"+cgpa);
                break;
            }
            case 3:{
                if(st=='Y'){
                    double first,second,third;
                    System.out.println("\nEnter your 1st semester gpa:");
                    first= sc.nextDouble();
                    System.out.println("\nEnter your 2nd semester gpa:");
                    second= sc.nextDouble();
                    System.out.println("\nEnter your 3rd semester gpa:");
                    third= sc.nextDouble();
                    cgpa=((first*22)+(second*26)+(third*23))/71;
                } else if (st=='N') {
                    cgpa/=71;
                }
                else {
                    System.out.println("SORRY YOU ENTER A WRONG LETTER \n\n THANK YOU");
                    System.exit(0);
                }
                System.out.println("Your CGPA is :"+cgpa);
                break;
            }
            case 4:{
                if(st=='Y'){
                    double first,second,third,fourth;
                    System.out.println("\nEnter your 1st semester gpa:");
                    first= sc.nextDouble();
                    System.out.println("\nEnter your 2nd semester gpa:");
                    second= sc.nextDouble();
                    System.out.println("\nEnter your 3rd semester gpa:");
                    third= sc.nextDouble();
                    System.out.println("\nEnter your 4th semester gpa:");
                    fourth= sc.nextDouble();
                    cgpa=((first*22)+(second*26)+(third*23)+(fourth*22))/93;
                } else if (st=='N') {
                    cgpa/=93;
                }
                else {
                    System.out.println("SORRY YOU ENTER A WRONG LETTER \n\n THANK YOU");
                    System.exit(0);
                }
                System.out.println("Your CGPA is :"+cgpa);
                break;
            }
        }
    }
    private static double GpaCal(double semgpa,int totcre){
        semgpa=semgpa/totcre;
        return semgpa;
    }
    static Scanner sc =new Scanner(System.in);
    private static double assignvalue(double cre){
        String grade;
        double value =0.0;
        double mark;
        System.out.println("\nEnter your grade");
        grade=sc.next().toUpperCase();
        switch (grade){
            case "O": {
                value=10.0;
                break;
            }
            case "A+": {
                value=9.0;
                break;
            }
            case "A": {
                value=8.0;
                break;
            }
            case "B+": {
                value=7.0;
                break;
            }
            case "B": {
                value=6.0;
                break;
            }
            case "C": {
                value=5.0;
                break;
            }
            case "U":{
                value=0.0;
                break;

            }
            default:{
                System.out.println("Please Enter a Valid Grade");
                break;
            }
        }
        mark=value*cre;
        gpacal+=mark;
        return gpacal;
    }
    private static double Semester(int s){
        double firstsem;
        int sem;
        sem=s;
        if(sem==0) {
            System.out.println("\nEnter your semester");
            sem = sc.nextInt();
            Semester(sem);
        }
        else{
            switch (sem) {
                case 1: {
                    System.out.println("Enter your Professional English-I Grade (HS3152)");
                    assignvalue(3.0);
                    System.out.println("Enter your Matrices And Calculus Grade (MA3151)");
                    assignvalue(4.0);
                    System.out.println("Enter your Engineering Physics Grade (PH3151)");
                    assignvalue(3.0);
                    System.out.println("Enter your Engineering Chemistry Grade (CY3151)");
                    assignvalue(3.0);
                    System.out.println("Enter your Heritage Of Tamil Grade (GE3152)");
                    assignvalue(1.0);
                    System.out.println("Enter your Problem Solving And Python Programming Grade (GE3151)");
                    assignvalue(3.0);
                    System.out.println("Enter your Problem Solving And Python Programming Laboratory Grade (GE3171)");
                    assignvalue(2.0);
                    System.out.println("Enter your Physics And Chemistry Laboratory Grade (BS3171)");
                    assignvalue(2.0);
                    System.out.println("Enter your English Laboratory Grade (BS3171)");
                    firstsem = assignvalue(1.0);
                    firstsem= GpaCal(firstsem, 22);
                    System.out.println("Your 1st semester gpa is " + firstsem);
                    return firstsem;
                }
                case 2: {
                    System.out.println("Enter your Professional English-II Grade (HS3252)");
                    assignvalue(2.0);
                    System.out.println("Enter your Statistics And Numerical Methods Grade (MA3251)");
                    assignvalue(4.0);
                    System.out.println("Enter your Physics For Information Science Grade (PH3256)");
                    assignvalue(3.0);
                    System.out.println("Enter your Basic Electrical And Electronics Engineering Grade (BE3151)");
                    assignvalue(3.0);
                    System.out.println("Enter your Engineering Graphics Grade (GE3251)");
                    assignvalue(4.0);
                    System.out.println("Enter your Programming In C Grade (CS3251)");
                    assignvalue(3.0);
                    System.out.println("Enter your Tamil And Technology Grade (GE3152)");
                    assignvalue(1.0);
                    System.out.println("Enter your Programming In C Laboratory Grade (CS3271)");
                    assignvalue(2.0);
                    System.out.println("Enter your Engineering Practices Laboratory Grade (GE3271)");
                    assignvalue(2.0);
                    System.out.println("Enter your Communication Laboratory/Foreign Laboratory Grade (GE3272)");
                    firstsem = assignvalue(2.0);
                    if(ch==1) {
                        firstsem = GpaCal(firstsem, 26);
                        System.out.println("Your 2nd semester gpa is " + firstsem);
                    }
                    return firstsem;
                }
                case 3: {
                    System.out.println("Enter your Discrete Mathematics Grade (MA3354)");
                    assignvalue(4.0);
                    System.out.println("Enter your Digital Principles And Computer Organization Grade (CS3351)");
                    assignvalue(4.0);
                    System.out.println("Enter your Foundation  Of Data Science Grade (CS3352)");
                    assignvalue(3.0);
                    System.out.println("Enter your Data Structures Grade (CS3301)");
                    assignvalue(3.0);
                    System.out.println("Enter your Object Oriented And Programming Grade (CS3391)");
                    assignvalue(3.0);
                    System.out.println("Enter your Professional Development Grade (GE3361)");
                    assignvalue(1.0);
                    System.out.println("Enter your Data Structures Laboratory Grade (CS3311)");
                    assignvalue(1.5);
                    System.out.println("Enter your Data Science Laboratory Grade (CS3381)");
                    assignvalue(2.0);
                    System.out.println("Enter your Object Oriented And Programming Laboratory Grade (CS3361)");
                    firstsem = assignvalue(1.5);
                    if(ch==1) {
                        firstsem = GpaCal(firstsem, 23);
                        System.out.println("Your 3rd semester gpa is " + firstsem);
                    }
                    return firstsem;
                }
                case 4: {

                    System.out.println("Enter your Theory Of Computation Grade (CS3452)");
                    assignvalue(3.0);
                    System.out.println("Enter your Artificial Intelligence And Machine Learning Grade (CS3491)");
                    assignvalue(4.0);
                    System.out.println("Enter your DataBase Management System Grade (CS3492)");
                    assignvalue(3.0);
                    System.out.println("Enter your Algorithms Grade (CS3401)");
                    assignvalue(4.0);
                    System.out.println("Enter your Introduction To Operating Systems Grade (CS3451)");
                    assignvalue(3.0);
                    System.out.println("Enter your Environmental Science And Sustainability Grade (GE3451)");
                    assignvalue(1.0);
                    System.out.println("Enter your Operating Systems Laboratory Grade (CS3461)");
                    assignvalue(1.5);
                    System.out.println("Enter your DataBase Management System Laboratory Grade (CS3481)");
                    assignvalue(1.5);
                    System.out.println("Enter your Object Oriented And Programming Laboratory (BS3171)");
                    firstsem= assignvalue(2.0);
                    if(ch==1) {
                        firstsem = GpaCal(firstsem, 22);
                        System.out.println("Your 4th semester gpa is " + firstsem);
                    }
                    return firstsem;
                }
            }
        }
        return 1.0;
    }
    private static void calculate(){
        System.out.println("============\n\tMENU\n============\n\t1.GPA\n\t2.CGPA");
        System.out.println("\nEnter your choice to Calculate:");
        ch= sc.nextInt();
        if(ch==1){
            Semester(0);
        }
        else if (ch==2) {
            CgpaCal();
        }
        else {
            System.out.println("Please enter a valid choice");
        }
    }
    public static void main(String args[]){
        CGPACA.calculate();
    }
}*/
/*import java.util.*;

public class GPA_Calculator {

    // Method to convert grade letter to grade points
    static int getGradePoint(String grade) {
        switch (grade.toUpperCase()) {
            case "S": return 10;
            case "A": return 9;
            case "B": return 8;
            case "C": return 7;
            case "D": return 6;
            case "E": return 5;
            case "U": return 0; // FAIL
            default: return -1;
        }
    }

    // Calculate GPA for one semester
    static double calculateGPA(int[] credits, String[] grades) {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            int gp = getGradePoint(grades[i]);
            if (gp < 0) {
                System.out.println("Invalid grade entered!");
                return -1;
            }
            totalPoints += gp * credits[i];
            totalCredits += credits[i];
        }
        return (totalCredits > 0) ? (totalPoints / totalCredits) : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of semesters: ");
        int semCount = sc.nextInt();

        double[] gpas = new double[semCount];
        int[] semCredits = new int[semCount];
        double cgpaTotalPoints = 0;
        int cgpaCredits = 0;

        for (int s = 0; s < semCount; s++) {
            System.out.println("\n--- Semester " + (s+1) + " ---");
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            int[] credits = new int[n];
            String[] grades = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter credits for subject " + (i+1) + ": ");
                credits[i] = sc.nextInt();
                System.out.print("Enter grade for subject " + (i+1) + " (S/A/B/C/D/E/U): ");
                grades[i] = sc.next();
            }

            double gpa = calculateGPA(credits, grades);
            gpas[s] = gpa;

            int sumCredits = 0;
            for (int cr : credits) sumCredits += cr;

            semCredits[s] = sumCredits;
            cgpaTotalPoints += gpa * sumCredits;
            cgpaCredits += sumCredits;

            System.out.printf("GPA for semester %d = %.2f\n", (s+1), gpa);
        }

        double cgpa = (cgpaCredits > 0) ? (cgpaTotalPoints / cgpaCredits) : 0;

        System.out.println("\n======== RESULTS ========");
        for (int s = 0; s < semCount; s++) {
            System.out.printf("Semester %d GPA: %.2f\n", (s+1), gpas[s]);
        }
        System.out.printf("CGPA = %.2f\n", cgpa);
        System.out.println("=========================");

        sc.close();
    }
}*/