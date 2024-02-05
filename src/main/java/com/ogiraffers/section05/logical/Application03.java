package com.ogiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {


         /*수업목표. 논리 연결연산자의 진리표에 대해 이해할 수 있다.*/
        /*필기.
        *   AND 연산과 OR 연산의 특징
        *  논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안 함.
        *  논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안 함. // 식이 길어지면 자원이 길어지기 때문에 공간 낭비를 줄이기 위해 안함
        * */

        /* 목차. 1. 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안함.*/
        /*필기.
        *   조건식 두 개가 모두 만족해야 true 를 반환하지만, 앞에서 미리 false 가 나오면
        *  뒤의 조건을 확인을 할 필요가 없이 false 를 반환한다.
        *  따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 faslse 가 나올 가능성이 높은 편을 작성하는 것이 좋다.*/
         // 연산을 줄이면 속도가 빨라진다.

        int num1 = 10;
        int result = (false && ++ num1 > 0)? num1 : num1 ;  // false 가 먼저 나오면 뒷 결과를 생각하지 않는다.
        System.out.println("&& 실행확인: " + result);

        /*목차. 2.논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행하지 않는다. */
        /*필기.
        *   조건식 둘 중 하나라도 true 를 반환하면 true를 반환하기 때문에 앞에서 미리 true 가 나오게 되면
        *  뒤의 조건을 확인 할 필요 없이 true 를 반환한다.
        *  따라서, 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞에 true 가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
        * */

        int num2 = 10;
        int result2 = (true || ++ num2 > 0)? num2 : num2 ; // 앞에가 투루라고 되어있으니 뒤에 연산을 진행하지 않는다.
        System.out.println("|| 실행확인 = " + result2);



    }
}
