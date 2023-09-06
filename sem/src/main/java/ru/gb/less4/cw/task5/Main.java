package ru.gb.less4.cw.task5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        https://leetcode.com/problems/simplify-path/
        System.out.println("simplifyPath() = " + simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (token.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!token.equals(".") && !token.isEmpty()) {
                stack.push(token);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()).insert(0, "/");
        }
        return result.toString();
    }
}
