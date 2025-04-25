class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        int prev[] = previousSmaller(heights);
        int next[] = nextSmaller(heights);
        for(int i = 0;i<n;i++){
            
            int temp_res = (next[i] - prev[i] - 1) * heights[i];
            res = Math.max(temp_res,res);
        }
        return res;
    }
    private int[] previousSmaller(int[] arr) {
    int n = arr.length;
    int[] prev = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
            stack.pop();
        }
        prev[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(i);
    }
    return prev;
}

private int[] nextSmaller(int[] arr) {
    int n = arr.length;
    int[] next = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
            stack.pop();
        }
        next[i] = stack.isEmpty() ? n : stack.peek();
        stack.push(i);
    }
    return next;
  }
}
