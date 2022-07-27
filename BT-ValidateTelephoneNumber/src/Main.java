import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try{

            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("Input phone number: ");
                String str = input.nextLine();

                String regex = "^([0-9]{2})-([0]{1}[0-9]{9})$";

                Pattern pattern = Pattern.compile(regex);

                if (pattern.matcher(str).find()){
                    System.out.println("Phone number is ok");
                    break;
                }else {
                    System.err.println("Phone number is not ok");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
