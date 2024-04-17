// BGZ-ArrStack/Main.java

public class Main {
    public static void main(String[] args) {
        ArrStack stack = new ArrStack(5);
        for (int i = 1; i <= 5; ++i)
            stack.push(i * i);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        stack.push(11);
        stack.push(1);
        stack.push(1);
        stack.push(15);
        stack.push(16);
        for (int i = 1; i <= 4; ++i)
            System.out.print(stack.pop() + " ");
        System.out.println();
        System.out.print(stack.empty());
        System.out.println();
        stack.pop();
        if (stack.empty())
            System.out.print(stack.empty() + " ");
    }
}
