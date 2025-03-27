class Solution {
    
    Node flatten(Node root) {
        // code here
        
        if(root.next == null){
            return root;
        }
        
        root.next = flatten(root.next);
        
        root = mergeTwoLists(root,root.next);
        
        
        return root;
        
        
    }
    
    public Node mergeTwoLists(Node list1, Node list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        if(list1.data <= list2.data){
            list1.bottom = mergeTwoLists(list1.bottom,list2);
            return list1;
        }
        else{
             list2.bottom = mergeTwoLists(list1,list2.bottom);
             return list2;
        }
    }
}
