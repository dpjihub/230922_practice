package com.ohgiraffers.operatorPractice;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 임의의 정수를 하나 선언하고 선언한 숫자가 짝수이면 "짝수다", 짝수가 아니면
         * "홀수다"를 출력하세요
         *
         * ------- 출력 결과 화면 ----------
         *
         * 예)정수 9를 선언했을 경우
         *
         * 홀수
         * */

        int testNum = 9;

        System.out.println("예) 정수 " + testNum + "를 선언했을 경우");
        System.out.println("");
        System.out.println((testNum/2 != 0 )?"홀수":"짝수");

    }
}
