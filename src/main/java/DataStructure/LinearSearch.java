package DataStructure;

/**
 * 선형 탐색(LinearSearch.java)
 *
 */
public class LinearSearch {

    /**
     * 테이블의 엔트리
     */
    class Entry {
        int     key;        // 비교 대상이 되는 키
        Object  data;    // 그 외의 정보

        /**
         * 엔트리를 생성한다.
         *
         * @param key   키
         * @param data  key에 대응하는 데이터
         */
        public Entry(int key, Object data)
        {
            this.key    = key;
            this.data   = data;
        }
    }

    final static int MAX = 100;         // 데이터의 최대 개수
    Entry[] table = new Entry[MAX];     // 데이터를 저장할 배열
    int n = 0;                          // table에 등록되어 있는 데이터의 개수

    /**
     * 데이터를 등록한다.
     *
     * @param key       키
     * @param data      key에 대응하는 데이터
     */
    public void add(int key, Object data)
    {
        if(n >= MAX) {
            System.err.println("데이터의 개수가 너무 많습니다.");
            System.exit(1);     // 상태코드 1은 이상 종료를 의미
        }
        table[n++] = new Entry(key, data);
    }

    /**
     * key에 대응하는 데이터를 찾는다.
     *
     * @param key   키
     * @return      키에 대응하는 데이터. 키가 발견되지 않았으면 null을 반환.
     */
    public Object search(int key)
    {
        int i = 0;                              // (1)

        while( i < n ) {                        // (2)
            if(table[i].key == key)             // (3)
                return (table[i].data);         // (4)
            i++;                                // (5)
        }
        return null;                            // (6)
    }

    // 구문     실행 횟수         복잡도
    // (1)      1              O(1)
    // (2)      n/2            O(n)
    // (3)      n/2            O(n)
    // (4)      1              O(1)
    // (5)      n/2            O(n)
    // (6)      1              O(1)

}
