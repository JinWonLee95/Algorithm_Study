package SW_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No7272 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine());

        for(int i=0; i<Case; i++){
            String[] word = br.readLine().split(" ");

            StringBuilder fc = new StringBuilder();
            StringBuilder sc = new StringBuilder();

            if(word[0].length() != word[1].length()){
                System.out.println("#"+(i+1)+" DIFF");
            }else {
                for (int j = 0; j < word[0].length(); j++){
                    switch (word[0].charAt(j)){
                        case 'A':
                        case 'D':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                            fc.append("1");
                            break;
                        case 'B':
                            fc.append("2");
                            break;
                            default:
                                fc.append("0");
                                break;
                    }
                    switch (word[1].charAt(j)){
                        case 'A':
                        case 'D':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                            sc.append("1");
                            break;
                        case 'B':
                            sc.append("2");
                            break;
                            default:
                                sc.append("0");
                                break;
                    }
                }

                if(fc.toString().equals(sc.toString())){
                    System.out.println("#"+(i+1)+" SAME");
                }else{
                    System.out.println("#"+(i+1)+" DIFF");
                }
            }
        }
    }
}
