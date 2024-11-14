import java.util.Scanner;

public class IT24104271Lab4Q2 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int status = 0;
               System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();

                if (examMarks < 0 || examMarks > 100) {
            status = 1;         }

        
        else if (status == 0) { 
            System.out.print("Please enter lab submission marks (out of 100): ");
            int labMarks = scanner.nextInt();

                        if (labMarks < 0 || labMarks > 100) {
                status = 2;
            }

            
            else if (status == 0) {
                System.out.print("Please enter the percentages given for the exam: ");
                int examPercentage = scanner.nextInt();

                
                System.out.print("Please enter the percentages given for the lab submission: ");
                int labPercentage = scanner.nextInt();

                                if (examPercentage + labPercentage != 100) {
                    status = 3;                 }

                
                else {
                    double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
                    System.out.println("Final Exam Marks is : " + finalMark);
                }
            }
        }

                switch (status) {
            case 1:
                System.out.println("Invalid input for exam marks. Terminating program.");
                break;
            case 2:
                System.out.println("Invalid input for lab marks. Terminating program.");
                break;
            case 3:
                System.out.println("The percentages must add up to 100. Terminating program.");
                break;
            default:
                
                break;
        }
    }
}
