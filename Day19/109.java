// class StockSpanner {
//     Stack<int[]> s= new Stack<int[]>() ; // forming a stack
//     public StockSpanner() {
//         Stack<int[]> s;// initializing a stack while a constructor calls
//     }
    
//     public int next(int price) {
//         int span=1;// initialising span(days consecutive) as 1
//         while(!s.isEmpty() && price >=s.peek()[0])// checking if stack gets empty,
//         {
//             span+=s.peek()[1];
//             s.pop()
//         }
//         s.push(new int[]{price,span});
//         return span;
//     }
// }
class StockSpanner {
    int index=0;
    Stack<int[]> s= new Stack<int[]>() ; // forming a stack
    public StockSpanner() {
        Stack<int[]> s;// initializing a stack while a constructor calls
    }
    
    public int next(int price) {
        HashMap<Integer,Integer> map = new HashMap<Integer>
        int span=1;// initialising span(days consecutive) as 1
        while(!s.isEmpty() && price >=s.peek()[0])// checking if stack gets empty,
        {
            span+=s.peek()[1];
            s.pop();
        }
        s.push(new int[]{price,span});
        return span;
    }
}

