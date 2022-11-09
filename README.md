# BaekjoonAlgorithm
Studying algorithm :fire:

## 시간 복잡도
- 시간 제한이 1초인 문제에 대한 예시
1. N의 범위가 500인 경우: 시간 복잡도가 O(N^3) 이하인 알고리즘을 설계하면 문제를 풀수 있다.
2. N의 범위가 2000인 경우: 시간 복잡도가 O(N^2) 이하인 알고리즘을 설계하면 문제를 풀수 있다.
3. N의 범위가 100000인 경우: 시간 복잡도가 O(NlogN) 이하인 알고리즘을 설계하면 문제를 풀수 있다.
4. N의 범위가 10000000인 경우: 시간 복잡도가 O(N) 이하인 알고리즘을 설계하면 문제를 풀수 있다.

- 라이브러리 시간복잡도
  - Arrays.sort는 DualPivotQuicksort 정렬방식을 사용하였고 평균: O(nlogn), 최악: O(n^2)의 시간 복잡도를 가진다.
  - Math.pow 연산은 일반적으로 O(logn)의 시간 복잡도를 갖는다. 반복문 안에서 위의 연산을 사용시 호출을 여러번 해야되므로 실행 시간이 오래 걸릴 수 있다. 그래서 제곱 연산은 일반적인 곱셈 연산으로 작성하는 것이 좋다.
  - LinkedList로 구현한 Queue는 offer(), peek(), poll(), size() 모두 O(1)의 시간복잡도를 갖는다. 
  - PriorityQueue로 구현한 Queue는 offer()과 poll()은 O(logn)의 시간복잡도를 갖고, peek()은 O(1)의 시간복잡도를 갖는다.

## Math

## Implementation

## Greedy

## String

## Data_Structure

## Graphs

## DP

## Geometry