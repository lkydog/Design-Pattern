package com.lky.designPattern.chain;

/**
 * @author Created by njy on 2023/6/5
 * 年级组长，请假天数2-7天，班主任处理不了，交给年级主任
 */
public class GradeLeader extends Approver {

    public GradeLeader(String name){
        super(name);
    }

    @Override
    public void approve(LeaveRequest request) {
        if (request.getDays() <= 7) {
            System.out.println("年级组长" + name + "审批" + request.getName() + "的请假申请，天数为" + request.getDays());
        } else {
            if (next != null) {
                System.out.println("年级组长审批不了，交由下一级");
                next.approve(request);
            }
        }
    }
}
