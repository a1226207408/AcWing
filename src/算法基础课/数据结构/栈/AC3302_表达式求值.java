package 算法基础课.数据结构.栈;


import java.io.*;
import java.util.*;

public class AC3302_表达式求值 {


    static Stack<Integer> nums = new Stack<>();
    static Stack<Character> ops = new Stack<>();
    static Map<Character, Integer> map = new HashMap<>();

    static void eval() {
        int a = nums.pop();
        int b = nums.pop();
        char op = ops.pop();
        int res = 0;
        if (op == '+') {
            res = b + a;
        } else if (op == '-') {
            res = b - a;
        } else if (op == '*') {
            res = b * a;
        } else {
            res = b / a;
        }
        nums.push(res);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map.put('(', 0);
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        String exp = br.readLine();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (isDigit(c)) {
                //计算数字
                int x = 0, j = i;
                while (j < exp.length() && isDigit(exp.charAt(j))) {
                    x = x * 10 + (exp.charAt(j) - '0');
                    j++;
                }
                nums.push(x);
                i = j - 1;
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (ops.peek() != '(') {
                    eval();
                }
                ops.pop();
            } else {
                while (!ops.isEmpty() && map.get(c) < map.get(ops.peek())) {
                    eval();
                }
                ops.push(c);
            }
        }
        while (!ops.isEmpty()) eval();
        System.out.println(nums.pop());
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }


}
