import java.util.ArrayList;
import java.util.Scanner;


public class ArraryTests {

    public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<>();
    boolean gameState = true;
    Scanner scan = new Scanner(System.in);
    int runNum = 0;
    while (gameState){

        System.out.println("Enter a number between  1-998:");
        System.out.println("**Enter 999 to quit**");
        String getNum = scan.nextLine();
        nums.add(Integer.parseInt(getNum));

        if(getNum.equals("999")){
            gameState = false;
            nums.remove(runNum);
        }

        runNum++;
    }

    System.out.println("All scores");
    System.out.println(nums);

    int average = 0;
    int total = 0;

    for(int i =0; i < nums.size(); i++){
        total = total + nums.get(i);

    }

    System.out.println("Total Scores:");
    System.out.println(total);

    average = total / nums.size();

    System.out.println("Average:");
    System.out.println(average);



    }





}
