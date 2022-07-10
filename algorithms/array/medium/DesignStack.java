package array.medium;

public class DesignStack {

    int maxSize;
    int[] stack;
    int head;
    int stackSize;

    public DesignStack(int maxSize) {
        stack = new int[this.maxSize = maxSize];
        head = 0;
        stackSize = 0;
    }

    public void push(int x) {
        if(stackSize == maxSize){}else{
            stack[head] = x;
            head++;
            stackSize++;
        }
    }

    public int pop() {
        if (head == 0) {
            return -1;
        }
        head--;

        int result = stack[head];
        stack[head] = -stack[head];

        stackSize--;
        return result;

    }

    public void increment(int k, int val) {

        for (int i = 0; i < stackSize && i < k; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
