package com.lky.designPattern.chain;

/**
 * @author Created by njy on 2023/6/5
 * 校长 请假天数大于七天，年级组长和班主任都没权力审批，交给校长
 */
public class Master extends Approver{

    public Master(String name){
        super(name);
    }

    @Override
    public void approve(LeaveRequest request) {
        if (request.getDays() > 7) {
            System.out.println("校长" + name + "审批了" + request.getName() + "的请假申请，天数为" + request.getDays());
        } else {
            if (next != null) {
                next.approve(request);
            }
        }
    }
}
