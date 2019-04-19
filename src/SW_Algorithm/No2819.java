package SW_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2819 {
    static String[][] tile = new String[4][4];
    static StringBuilder num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String C = br.readLine();
        int cases = Integer.parseInt(C);

        for(int i=cases; i>0; i--){
            String temp;
            int j=0;

            while(j<4){
                    tile[j] = br.readLine().split(" ");
                    j++;
            }

            int x =(int) (Math.random()*3)+0;
            int y =(int) (Math.random()*3)+0;

            System.out.println(x+"////"+y);

            num.append(tile[x][y]);

            while(num.length() < 7){
                int direction = (int) (Math.random()*4) + 1;

                switch (direction){
                    case 1:
                        if(y != 3){
                            num.append(tile[x][y+1]);
                        }
                        break;
                    case 2:
                        if(y != 0){
                            num.append(tile[x][y-1]);
                        }
                        break;
                    case 3:
                        if(x != 3){
                            num.append(tile[x+1][y]);
                        }break;
                    case 4:
                        if(x != 0){
                            num.append(tile[x-1][y]);
                        }
                }

            }
            System.out.println(num);
        }
    }
}
