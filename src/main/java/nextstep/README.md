## 도메인 분석

Ladder -> Line -> Point -> Direction

in - out 방식으로 개발

### Ladder

false true-false true-false false true-false false

### Line

false true-false

### Point

true-false

## 요구사항

- [x] 입력
    - [x] 참가자 리스트 입력
    - [x] 실행 결과 입력
    - [x] 최대 사다리 높이 입력
    - [x] 결과를 보고 싶은 사람 입력
        - [x] 사람
        - [x] all
- [x] 출력
    - [x] 사람 이름 출력
    - [x] 사다리 게임 결과 출력
    - [x] 실행 결과 출력
    - [x] 결과 보고 싶은 사람 출력
- [x] 로직
    - [x] 사람 이름 최대 5글자 제한
    - [x] 사다리 생성
        - [x] 라인이 겹치지 않게 구현
    - [x] 사람 이름에 따른 사다리 폭 조절
    - [x] 특정 사다리의 결과를 출력한다.