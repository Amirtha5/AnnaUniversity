
import java.util.Scanner;
//import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

class Student {
    //College college=new College();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int i, j, temp;
        System.out.println("Enter the details of students ");
        int[] cutOff;
        cutOff = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the name:");
            String name = input.next();
            System.out.println("Enter  the student roll number: ");
            int rollNumber = input.nextInt();
            System.out.println(rollNumber);
            System.out.print("Enter the total marks:");
            int totalMarks = input.nextInt();
            System.out.print("Enter the obtained marks:");
            int obtainedMarks = input.nextInt();
            float cutoffPercentage = (obtainedMarks * 100) / totalMarks;
            System.out.println("Your percentage is:" + cutoffPercentage);
            input.nextLine();
            System.out.println("Enter the maths marks:");
            int maths = input.nextInt();
            System.out.println("Enter the chem marks:");
            int chem = input.nextInt();
            System.out.println("Enter the phy marks:");
            int phy = input.nextInt();
            int cutOffMarks = (maths / 2) + (chem / 4) + (phy / 4);
            cutOff[i] = cutOffMarks;
            System.out.println("Counseling Report");
            System.out.println("-----------------");
            System.out.println("name:" + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("cutoff:" + cutOffMarks);
            System.out.println("\n");
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (cutOff[i] < cutOff[j]) {
                    temp = cutOff[i];
                    cutOff[i] = cutOff[j];
                    cutOff[j] = temp;

                }
            }
            System.out.println(cutOff[i]);
        }
    }
}
class College {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print("Enter the colleges(1-RATHINAM,2-PSG,3-CIT):");
            int college = input.nextInt();

            System.out.print("Enter student's branch  (1-CSE, 2-IT, 3-Mech):");
            int branch = input.nextInt();

            System.out.println("Counseling Report");
            System.out.println("-----------------");
            System.out.println("college:" + college);
            System.out.println("branch:" + branch);
            switch (branch) {
                case 1:
                    System.out.println("Branch Alloted: CSE");
                    break;
                case 2:
                    System.out.println("Branch Alloted: IT");
                    break;
                case 3:
                    System.out.println("Branch Alloted: Mech");
            }
            switch (college) {
                case 1:
                    System.out.println("College Alloted: RATHINAM");
                    break;
                case 2:
                    System.out.println("College Alloted: PSG");
                    break;
                case 3:
                    System.out.println("College Alloted: CIT");
            }
        }
    }
}