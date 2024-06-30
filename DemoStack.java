public class DemoStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.PUSH(10);
        s1.PUSH(20);
        s1.PUSH(30);
        s1.PUSH(40);
        s1.PUSH(50);
        s1.DISPLAY();

        s1.POP();
        s1.DISPLAY();

        int n = s1.PEEP(2);
        System.out.println(n+"\n");

        s1.CHANGE(84 , 4);
        s1.DISPLAY();
    }
}
