package ques.q3;



import java.util.Scanner;


public class AllStudents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countScience = 1;
        int countHistory = 1;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Choose your Stream");
            System.out.println("Enter 1 for Science");
            System.out.println("Enter 2 for History");
            System.out.println("Enter 3 for Exit");
            int choise = Integer.parseInt(sc.nextLine());

            if (choise == 1) {

                System.out.println("Enter Science Student Details");
                ScienceStudent s = new ScienceStudent();
                System.out.println("Enter Student Name");
                s.setName(sc.nextLine());

                System.out.println("Enter Student addres");
                s.setAddress(sc.nextLine());

                System.out.println(" Student Math Marks ");
                s.mathmarks = Integer.parseInt(sc.nextLine());

                System.out.println("Student Chemistry marks ");
                s.chemistryMarks = Integer.parseInt(sc.nextLine());

                System.out.println("Student physics marks");
                s.physicsMarks = Integer.parseInt(sc.nextLine());

                ScienceStudent.noOfStudent = countScience++;
                int percentage = s.getpersentage();

                System.out.println("---------Science--------------");

                System.out.println("Student Name" + s.getName());
                System.out.println("Student Addres" + s.getAddress());
                System.out.println("Math" + s.mathmarks);
                System.out.println("Chemistry" + s.chemistryMarks);
                System.out.println("Physics" + s.physicsMarks);
                System.out.println("percentage" + percentage + "%");
                System.out.println("************************************");
                Student.geettotalStudent();
            } else if (choise == 2) {



                System.out.println("Enter Histoory  Student Details");
                HistoryStudent hs1 = new HistoryStudent();
                System.out.println("Enter Student Name");
                hs1.setName(sc.nextLine());

                System.out.println("Enter Student addres");
                hs1.setAddress(sc.nextLine());

                System.out.println(" Student history Marks ");
                hs1.historyMarks = Integer.parseInt(sc.nextLine());

                System.out.println("Student civics marks ");
                hs1.cicilMarks = Integer.parseInt(sc.nextLine());

             

                HistoryStudent.noOfStudent = countHistory++;
                int percentage = hs1.getpersentage();


               System.out.println("--------------History---------------");

	            System.out.println("Student Name:"+hs1.getName());
	            System.out.println("Student Address:"+hs1.getAddress());
	            System.out.println("History"+hs1.historyMarks);
	            System.out.println("Civics:"+hs1.cicilMarks);
	            System.out.println("Percentage:"+percentage+"%");
	            System.out.println("***********************************************");
	            Student.geettotalStudent();

            }
            else{
                System.out.println("Thanks You");
                break;
            }
        }
        sc.close();
    }

}