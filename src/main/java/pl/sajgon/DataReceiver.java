package pl.sajgon;

import java.util.Scanner;

public class DataReceiver {

    Scanner scanner = new Scanner(System.in);

    String dataReceivedFromTheUser() {

        String dataFromTheUser = scanner.nextLine();

        if (dataFromTheUser.equals("all") || dataFromTheUser.equals("ALL") ||
                dataFromTheUser.equals("All") || dataFromTheUser.equals("")) {
            return dataFromTheUser;
        }

        char[] charArray = dataFromTheUser.toCharArray();

        for (int i = 0; i <= charArray.length - 1; i++) {
//            System.out.println(charArray[i]);
            if (charArray[i] < 49 || charArray[i] > 54) {
                charArray[i] = ' ';
            }
        }
        String returnData = String.valueOf(charArray).replaceAll(" ", "");

        if (returnData.length() > 6) {
            System.out.println("incorrect data, to many chars input");
            return "ERROR";
        }
        return returnData;
    }

}
