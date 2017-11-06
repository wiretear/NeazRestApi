package com.era.Login;
/*
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.era.Login.LoginDAO;
import com.era.Login.LoginFormBean;


public class LoginController {
	
	
	@RequestMapping(value="/loginsubmit",method=RequestMethod.GET)

   public String displayLogin(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		LoginDAO oLogInDAO = new LoginDAO();
		LoginFormBean oLogInForm = new LoginFormBean();
		LoginFormBean oLogInForm1 = new LoginFormBean();
		HttpSession session = request.getSession(true);
		String sActionPath = "";
		String sNewUserID;
		String sNewSessionID;
		String sSuccessAction = "success";
		String sFailureAction = "failure";
		String sSessionExpireAction = "sessionExpire";
		String sFatalErrorAction = "fatalError";
		String sSessionMyBankMenuAction = "sessionMyBankMenu";
		String sSecretQuestion = "secretQuestion";
		String sMyPINExpire = "myPINExpire";
		String sSuccess = sFatalErrorAction;
		String gsUserID = (String) session.getAttribute("GSUserID");
		String gsUserTitle = (String) session.getAttribute("GSUserTitle");
		String gsLastLogInDate =(String) session.getAttribute("GSLastLogInDate");
		String gsPresentDate = (String) session.getAttribute("GSPresentDate");
		String gsSessionID = (String) session.getAttribute("GSSessionID");
		String gsInternalCardID =(String) session.getAttribute("GSInternalCardID");
		String gsLogInToDay = (String) session.getAttribute("GSLogInToDay");
		String gsLogInTotal = (String) session.getAttribute("GSLogInTotal");
		String gsBranchNameHeader =(String) session.getAttribute("GSBranchNameHeader");
		String gsBranchDateHeader =(String) session.getAttribute("GSBranchDateHeader");
		String gsTellerID = (String) session.getAttribute("GSTellerID");
		String gsCompanyCode = (String) session.getAttribute("GSCompanyCode");
		String gsBranchCode = (String) session.getAttribute("GSBranchCode");
		String gsHeaderName = (String) session.getAttribute("GSHeaderName");
		String gsHeaderLogIn = (String) session.getAttribute("GSHeaderLogIn");
		String sActionClientPath = "/mybank/logInMyBank.do";
		String sActionLogOutPath = "/mybank/logOutMyBankMenu.do";
		String sActionBranchPath = "";
		String gsMenuClientPath =(String) session.getAttribute("GSMenuClientPath");
		String gsMenuBranchPath =(String) session.getAttribute("GSMenuBranchPath");
		String gsGeoFlag = (String) session.getAttribute("GSGeoFlag");
		gsInternalCardID = "0";
		String sPhysicalAddress = "";
		String sServerOS = "SERVER";
		String sClientOS = "CLIENT";
		String sPhysicalAddressServer = "";
		String sPhysicalAddressClient = "";
		String sIPAddressServer = "";
		String sIPAddressClient = "";
		
		
		/*oLogInForm1 =oLogInDAO.getPermissionMailIDCheckPro( gsInternalCardID,
															oLogInForm.getUserID(),
															oLogInForm.getPassword(),
															sPhysicalAddressServer,
															sPhysicalAddressClient,
															request.getRemoteAddr());
															sNewUserID = oLogInForm .getNewUserID();
															sNewSessionID = oLogInForm.getSessionID();
															session.setAttribute("GSUserID", sNewUserID);
															session.setAttribute("GSSessionID", sNewSessionID);
															session.setAttribute("GSLastLogInDate",oLogInForm.getLastLogIn());
															session.setAttribute("GSPresentDate",oLogInForm.getPresentDate());
															session.setAttribute("GSInternalCardID", gsInternalCardID);
															session.setAttribute("GSUserTitle",oLogInForm.getUserTitle());
															session.setAttribute("GSHeaderName",oLogInForm.getHeaderName());
															session.setAttribute("GSHeaderLogIn",oLogInForm.getHeaderLogIn());
															session.setAttribute("GSBranchNameHeader", "");
															session.setAttribute("GSBranchDateHeader", "");
															session.setAttribute("GSLogInToDay",oLogInForm.getLogInToDay());
															session.setAttribute("GSLogInTotal",oLogInForm.getLogInTotal());
																			
				sSuccess = sSuccessAction;
				return "test";
	    
		    }
		
		}
	    */
