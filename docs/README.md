## 구현할 기능 목록

### 입력
- 자동차 이름은 5자 이하만 가능
- 자동차 이름은 쉼표를 기준으로 구분
- 시도할 회수(몇번의 이동) 입력 받기
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션 종료

### 출력
- 전진하는 자동차 출력
- 우승자 안내 문구
  - 경주 게임 완료 후 우승자 안내
  - 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분


### 경주
- 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우 전진
- 종료 후 누가 우승했는지를 알려줌





## 구현 요구 사항
- 지정된 라이브러리 사용
  - JDK에서 제공하는 Random 및 Scanner API 대신 camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현해야 한다.
    - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용한다.
    - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.
