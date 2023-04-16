# SpringTest

Spring을 공부하면서 배운 것을 테스트 해보기 위한 Repo

- 2023-04-08
  - 테스트 코드 작성 테스트
- 2023-04-14
  - aspect 코드 작성
- 2023-04-16
  - Main controller 테스트 코드 작성중
    - Controller에 요청 했을 때, service로부터 아무런 응답이 오지 않는 문제 확인 필요.
- 2023-04-17
  - Main controller 테스트 코드 작성 완료
    - 이유
      - service를 Mockbean으로 선언했을 때 expect로 예상되는 응답값 선언 필요
    - 추가 사항
      - mockBean으로 선언시와 testRestTemple으로 선언시 따로 분리 필요
