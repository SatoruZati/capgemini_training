import java.util.Scanner;
import java.util.Stack;

class QueueUsingStacks {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void pushElement(int x) {
        s1.push(x);   
    }
    
    public int popElement() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.isEmpty() ? -1 : s2.pop();
    }
    
    public int peekElement() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.isEmpty() ? -1 : s2.peek();
    }
    
    public boolean isEmptyResult() {
        return s1.isEmpty() && s2.isEmpty();
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            QueueUsingStacks queue = new QueueUsingStacks();

            for (int i = 0; i < N; i++) {

                String operation = sc.next();

                if (operation.equals("push")) {
                    int x = sc.nextInt();
                    queue.pushElement(x);
                    sb.append("None\n");
                }
                else if (operation.equals("pop")) {
                    sb.append(queue.popElement()).append("\n");
                }
                else if (operation.equals("peek")) {
                    sb.append(queue.peekElement()).append("\n");
                }
                else if (operation.equals("empty")) {
                    sb.append(queue.isEmptyResult()).append("\n");
                }
            }
        }

        System.out.print(sb);
        sc.close();
    }
}
    