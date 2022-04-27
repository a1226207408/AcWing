package 算法基础课.基础算法.二分;
import java.util.*;
/**
 * @author CWB
 * @date 2022/4/28
 * @apiNote
 */
public class AC790_树的三次方根 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double l = -10000, r = 10000;
        while(r - l > 1e-8){
            double mid = (l + r) / 2;
            if(mid * mid * mid > d) r = mid;
            else l = mid;
        }
        System.out.printf("%.6f",l);
    }
}
