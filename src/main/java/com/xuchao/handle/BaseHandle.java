package com.xuchao.handle;


/**
 * 1、获得context并获取该会话的事务
 * 2、执行工厂方法，通过子类实现
 * 3、提交或回滚事务
 * 4、可以修改采用Spring声明式事物的方法处理
 *
 */
public abstract class BaseHandle {

    //Context对象
    //Context context = null;
    private String defaultDataSourceName = null;

    public String serverCall(String reqMsg) {
        //声明事务对象
        //EMPTransaction transaction = null;
        //Connection connection = null;
        String respXml = null;
        //事务管理对象
        //EMPTransactionDef transactionDef = null;
        //EMPTransactionManager transactionManager = null;
        try {
            //transactionDef = this.getTransactionDef();
            //context = this.initContext();
            //transactionManager = getTransactionManager(context);

//            if (transactionDef != null && transactionManager != null) {
//                transaction = transactionManager.getTransaction(transactionDef);
//            }
//            connection = this.getConnection(context);
//            HibernateSessionFactory.getContext(context);
//            HibernateSessionFactory.getConnection(connection);
//            HibernateSessionFactory.getSession(connection);
            respXml = execute(reqMsg);
//            if (transactionDef != null) {
//                transactionManager.commit(transaction);
//            }
        } catch (Exception e) {
            // if there are new transaction, just rollback it!
//            if (transactionDef != null) {
//                transactionManager.rollback();
//            }
            e.printStackTrace();
            return respXml;
        }
        return respXml;
    }

//    public Context initContext() {
//        EMPFlowComponentFactory factory = (EMPFlowComponentFactory) EMPFlowComponentFactory
//                .getComponentFactory("CMISBiz");
//        try {
//            context = factory.getContextNamed(factory.getRootContextName());
//            return context;
//        } catch (ObjectNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return null;
//    }

//    protected void releaseConnection(Context context, Connection connection)
//            throws EMPJDBCException {
//        if (this.defaultDataSourceName != null)
//            releaseConnection(context, defaultDataSourceName, connection);
//        else
//            releaseConnection(context, CMISConstance.ATTR_DATASOURCE,
//                    connection);
//    }

//    protected void releaseConnection(Context context, String dataSourceName,
//                                     Connection connection) throws EMPJDBCException {
//        DataSource dataSource = (DataSource) context.getService(dataSourceName);
//        releaseConnection(dataSource, connection);
//    }

//    private void releaseConnection(DataSource dataSource, Connection connection)
//            throws EMPJDBCException {
//        ConnectionManager.releaseConnection(dataSource, connection);
//        EMPLog.log(EMPConstance.EMP_TRANSACTION, EMPLog.INFO, 0,
//                "Do release the connection from data source: " + dataSource
//                        + " success!");
//    }

//    public EMPTransactionDef getTransactionDef() {
//        EMPTransactionDef transactionDef = new EMPTransactionDef(
//                EMPTransactionDef.TRX_REQUIRED);
//        return transactionDef;
//    }

//    protected EMPTransactionManager getTransactionManager(Context context) {
//        return (EMPTransactionManager) context
//                .getService(EMPConstance.TRX_SVC_NAME);
//    }

//    protected Connection getConnection(Context context) throws EMPJDBCException {
//        DataSource dataSource = null;
//        if (this.defaultDataSourceName != null)
//            dataSource = (DataSource) context.getService(defaultDataSourceName);
//        if (dataSource == null)
//            dataSource = (DataSource) context
//                    .getService(CMISConstance.ATTR_DATASOURCE);
//        return getConnection(context, dataSource);
//    }

//    private Connection getConnection(Context context, DataSource dataSource)
//            throws EMPJDBCException {
//        if (dataSource == null)
//            throw new EMPJDBCException("dataSource is null in :"
//                    + this.toString());
//        Connection connection = null;
//        connection = ConnectionManager.getConnection(dataSource);
//
//        EMPLog.log(EMPConstance.EMP_TRANSACTION, EMPLog.INFO, 0,
//                "Apply new connection from data source: " + dataSource
//                        + " success!");
//        return connection;
//    }

//    public Context getContext() {
//        return context;
//    }

    public abstract String execute(String reqMsg) throws Exception;
}

