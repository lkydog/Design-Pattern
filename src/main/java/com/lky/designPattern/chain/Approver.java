package com.lky.designPattern.chain;

/**
 * @author Created by njy on 2023/6/5
 * 审批者，包括班主任、年级组长和校长
 */
public abstract class Approver {
    String name;
    Approver next;

    public Approver(String name){
        this.name=name;
    }

    //设置下一个审批者
    public void setNext(Approver next){
        this.next=next;
    }

    //审批请求
    public abstract void approve(LeaveRequest request);
}
