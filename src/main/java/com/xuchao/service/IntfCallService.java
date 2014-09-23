package com.xuchao.service;

import com.xuchao.component.IntfCallComp;

/**
 *
 * 声明对外服务的接口，并引用系统的组件
 *
 */
public class IntfCallService {

    IntfCallComp callComp = new IntfCallComp();

    /**
     * 电核任务领单
     *
     * @param appcent 领单笔数
     * @return 电核单信息
     */
//    public String getCallTask(String appcent) {
//        return callComp.getCallTask(appcent);
//    }

    /**
     * 获取待处理任务数
     *
     * @return
     */
    public String getCallPdTask() {
        return callComp.getCallPdTask();
    }

    /**
     * 电核提交退回按钮
     *
     * @param callMsg
     * @return 电核信息
     */
//    public String getCallPostMsg(String callMsg) {
//        return callComp.getCallPostMsg(callMsg);
//    }

    /**
     * 电核状态查询
     *
     * @param callMsg
     * @return
     */
//    public String getCallPostSts(String callMsg) {
//        return callComp.getCallPostSts(callMsg);
//    }
}

