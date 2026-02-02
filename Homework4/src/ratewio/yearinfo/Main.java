package ratewio.yearinfo;

import ratewio.yearinfo.util.YearUtils;

import java.util.Scanner;

class Main{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while(true){
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            System.out.print("Enter days: ");
            int     days = sc.nextInt(),
                    right_days = YearUtils.getDaysInYear(year);

            if(days == right_days){
                score++;
                System.out.println("Right! +1 score");
            }else{
                System.out.println("Mistake :(\n" + year + " have " + right_days + "days!");
                break;
            }
        }
        System.out.println("Total score: " + score);
    }
}