package com.ohgiraffers.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        float kPoint = 80.5f;
        float mPoint = 50.6f;
        float ePoint = 70.8f;
        int result1 = (int)(kPoint + mPoint + ePoint);
        int result2 = (int)(kPoint + mPoint + ePoint)/3;

        System.out.println("총점 : " + result1);
        System.out.println("평균 : " + result2);
    }
}
