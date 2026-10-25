class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key=key;
            this.val=val;
        }
    }
    int capacity;
    Node head,tail;
    Map<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);
        map=new HashMap(capacity);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.val;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            node.val=value;
            insert(node);
            return;
        }
        if(map.size()==capacity){
            Node node=tail.prev;
            remove(node);
            map.remove(node.key);
        }
        Node node=new Node(key,value);
        insert(node);
        map.put(key,node);
        
    }
    void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    void insert(Node node){
        Node nextNode=head.next;
        head.next=node;
        node.prev=head;
        node.next=nextNode;
        nextNode.prev=node;
    }
}
