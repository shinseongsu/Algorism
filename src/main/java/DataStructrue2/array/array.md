# 배열

---

### 배열은 왜 필요할까?
- 같은 종류의 데이터를 효율적으로 관리하기 위해 사용
- 같은 종류의 데이터를 순차적으로 저장
- 장점:
    - 빠른 접근 가능
        - 첫 데이터의 위치에서 상대적인 위치로 데이터 접근(인덱스 번호로 접근)
- 단점:
  - 데이터 추가/삭제의 어려움
    - 미리 최대 길이를 지정해야 함
    
<br>

> 참고: primitive 자료형과 Wrapper 클래스
> - java 내에서는 int와 Integer 같이, primitive자료형과 Wrapper 클래스가 있음.
> - Wrapper 클래스는 null 처리가 용이하고, ArrayList 등 객체만을 핸들링 하는 기능을 사용.

<br>

- New 키워드를 사용해서, 배열을 미리 선언하고, 데이터를 넣을 수도 있음.
```java
Integer[] data_list = new Integer[10];
data_list[0] = 1;
```

- 직접 배열 데이터 선언시 넣을 수도 있음
```java
Integer data_list1[] = {5,4,3,2,1};
Integer[] data_list2 = {1,2,3,4,5};
```

<br>


### JAVA에서 배열을 보다 손쉽게 다루기 위한 클래스등을 제공

```java
import java.util.Arrays;

System.out.println(Arrays.toString(data_list2));
```

### Java 에서 배열을 보다 손쉽게 다루기 위한 ArrayList 클래스
- ArrayList 클래스는 가변 길이의 배열 자료구조를 다룰 수 있는 기능을 제공함.

> 참고: List와 ArrayList
> - 다음과 같이 List와 ArrayList 선언의 차이점
> ```
> List<Integer> list1 = new ArrayList<Integer>();
> ArrayList<Integer> list1 = new ArrayList<Integer>();
> ```
> - List는 인터페이스이고, ArrayList는 클래스임.
>   -  클래스는 크게 일반 클래스와 클래스 내에 '추상 메서드'가 하나 이상 있거나, abstract로 추상 클래스로 나뉨.
>   - 인턴페이스는 모든 메서드가 추상 메서드인 경우를 의미하며, 인터페이스를 상속받는 클래스는 인터페이스에서 정의된 추상 메서드를 모두 구현해야 함. ( 따라서 다양한 클래스를 상속받는 툭정 인터페이스는 결국 동일한 메서드를 제공함.)
>   - ArrayList가 아니라, List로 선언된 변수는 다음과 같이 필요에 따라 다른 리스트 클래스를 쓸 수 있는 **구현상의 유연성**을 제공함.
>   ```java
>   List<Integer> list1 = new ArrayList<Integer>();
>   list1 = new LinkedList<Integer>();
>   ```

- JAVA에서는 기본적으로 java.util 패키지에 가변 크기의 배열을 다룰 수 있는 ArrayList 클래스도 제공하고 있음.
```java
import java.util.ArrayList;

ArrayList<Integer> list1 = new ArrayList<Integer>();

list1.add(1);   // 배열에 아이템 추가 시 add 메서드 사용
list1.add(2);
list1.get(0);   // 특정 배열의 값을 빼오는 메서드

list1.set(0, 5);    // 특정 인덱스에 해당하는 아이템 변경
list1.remove(0);    // 특정 인덱스에 해당하는 아이템 삭제 시, remove() 메서드 사용.

list1.size();       // 배열 길이 확인하기
```

<br>

- java에서는 기본 문법으로 다차원 배열도 작성 가능 (2차원 배열)
```java
Integer data_list[][] = { {1,2,3}, {4,5,6} };

System.out.println(data_list[0][1]);    // 2
System.out.println(data_list[1][1]);    // 5
```

- 3차원 배열

```java
Integer[][][] data_list = {
        {
            {1, 2, 3},
            {4, 5, 6}
        }, 
        {
            {7, 8, 9},
            {10, 11, 12}
        }
};

System.out.println(data_list[0][1][1]); // 5
System.out.println(data_list[1][1][2]); // 12
```
