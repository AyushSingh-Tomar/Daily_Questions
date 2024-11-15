// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         // Stack<Character> st1= new Stack<>();
//         // Stack<Character> st2= new Stack<>();
//         // for(int i=0;i<s.length();i++){
//         //     if (s.charAt(i)=='#' )
//         //     {
//         //         if(!st1.empty()){
//         //              st1.pop();
//         //         }
//         //     }
//         //     else
//         //     {
//         //         st1.push(s.charAt(i));
//         //     }
//         // }
//         // for(int i=0;i<t.length();i++){
//         //     if (t.charAt(i)=='#' )
//         //     {
//         //          if(!st2.empty()){
//         //              st1.pop();
//         //         }
//         //     }
//         //     else
//         //     {
//         //         st2.push(t.charAt(i));
//         //     }
//         // }
//         // return st1.equals(st2);
//         String m1="",m2="";
//         int i=0,j=0;
//         while(i<s.length()){
//             if(s.charAt(i)=='#' && !m1.isEmpty()){
//             m1 = m1.substring(0, m1.length() - 1);
//             }
//            else if(s.charAt(i)!='#'){
//                 m1+=String.valueOf(s.charAt(i));
//             }
//             i++;
//         }
//         while(j<t.length()){
//             if(t.charAt(j)=='#' && !m2.isEmpty()){
//             m2 = m2.substring(0, m2.length() - 1);
//             }
//             else if(t.charAt(j)!='#'){
//                 m2+=String.valueOf(t.charAt(j));
//             }
//             j++;
//         }
//         return m1.equals(m2);
//     }
// }
