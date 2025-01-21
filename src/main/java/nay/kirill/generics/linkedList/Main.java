package nay.kirill.generics.linkedList;

public class Main {

    public static void main(String[] args) {
        testEnqueue();
        testPeek();
        testSize();
        testIsEmpty();
        testCount();
    }

    private static void testEnqueue() {
        Queue<String> queue = new Queue<>();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        assertEquals("1", queue.dequeue(), "testEnqueue - 1");
        assertEquals("2", queue.dequeue(), "testEnqueue - 2");
        assertEquals("3", queue.dequeue(), "testEnqueue - 3");
    }

    private static void testPeek() {
        Queue<String> queue = new Queue<>();

        queue.enqueue("1932479");
        queue.enqueue("21324324");
        queue.enqueue("3132434");

        assertEquals("1932479", queue.peek(), "testPeek - 1");
        assertEquals("1932479", queue.peek(), "testPeek - 2");
    }

    private static void testSize() {
        Queue<String> queue = new Queue<>();

        queue.enqueue("1");
        queue.enqueue("2");

        assertEquals(2, queue.size(), "testSize - 1");

        queue.enqueue("3");

        assertEquals(3, queue.size(), "testSize - 2");
    }

    private static void testIsEmpty() {
        Queue<String> queue = new Queue<>();

        assertEquals(true, queue.isEmpty(), "testIsEmpty - 1");

        queue.enqueue("1");
        assertEquals(false, queue.isEmpty(), "testIsEmpty - 2");
    }

    private static void testCount() {
        Queue<String> queue = new Queue<>();

        queue.enqueue("Кирилл");
        queue.enqueue("Аня");
        queue.enqueue("Катя");
        queue.enqueue("Петя");

        int n = queue.count(Main::check);

        assertEquals(2, n, "testCount");
    }

    private static boolean check(String value) {
        return value.charAt(0) == 'К';
    }

    private static void assertEquals(Object expected, Object actual, String message) {
        if (expected.equals(actual)) {
            System.out.println(message + ": Успех!");
        } else {
            System.out.println(message + ": Ошибка!");
        }
    }

}
