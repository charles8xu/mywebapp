package com.xuchao.component;

import com.xuchao.handle.BaseHandle;
import com.xuchao.handle.IntfCallPdTask;

/**
 * 继承自通用的Component类，并包含一个BaseHandle的实例域，
 * 根据不同的业务需求实例化不同的子类
 *
 */
public class IntfCallComp {

    public static final String ENCODE_UTF = "UTF-8";
    BaseHandle callHandle;

    /**
     * 电核任务领单
     *
     * @param appcent 领单笔数
     * @return 电核单信息
     */
//    public String getCallTask(String appcent) {
//        callHandle = new IntfCallTask();
//        String respXml = callHandle.serverCall(appcent);
//        if (null == respXml || "".equals(respXml.trim())) {
//            respXml = this.errXml();
//        }
//        return respXml;
//    }

    /**
     * 获取待处理任务数
     *
     * @return
     */
    public String getCallPdTask() {
        callHandle = new IntfCallPdTask();
        String respXml = callHandle.serverCall("");
        if (null == respXml || "".equals(respXml.trim())) {
            //respXml = this.errXml();
        }
        return respXml;
    }

    /**
     * 电核提交退回按钮
     *
     * @param callMsg
     * @return 电核信息
     */
//    public String getCallPostMsg(String callMsg) {
//        callHandle = new IntfCallPostMsg();
//        String respXml = null;
//        respXml = callHandle.serverCall(callMsg);
//        if (null == respXml || "".equals(respXml.trim())) {
//            respXml = this.errXml();
//        }
//        return respXml;
//    }

    /**
     * 电核状态查询
     *
     * @param callMsg
     * @return
     */
//    public String getCallPostSts(String callMsg) {
//        callHandle = new IntfCallPostSts();
//        String respXml = null;
//        respXml = callHandle.serverCall(callMsg);
//        if (null == respXml || "".equals(respXml.trim())) {
//            respXml = this.errXml();
//        }
//        return respXml;
//    }

    //出现异常时返回报文
//    private String errXml() {
//        IntfCallResponse callResponse = new IntfCallResponse();
//        IntfCallException callException = new IntfCallException();
//        IntfCallOutput callOutput = new IntfCallOutput();
//        String xml = null;
//        try {
//            callOutput.setRetCod(IntfCallConstant.CALL_RET_COD_FAIL);
//            callException.setExpCode(IntfCallConstant.CALL_EXP_CODE_FAIL);
//            callException.setExpMsg(IntfCallConstant.CALL_EXP_MSG_FAIL);
//            callResponse.setOutput(callOutput);
//            callResponse.setException(callException);
//            JaxbBinder jaxbBinder = new JaxbBinder(IntfCallResponse.class);
//            jaxbBinder.toXml(callResponse, ENCODE_UTF, true);
//            xml = (jaxbBinder.toXml(callResponse, ENCODE_UTF, true)).toString();
//        } catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//
//        return xml;
//    }

}

