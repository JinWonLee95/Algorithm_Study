package Algo_Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pg236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine());
        ArrayList<String> K;

        for(int i=0; i<Case; i++){
            String[] AB_Length = br.readLine().split(" ");
            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");

            K = new ArrayList<>();

            for(int j=0; j<A.length; j++){
                K.add(A[j]);
            }

            for(int x=0; x<B.length; x++) {
                if (!K.contains(B[x])) {
                    K.add(B[x]);
                }
            }

            System.out.println(K.size());

        }
    }
}
