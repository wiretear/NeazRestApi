package com.era.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import com.era.Login.LogInBO;
import com.era.config.SpringDBConfig;
public class LoginDAO {
	public LogInBO getPermissionMailIDCheckPro(String sComapnyID,
												String sBranchID,
												String sUserName,
												String sPassword,
												String sUser) throws Exception {
		Connection oConn = null;
		oConn =SpringDBConfig.getConnection();
	//	LoginFormBean oLoginFormBean = new LoginFormBean();
		LogInBO oLogInBO = new LogInBO();
		String sNewUserID = null;
		String sErrorCode = null;
		String sSssionID =  null;
		CallableStatement oStmt = oConn.prepareCall("{call pms.dpr_user_signin(?,?,?,?,?,?,?,?,?,?,?,?)}");
		 oStmt.setString(1, sComapnyID);		   
		  oStmt.setString(2, sBranchID);
		  oStmt.setString(3, sUserName);		   
		  oStmt.setString(4, sPassword);
		  oStmt.setString(5, sUser);
		  oStmt.registerOutParameter(1, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(5, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(6, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(7, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(8, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(9, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(10, java.sql.Types.VARCHAR);
		  oStmt.registerOutParameter(11, java.sql.Types.INTEGER);
		  oStmt.registerOutParameter(12, java.sql.Types.VARCHAR);
		try {
			oStmt.execute();
			oLogInBO.setCompanyCode(oStmt.getString(1));
			oLogInBO.setBranchCode(oStmt.getString(2));
		//	oIBankingLogInBO.setUser(oStmt.getString(5));	
			oLogInBO.setCompanyName(oStmt.getString(6));		   
			  sNewUserID = "" + oStmt.getString(7);
			  oLogInBO.setNewUserID(sNewUserID);
			  sSssionID = "" + oStmt.getString(8);
			  oLogInBO.setSessionID(sSssionID);
			  oLogInBO.setBranchOpenDateDDF(oStmt.getString(9));
		//	oIBankingLogInBO.setLoginFlag(oStmt.getString(10));
			  sErrorCode = "" + oStmt.getInt(11);
			  oLogInBO.setErrorCode(sErrorCode);
			  oLogInBO.setErrorMessage(oStmt.getString(12));	
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				oConn.rollback();
				}
			catch (Exception E) {}
		} finally {
			if (oStmt !=null) {
				oStmt.close();
				System.out.println("Enter 4");
			}
			oConn.close();
		}
		return oLogInBO;
	}

}