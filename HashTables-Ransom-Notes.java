import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        String flag="";
        Map<String,Integer> magazineWords = new HashMap<String,Integer>();
        Map<String,Integer> ransomWords = new HashMap<String,Integer>();

        for(String mword: magazine){
            if(!magazineWords.containsKey(mword)){
                magazineWords.put(mword,1);
            }
            else{
                magazineWords.put(mword,magazineWords.get(mword)+1);
            }
        }
        for(String rword: note){
            if(!ransomWords.containsKey(rword)){
                ransomWords.put(rword,1);
            }
            else{
                ransomWords.put(rword,ransomWords.get(rword)+1);
            }
        }

        for(String rkey: ransomWords.keySet()){
            if(magazineWords.containsKey(rkey)){
                flag = "Yes";
                int needed = ransomWords.get(rkey);
                if(magazineWords.get(rkey) < needed){
                    flag="No";
                    break;
                }
            }
            else {
                flag="No";
                break;
            }
        }

        System.out.println(flag);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
