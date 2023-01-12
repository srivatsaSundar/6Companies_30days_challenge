import java.util.*;

class nodes{
    int data;
    nodes left;
    nodes right;
    nodes(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class tree{
    public static nodes insert (nodes root,int key){
        if(root==null){
            return new nodes(key);
        }
        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else{
            root.right=insert(root.right, key);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int key[]=new int[n];
        for(int i=0;i<n;i++){
            key[i]=sc.nextInt();
        }
        nodes root =null;
        for(int keys:key){
            root=insert(root, keys);
        }
    }
}
