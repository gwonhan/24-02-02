package com.ogiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /*수업목표. 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.*/
        /*필기.
        *   논리 연산자의 우선순위와 활용
        *  논리 & 연산자와 논리 | 연산자의 우선순위
        *  && : 11순위  // AND 연산자
        *  || : 12순위  // Or 연산자
        *  논리 && 연산자가 우선순위 논리 || 연산자 우선순위 보다 높다.
        * */


        /*목차. 1. 1부터 100 사이의 값인지 확인*/

        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 = " + (num1>= 1 && num1 <= 100));


        int num2 = 155;
        System.out.println("1부터 100 사이인지 확인 = " + (num2>= 1 && num2 <= 100));


        /*목차. 2. 영어 대문자인지 확인.*/

        char ch1 = 'G';
        int converCharToInt = ch1; // 형변환이다.(문자 자료형에서 인트형으로).
        System.out.println(converCharToInt);
        System.out.println("영어 대문자인지 확인 = " + (ch1>= 'A' && ch1 <= 'Z'));

        int converIntToChar =100;
        char result = (char) converIntToChar;  // 큰거에서 작은 것으로 가기 때문에 명시를 해주어야한다 강제적으로
        System.out.println("result = " + result); //


        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 = " + (ch2>= 'A' && ch2 <= 'Z'));
        // 아스키 코드 상에서 해당하는 숫자가 나와있다. 그렇기 때문에 맞는 범위인지만 확인하면 된다.



        /*목차. 3. 대소문자 상관 없이 영문자 y 인지 확인.*/

        char ch3 = 'Y';
        System.out.println("영어 y인지 확인 = " + (ch3== 'y' || ch3 == 'Y')); // 둘 중 하나만 맞아도 트루를 반환.


        /*목차. 4. 영문자인지 확인.*/
        char ch5 = 'f';
        System.out.println("영문자인지 확인 = " + ((ch5>= 'A' && ch5 <= 'Z') || (ch5>= 'a' && ch5 <= 'z'))); // 논리 연산자 엔드가 순위가 있기 때문에 괄호를 쳐주어야 한다.

        char ch6 = 'F';
        System.out.println("영문자인지 확인 = " + ((ch6>= 'A' && ch6 <= 'Z') || (ch6>= 'a' && ch6 <= 'z')));








    }
}
