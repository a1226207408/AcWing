package 算法基础课.基础算法.前缀和与差分;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CWB
 * @date 2022/4/22
 * @apiNote
 */
public class AC796_子矩阵的和 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int row = Integer.parseInt(line[0]);
        int col = Integer.parseInt(line[1]);
        int query = Integer.parseInt(line[2]);
        int[][] a = new int[row][col];
        int[][] s = new int[row+1][col+1];
        for(int i=0;i<row;i++){
            line = br.readLine().split(" ");
            for(int j=0;j<col;j++){
                a[i][j] = Integer.parseInt(line[j]);
            }
        }
        for(int i=1;i<row+1;i++){
            for(int j=1;j<col+1;j++){
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + a[i-1][j-1];
            }
        }
        while(query-- > 0){
            line = br.readLine().split(" ");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int x2 = Integer.parseInt(line[2]);
            int y2 = Integer.parseInt(line[3]);
            System.out.println(s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + s[x1-1][y1-1]);
        }
    }

}
