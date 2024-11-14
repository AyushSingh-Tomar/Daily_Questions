package Day61;

// class Solution {
//     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//         List<Integer> visited = new ArrayList<Integer>();
//         int sizeOf = rooms.size();
//         int []arr=new int[sizeOf];
//        for(List<List<Integer>> e:rooms){
//          for(List<Integer> E:e){
//             int index= E.getValue();
//             arr[index]++;
//          }
//        }
//        Queue<Integer> q= new Queue<Integer>();
//        for(int i:arr){
//         if(arr[i]==0)
//         q.offer(i);
//        }
//        while(!q.isEmpty()){
//        int polledOut=q.poll();
//        visited.add(polledOut);
//        for(Integer e : rooms.get(polledOut))
//            {
//             arr[e]--;
//             if(arr[e]==0){
//                 q.offer(e);
//             }
//            }
//        }
//     }
// }
import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        
        // Start from room 0
        visited[0] = true;
        queue.offer(0);
        
        while (!queue.isEmpty()) {
            int currentRoom = queue.poll();
            // Iterate through the keys in the current room
            for (int key : rooms.get(currentRoom)) {
                if (!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                }
            }
        }
        
        // Check if all rooms have been visited
        for (boolean isVisited : visited) {
            if (!isVisited) return false;
        }
        return true;
    }
}
//
