package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=7;
        String r="";
        if (n == 1) {
            r = "a";
        } else {


            StringBuilder sb = new StringBuilder();
            sb.append('a');

            if (n % 2 == 0) {
                for (int i = 0; i < n - 1; i++) {
                    sb.append('c');
                }
            } else {
                sb.append('b');
                for (int i = 0; i < n - 2; i++) {
                    sb.append('c');
                }
            }


        System.out.println(sb.toString());
        }
    }
}
