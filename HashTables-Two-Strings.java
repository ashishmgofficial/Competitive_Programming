import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String flag="";
        Map<Character,Integer> stringOne = new HashMap<Character,Integer>();
        Map<Character,Integer> stringTwo = new HashMap<Character,Integer>();
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        for(char mword: s1Char){
            if(!stringOne.containsKey(mword)){
                stringOne.put(mword,1);
            }
            else{
                stringOne.put(mword,stringOne.get(mword)+1);
            }
        }
        for(char rword: s2Char){
            if(!stringTwo.containsKey(rword)){
                stringTwo.put(rword,1);
            }
            else{
                stringTwo.put(rword,stringTwo.get(rword)+1);
            }
        }

        for(char rkey: stringTwo.keySet()){
            if(stringOne.containsKey(rkey)){
                flag = "YES";
                break;
            }
            else {
                flag="NO";
            }
        }

        return flag;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
