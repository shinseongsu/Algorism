## 대표적인 데이터 구조4: 큐 (Queue)

---

### 큐 구조
- 줄을 서는 행위와 유사
- 가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조
    - 음식점에서 가장 먼저 줄을 선 사람이 제일 먼저 음식점에 입장하는 것과 동일
    - FIFO(First-In, First-Out) 또는 LILO(Last-in, Last-Out) 방식으로 스택과 꺼내는 순서가 반대
    

> 알아둘 용어
> - Enqueue: 큐에 데이터를 넣는 기능
> - Dequeue: 큐에서 데이터를 꺼내는 기능


### JAVA 에서의 큐 자료 구조 사용하기
- JAVA 에서는 기본적으로 java.util 패키지에 Queue 클래스를 제공하고 있음.
  - Enqueue 에 해당하는 기능으로 Queue 클래스에서는 add(value) 또는 offer(value) 메서드를 제공함.
  - Dequeue 에 해당하는 기능으로 Queue 클래스에서는 poll() 또는 remove() 메서드르 제공함.
  - 아쉽게도 Queue 클래스에 데이터 생성을 위해서는 java.util 패키지에 있는 LinkedList 클래스를 사용해야 함.
    - LinkedList 클래스는 자료구조의 링크드리스트와 연관이 있으며, 관련 내용은 큐보다 복잡하므로 이후 챕터에서 상세히 익히도록 함.
    

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> queue_int = new LinkedList<Integer>();

// 데이터 추가
queue_int.add(1);
queue_int.offer(2);

// 데이터 꺼내기
queue_int.poll();
```


> 참고: 어디에 큐가 많이 쓰일까?
> - 멀티 태스킹을 위한 프로세스 스케줄링 방식을 구현하기 위해 많이 사용됨.
>   - 큐의 경우에는 장단점보다는 큐의 활용 예로 프로세스 스케줄링 방식을 함께 이해해두는 것이 좋음.

