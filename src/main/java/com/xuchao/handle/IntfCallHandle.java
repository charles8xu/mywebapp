package com.xuchao.handle;


/**
 *
 * 继承自BaseHandle，此处实现报文到bean的转换逻辑
 *
 */
public abstract class IntfCallHandle extends BaseHandle {

    public static final String ENCODE_UTF = "UTF-8";
    //IntfApplBatch batch = new IntfApplBatch();

    @Override
    public String execute(String xml) throws Exception {

//        IntfApplBatchComp intfApplBatchComp = Factory.getInstance().getBean(
//                "IntfApplBatchComp");
        String respXml = null;
//        KeyedCollection reqKcoll = new KeyedCollection();
//        KeyedCollection respKcoll = new KeyedCollection();
//        IntfCallResponse response = new IntfCallResponse();
//        batch.setFunc_id("CALL");
//        EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000000) + this.checkXml(xml));
//        batch.setTrans_sts(TransSts.S.getCode());
//        batch.setTx_dt(DateOperation.getDateString());
//        batch.setTx_time(DateOperation.getTimeString());
        if (xml != null && !"".equals(xml)) {
            // 请求XML 转成请求BEANK
            try {
//                EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000001));
//                IntfCallRequest request = xmlToDomain(xml);
//                EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000002));
//                reqKcoll = formatRequest(request);
            } catch (Exception e) {
                e.printStackTrace();
//                IntfCallOutput icOutput = new IntfCallOutput();
//                IntfCallException callException = new IntfCallException();
//                icOutput.setRetCod(IntfCallConstant.CALL_RET_COD_FAIL);
//                callException
//                        .setExpCode(IntfCallConstant.CALL_RET_COD_XML_FAIL);
//                callException.setExpMsg(IntfCallConstant.CALL_EXP_XML_FAIL);
//                response.setOutput(icOutput);
//                response.setException(callException);
//                respXml = domainToXml(response);
//                EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000003) + this.checkXml(respXml));
//                EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, e.getMessage());
//                batch.setRemark(IntfMsgConst.getErrs(IntfMsgConst.CALL000004));
//                intfApplBatchComp.saveBatch(batch);
//                this.getConnection(context).commit();
                return respXml;
            }
        }
        try {
//            respKcoll = execute(reqKcoll, super.getContext());
//            this.setBatch(respKcoll);
//            batch.setTrans_sts(TransSts.E.getCode());
//            this.getConnection(context).setAutoCommit(false);
//            intfApplBatchComp.saveBatch(batch);
//            this.getConnection(context).commit();
//            // 返回KCOLL 转返回BEAN
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000005));
//            response = formatKcoll(respKcoll);
//            // 返回BEANK 转XML
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000006));
//            respXml = domainToXml(response);
//
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000007));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
//            EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.ERROR, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000008), e);
//            this.getConnection(context).rollback();
//            this.getConnection(context).setAutoCommit(false);
//            batch.setRemark(IntfMsgConst.getErrs(IntfMsgConst.CALL000009));
//            intfApplBatchComp.saveBatch(batch);
//            this.getConnection(context).commit();
            throw e;
        }
//        EMPLog.log(EmpLogConstant.TRANS_LOG, EMPLog.INFO, 0, IntfMsgConst.getErrs(IntfMsgConst.CALL000010) + this.checkXml(respXml));
        return respXml;
    }

    /**
     * 请求的XML报文转成请求的BEAN处理
     *
     * @param xml 请求的XML报文
     * @return
     */
//    public IntfCallRequest xmlToDomain(String xml) {
//        JaxbBinder jax = new JaxbBinder(IntfCallRequest.class);
//        IntfCallRequest request = jax.fromXml(xml);
//        return request;
//    }

    /**
     * 处理返回的BEAN 转 返回的XML 格式
     *
     * @param output
     * @return
     */
//    public String domainToXml(IntfCallResponse response) {
//        JaxbBinder jax = new JaxbBinder(IntfCallResponse.class);
//        String respXml = jax.toXml(response, ENCODE_UTF, true);
//        return respXml;
//    }

    /**
     * 添加日记接口记录值
     *
     * @param
     */
//    private void setBatch(KeyedCollection kColl) {
//        String intfSeq = (String) kColl.get(IntfCallConstant.INTF_SEQ);
//        String enqFunc = (String) kColl.get("enq_func");
//        String apptSeq = (String) kColl.get(IntfCallConstant.APPT_SEQ);
//        String applSeq = (String) kColl.get(IntfCallConstant.APPL_SEQ);
//        batch.setRtn_cde((String) kColl.get(IntfCallConstant.PRCS_RET_CDE));
//        batch.setRtn_desc((String) kColl.get(IntfCallConstant.PRCS_RET_DESC));
//        if (intfSeq != null) {
//            batch.setIntf_seq(intfSeq);
//        }
//        if (enqFunc != null) {
//            batch.setEnq_func(enqFunc);
//        }
//        if (apptSeq != null) {
//            batch.setAppt_seq(apptSeq);
//        }
//        if (applSeq != null) {
//            batch.setAppl_seq(applSeq);
//        }
//    }

    private String checkXml(String xml) {
        return xml;
    }

    /**
     * 请求的BEAN 转KCOLL 方便业务处理
     *
     * @param input
     * @return
     */
//    public abstract KeyedCollection formatRequest(IntfCallRequest request);

    /**
     * 执行业务处理后返回的KCOLL 转BEAN 方便组装XML 报文
     *
     * @param kColl
     * @return
     */
//    public abstract IntfCallResponse formatKcoll(KeyedCollection kColl)
//            throws Exception;

    /**
     * 执行业务处理
     *
     * @param kcoll
     * @return
     */
//    public abstract KeyedCollection execute(KeyedCollection kcoll,
//                                            Context context) throws Exception;
}

