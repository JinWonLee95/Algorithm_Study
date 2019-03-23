package SW_Algorithm;

import java.io.*;
import java.util.ArrayList;

public class No2072 {
    static ArrayList<String[]> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String C = br.readLine();
        int cases = Integer.parseInt(C);

        for(int i=cases; i>0; i--){
            numbers.add(br.readLine().split(" "));
        }


        for(int i=0; i<cases; i++){
            int result =0;
            String[] temp = numbers.get(i);

            for(int j=0; j<temp.length; j++){
                int temp2 = Integer.parseInt(temp[j]);
                if(temp2%2 == 1){
                    result += temp2;
                }
            }
            System.out.println("#"+(i+1)+" "+result+"\n");
        }
    }
}
