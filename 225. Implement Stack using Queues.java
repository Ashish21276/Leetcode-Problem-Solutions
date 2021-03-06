class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}


//Another one
class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        System.out.println(q.toString());
    }

    public int pop() {
        Queue<Integer> a = new LinkedList<>();
        while (q.size() > 1) {
            a.add(q.poll());
        }
        int ans = q.poll();
        while (!a.isEmpty()) {
            q.add(a.poll());
        }
        return ans;
    }

    public int top() {
        Queue<Integer> a = new LinkedList<>();
        while (q.size() > 1) {
            a.add(q.poll());
        }
        int ans = q.peek();
        a.add(q.poll());
        while (!a.isEmpty()) {
            q.add(a.poll());
        }
        return ans;

    }

    public boolean empty() {
        return q.isEmpty();

    }
}
