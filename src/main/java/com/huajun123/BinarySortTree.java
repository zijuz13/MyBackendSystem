package com.huajun123;
//二叉排序树 手撸
public class BinarySortTree {
    //定义一个节点的数据结构
    static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
        //向自己身上添加节点
        public void add(int val){
            if(this.val>val){
                if(null!=this.left){
                    left.add(val);
                }else{
                    left=new TreeNode(val);
                }
            }else if(this.val<val){
                if(null!=this.right){
                    right.add(val);
                }else{
                    right=new TreeNode(val);
                }
            }
        }
        public TreeNode search(int val){
            if(null!=this.left){
                TreeNode search = this.left.search(val);
                if(null!=search){
                    return search;
                }
            }
            if(this.val==val){
                return this;
            }
            if(null!=this.right){
                TreeNode search = this.right.search(val);
                if(null!=search){
                    return search;
                }
            }
            return null;
        }
        public TreeNode searchByComparison(int val){
            if(this.val<val){
                if(null!=this.right){
                    return this.right.searchByComparison(val);
                }else{
                    return null;
                }
            }else if(this.val>val){
                if(null!=this.left){
                    return this.left.searchByComparison(val);
                }else{
                    return null;
                }
            }else{
                return this;
            }
        }
    }
    //根节点定义
    private TreeNode root;
    //添加树节点
    public void addTreeNode(int val){
        if(null==root){
            root=new TreeNode(val);
        }else{
            root.add(val);
        }
    }
    //递归调用，前序遍历
    public void preOrderDisplay(){
        this.preOrderElement(root);
    }
    private void preOrderElement(TreeNode node){
        System.out.println(node.val);
        if(null!=node.left){
            this.preOrderElement(node.left);
        }
        if(null!=node.right){
            this.preOrderElement(node.right);
        }
    }
    //递归调用，后序遍历
    public void afterOrderDisplay(){

    }
    //递归调用，中序遍历
    public void centreOrderDisplay(){

    }
    //寻找树的节点
    public TreeNode findTreeNodeByValue(int val){
        return root.searchByComparison(val);
    }
    public static void main(String...args){
        //测试
        int[] array={7,3,10,12,5,1,9,2};
        BinarySortTree sortTree=new BinarySortTree();
        for(int i=0;i<array.length;i++){
            sortTree.addTreeNode(array[i]);
        }
        sortTree.preOrderDisplay();
        TreeNode treeNodeByValue = sortTree.findTreeNodeByValue(10);
        int val = treeNodeByValue.val;
        System.out.println(val);
    }
}
