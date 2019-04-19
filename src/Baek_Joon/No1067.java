package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No1067 {
    static int S; // 최대점수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> X = new LinkedList<>();
        Queue<Integer> Y = new LinkedList<>();

        String[] temp = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            X.offer(Integer.parseInt(temp[i]));
        }

        temp = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            Y.offer(Integer.parseInt(temp[i]));
        }

    }

    public Queue<Integer> circulation(Queue<Integer> q){
        int tmp = q.poll();
        q.offer(tmp);

        return q;
    }

    public void getSum(Queue<Integer> q1, Queue<Integer> q2, int size){
        for (int i=0; i<size; i++){
            S += q1.poll()*q2.poll();
        }
    }

}
