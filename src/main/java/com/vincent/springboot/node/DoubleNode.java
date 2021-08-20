package com.vincent.springboot.node;

public class DoubleNode {
    DoubleNode pre = this;
    DoubleNode next =this;
    int data ;

    public DoubleNode(int data) {
        this.data = data;
    }



    public void after(DoubleNode node){
        DoubleNode nextnext =next;
        //新节点等于当前节点的下一个节点
        this.next =node;
        node.pre= this;




    }
}
