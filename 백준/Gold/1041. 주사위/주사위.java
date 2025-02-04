import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int oneNum = Integer.MAX_VALUE;
        //주사위 정보 저장
        for(int i=0;i<6;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            oneNum = Math.min(arr[i], oneNum);	//주사위 수 최대값 구하기
        }
        //N이 1일 때 정육면체를 만드는 것이 아닌 주사위 자체가 정육면체
        if(N==1){
            Arrays.sort(arr);	//오름차순 정렬
            int answer = 0;
            //가장 큰 값을 밑에 있을 때 최소값
            for(int i=0;i<5;i++)
                answer += arr[i];
            bw.write(answer + "");
        }else{
            //N > 1일 때
            long three = 4;	//면 3개 개수
            long two = 4L *(N-1) + (N-2) * 4L;	//면 2개 개수
            long one = (long)N*N*5 - (three*3 + two*2);	//면 1개 개수
            //면 3개일 때 보여지는 수의 합 구하기
            int threeNum = Math.min(arr[0], arr[5]) + 
            		Math.min(arr[1],arr[4]) +  Math.min(arr[2], arr[3]);
            int twoNum = Integer.MAX_VALUE;
            //면 2개일 때 보여지는 수의 합 구하기
            for(int i=0;i<6;i++){
                for(int j=i+1;j<6;j++){
                    //주사위의 마주보는 면은 6이 됩니다.
                    //배열은 0부터 시작되기 때문에 5가 되면 마주보는 면이 됩니다.
                    //마주보는 면은 인접하지 않기 때문에 i+j != 5라는 조건을 사용하였습니다.
                    if(i+j != 5)	
                        twoNum = Math.min(twoNum, arr[i] + arr[j]);
                }
            }
            //보여지는 면 수의 합 계산
            long answer =one * oneNum + two * twoNum + three*threeNum;
            bw.write(answer + "");	//수의 합 BufferedWriter 저장
        }
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}