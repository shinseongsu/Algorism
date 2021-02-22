package DataStructure;

public class LinearSearchMain {
    public static void main(String[] args) {

        LinearSearch table = new LinearSearch();    // 테이블을 생성한다.

        table.add(1, "one");
        table.add(10, "ten");
        table.add(7, "seven");
        table.add(5, "five");
        table.add(2, "two");
        table.add(8, "eight");
        table.add(9, "nine");
        table.add(4, "four");
        table.add(3, "three");

        String x;
        x = (String) table.search(10);
        if(x != null) {
            System.out.println("value = " + x);
        } else {
            System.out.println("Not found");
        }

    }
}
