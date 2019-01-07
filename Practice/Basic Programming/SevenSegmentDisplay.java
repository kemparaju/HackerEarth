import java.util.*;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        int[] segmentNumbers = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int numOfSticks = 0;
        int t;
        
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        String[] resultArray = new String[t];

        for(int i=0; i<t; i++) {
            String num = in.next();
            numOfSticks = 0;

            for(String c : num.split("")) {
                numOfSticks += segmentNumbers[Integer.valueOf(c)];
            }
            int oddOnes = 0;
            
            if(numOfSticks%2 != 0) {
                oddOnes = numOfSticks - 3;
                numOfSticks -=3;
            }
            
            int countOfOnes = numOfSticks/2;
            char[] result = new char[countOfOnes];

            Arrays.fill(result, '1');
            String resultStr = String.valueOf(result);
            
            if(oddOnes > 0)
                resultStr = "7" + resultStr;
                
            resultArray[i] = resultStr;
        }
        
        for(int i=0;i<t;i++) 
            System.out.println(resultArray[i]);

        in.close();
    }
}