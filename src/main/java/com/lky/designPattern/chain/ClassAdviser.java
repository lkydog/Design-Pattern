package com.lky.designPattern.chain;

/**
 * @author Created by njy on 2023/6/5
 * 班主任,请假天数2天内，班主任就可以审批
 */
public class ClassAdviser extends Approver{

    public ClassAdviser(String name){
        super(name);
    }

    @Override
    public void approve(LeaveRequest request) {
        if (request.getDays() <= 2) {
            System.out.println("班主任" + name + "审批" + request.getName() + "的请假申请，天数为" + request.getDays());
        } else {
            if (next != null) {
                System.out.println("班主任审批不了，交由下一级");
                next.approve(request);
            }
        }
    }
}
