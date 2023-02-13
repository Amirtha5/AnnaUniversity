import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

class Student {
    String name;
    int cutOffMarks;
    String branch;



    public String getName() {
        return name;
    }

    public int getcutOffMarks() {
        return cutOffMarks;
    }

    public String getBranch() {
        return branch;
    }

}

class College {
    String name;
    int filledSeats;
    boolean vacantSeats;



    public String getName() {
        return name;
    }
    public void fillSeat() {
        filledSeats++;
    }

    public boolean VacantSeats() {
        return vacantSeats ;
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        input.nextLine();

        System.out.println("Enter the details of students : ");
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter  the student roll number: ");
            int rollNumber = input.nextInt();
            System.out.print("Enter the total marks:");
            int totalMarks = input.nextInt();
            System.out.print("Enter the obtained marks:");
            int obtainedMarks = input.nextInt();
            double cutoffPercentage = (obtainedMarks * 100) / totalMarks;
            System.out.println("Your cutoff percentage is:" + cutoffPercentage);
            input.nextLine();
            System.out.println("Enter the maths marks:");
            int maths=input.nextInt();
            System.out.println("Enter the chem marks:");
            int chem=input.nextInt();
            System.out.println("Enter the phy marks:");
            int phy=input.nextInt();
            maths=maths/2;
            chem=chem/4;
            phy=phy/4;
           int cutOff=maths+chem+phy;

            System.out.print("Enter the colleges(1-Rathinam,2-PSG,3-CIT):");
            int college = input.nextInt();

            System.out.print("Enter student's branch  (1-CSE, 2-IT, 3-Mech):");
            int branch = input.nextInt();

            System.out.println("Counseling Report");
            System.out.println("-----------------");

            System.out.println("Roll Number: " + rollNumber);
            System.out.println("cutoff:"+ cutOff);
            System.out.println("College:" + college);
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
                    System.out.println("College Alloted: Rathinam");
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
