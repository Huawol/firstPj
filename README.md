start

단계별 목표
1. 클래스 없이 기본적인 계산기 만들기
2. 클래스를 적용해서 기본적인 계산기 만들기
3. enum, 제네릭, 람다&스트림을 이해한 계산기 만들기

필수 요구 사항 :

1단계

2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
계산기는 exit 입력 받기전까지 계속해서 값을 받고 연산 결과를 반환한다.


2단계

계산된 결과 값들을 기록하는 컬렉션 제작
컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능

UML

![package](https://github.com/user-attachments/assets/b8c5e8f4-cbcb-41e9-9326-7871483fb69a)


예외처리 

1. InputMismatchException 예외처리 과정에서 \n이 남아서 무한루프를 만들어버리는 오류를 해결

2. InputMismatchException 예외처리
   https://taehyon.tistory.com/36
