package SW_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No7193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Case = Integer.parseInt(br.readLine());

        for(int i=0; i<Case; i++){
            String[] testC = br.readLine().split(" ");
            int result = 0;

            int N = Integer.parseInt(testC[0]);
            String X = testC[1];
            int XL = X.length();

            for(int j=XL; j>0; j--){
                result += (X.charAt(j-1)-'0') * Math.pow(N,XL-j);
            }

            System.out.println("#"+i+" "+(result%(N-1)));
        }

    }
}
