package com.xuchao.handle;

/**
 * @author ych-liqian
 *         电核任务数查询
 *
 *         具体的业务逻辑实现，调用系统内其他功能模块的接口方法，并拼装响应报文
 */
public class IntfCallPdTask extends IntfCallHandle {
//    WorkFlowTaskInstance intfce = new WorkFlowTaskInstance();

//    @Override
//    public KeyedCollection execute(KeyedCollection kcoll, Context context) throws Exception {
//        EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000011));
//        IntfCallEnqComp intfCallEnqComp = Factory.getInstance().getBean("IntfCallEnqComp");
//        KeyedCollection kColl = new KeyedCollection();
//        String intfSeq = null;
//        //调用获取响应报文对应的kColl的方法
//        try {
//            //调用任务数查询接口
//            int count = intfce.getUnDoTaskCount(WFIConstant.WF_CALL_CHECK_NODE_SIGN, HibernateSessionFactory.getConnection(new Connection[0]));
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000012) + count);
//            kColl.put(IntfCallConstant.PD_CNT, String.valueOf(count));
//            intfSeq = intfCallEnqComp.saveCallEnq(kColl, context);
//            kColl.put(IntfCallConstant.INTF_SEQ, intfSeq);
//            kColl.put(IntfCallConstant.PRCS_RET_CDE, IntfCallConstant.CALL_RET_COD_SUCCESS);
//            kColl.put("enq_func", "PDTASK");
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000013));
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000014), e);
//            throw e;
//        }
//        return kColl;
//    }

//    @Override
//    public IntfCallResponse formatKcoll(KeyedCollection coll) throws Exception {
//        //  执行业务处理后返回的KCOLL 转BEAN 方便组装XML 报文
//        IntfCallResponse icResponse = new IntfCallResponse();
//        IntfCallOutput icOutput = new IntfCallOutput();
//        try {
//            icOutput.setEnqTime((String) coll.getDataValue(IntfCallConstant.ENQ_TIME));
//            icOutput.setPdTask((String) coll.getDataValue(IntfCallConstant.PD_CNT));
//            icOutput.setRetCod((String) coll.getDataValue(IntfCallConstant.PRCS_RET_CDE));
//            icResponse.setOutput(icOutput);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            throw e;
//        }
//        EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000015));
//        return icResponse;
//    }

//    @Override
//    public KeyedCollection formatRequest(IntfCallRequest request) {
//        // 请求的BEAN 转KCOLL
//        return null;
//    }

}

