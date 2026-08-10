// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
                int count = 0;

        Node prev = root;
        Node curr = root.next;
        Node next = curr.next;

        while (next != null) {

            // Local maximum
            if (curr.val > prev.val && curr.val > next.val) {
                count++;
            }

            // Local minimum
            else if (curr.val < prev.val && curr.val < next.val) {
                count++;
            }

            prev = curr;
            curr = next;
            next = next.next;
        }

        return count;

    }
}