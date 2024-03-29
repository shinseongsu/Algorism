### 링크드 리스트 (Linked List) 구조 

- 연결 리스트라고도 함
- 배열은 순차적으로 연결된 공간의 데이터를 나열하는 데이터 구조
- 링크드 리스트는 떨어진 곳에 존재하는 데이터를 화살표로 연결해서 관리하는 데이터 구조

<br>

- 링크드 리스트 기본 구조와 용어
    - 노드(Node): 데이터 저장 단위(데이터값, 포인터)로 구성
    - 포인터(pointer): 각 노드 안에서, 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간
    

### 링크드 리스트의 장단점
- 장점
    - 미리 데이터 공간을 미리 할당하지 않아도 됨.
        - 배열은 미리 데이터 공간을 할당 해야 함.
- 단점
    - 연결을 위한 별도 데이터 공간이 필요하므로, 저장공간 효율이 높지 않음.
    - 연결 정보를 찾는 시간이 필요하므로 접근 속도가 느림.
    - 중간 데이터 삭제시, 앞뒤 데이터의 연결을 재구성해야 하는 부가적인 작업 필요
    
### 링크드 리스트의 복잡한 기능1
  - 링크드 리스트는 유지 관리에 부가적인 구현이 필요함


*Node 클래스*
```java
public class Node<T> {
    T data;
    Node<T> next = null;
    
    public Node(T data) {
        this.data = data;
    }
}
```

*Node와 Node 연결하기 : Node 인스턴스간 연결*
```java
Node<Integer> node1 = new Node<Integer>(1);
Node<Integer> node2 = new Node<Integer>(2);
```

*링크드 리스트에 데이터 추가하기*
```java
node1.next = node2;
Node head = node1;
```

*링크드 리스트에 데이터 추가하기*
```java
public class SingleLinkedList<T> {
    public Node<T> head = null;
    
    public class Node<T> {
        T data;
        Node<T> next = null;
        
        public Node(T data) {
            this.data = data;
        }
    }
    
    public void addNode(T data) {
        if(head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }
    
    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null) {
                node= node.next;
                System.out.println(node.data);
            }
        }
    }
    
    public Node<T> search(T data) {
        if(this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while(node != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }
    
    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);
        
        if(searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }
}
```

```java
SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
MyLinkedList.addNode(1);
MyLinkedList.addNode(2);
MyLinkedList.addNode(3);

MyLinkedList.printAll();
```

### 링크드 리스트의 복잡한 기능1 (링크드 리스트 데이터 사이에 데이터를 추가)

- 링크드 리스트는 유지 관리에 부가적인 구현이 필요함.


### 다양한 링크드 리스트 구조: 더블 링크드 리스트(Doubly linked list)

- 더블 링크드 리스트(Doubly linked list) 기본구조
  - 이중 연결 리스트
  - 장점: 양방향으로 연결되어 있어서 노드 탐색이 양쪽으로 모두 가능

```java
public class DoubleLinkedList<T> {
  public Node<T> head = null;
  public Node<T> tail = null;

  public Node(T data) {
    this.data = data;
  }

  public void addNode(T data) {
    if (this.head == null) {
      this.head = new Node()<T> data;
      this.tail = this.head;
    } else {
        Node<T> node = this.head;
        while(node.next != null) {
            node = node.next;
        }
        node.next = new Node<T>(data);
        node.next.prev = node;
        this.tail = node.next;
    }
  }

  public void printAll() {
    if(this.head != null) {
      Node<T> node = this.head;
      System.out.println(node.data);
      while(node.next != null) {
          node = node.next;
          System.out.println(node.data);
      }
    }
  }
}

```


