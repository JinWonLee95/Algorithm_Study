package SW_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No7333 {

    static ArrayList<Integer> weights = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for(int c=0; c<cases; c++) {

            int boxes = Integer.parseInt(br.readLine());

            /* 무게 한 배열에 넣어놓기 */
            for (int i = 0; i < boxes; i++) {
                weights.add(Integer.parseInt(br.readLine()));
            }

            insertion_sort(weights); // 정렬
            int move_count = 0;         // 움직인 횟수

            /* 쌓을 수 있는 수 찾기 */
            for(int i=weights.size()-1; i>=0; i--){
                if(weights.get(i)>50){
                    move_count++;
                    weights.remove(i);
                }else if(weights.get(i)>25){

                }
            }
        }
    }

    /* 작은 박스 얹어 빼기 */
    public static int[] remove_Lt(int[] x,int y){
        for(int i=0; i<y; i++){
            if(x[i] != Integer.MAX_VALUE){
                x[i] = Integer.MAX_VALUE;
            }
        }
        return x;
    }

    public static ArrayList<Integer> insertion_sort(ArrayList<Integer> x){
        int tmp;
        for(int i=1; i<x.size(); i++){
            for(int j=i; j>0; j--){
                if(x.get(j)<x.get(j-1)){
                    tmp = x.get(j-1);
                    x.set(j-1,x.get(j));
                    x.set(j,tmp);
                }
            }
        }
        return x;
    }

}
