package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class No2667 {

    static int number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int danji = 2;
        ArrayList<Integer> arr = new ArrayList<>();
        int[][] matrix  = new int[N][N];

        for(int i = 0; i < N; i++){
            String st1 = br.readLine();
            for(int j =0; j<N; j++){
                matrix[i][j] = Character.getNumericValue(st1.charAt(j));
            }
        }

        for(int i=0; i<N;i++){
            for(int j=0;j<N;j++){
                if(matrix[i][j] == 1){
                    sol(matrix,i,j,danji++);
                    arr.add(number);
                    number = 0;
                }
            }
        }

        Collections.sort(arr);

        System.out.println(danji - 2);
        for(int i = 0;i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        br.close();
    }

    public static void sol(int[][] matrix,int x,int y,int danji){
        matrix[x][y] = danji;
        number++;
        if(x>0 && matrix[x-1][y] == 1){
            sol(matrix,x-1,y,danji);
        }
        if(x<matrix.length-1 && matrix[x+1][y] == 1){
            sol(matrix,x+1,y,danji);
        }
        if(y>0 && matrix[x][y-1] == 1){
            sol(matrix,x,y-1,danji);
        }
        if(y<matrix.length-1 && matrix[x][y+1] == 1){
            sol(matrix,x,y+1,danji);
        }
    }

}
