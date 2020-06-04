package main.java;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name ="user")
@SessionScoped
public class UserBean {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName = " name initialization";
	private String passWord;// same of index

	
	public  UserBean() {}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	 public String doAction() {
		System.out.println("Add !! ");

		 if ("admin".equals(getUserName())) {
			 System.out.println("kk");
			
			 return "success";
		 } else {
		 return "fail";
		 }
		 }

	public String loginUser() {
		
		
//		return ""; 
		
		
//		 try {
//			FacesContext.getCurrentInstance().getExternalContext().redirect("cible.jsp");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("file not found");
//			e.printStackTrace();
//		}
		if ("admin".equals(getUserName()) && "admin".equals(getPassWord()))
			{System.out.println("okdd");
			return "NewFile";
		}
			//return "success";
			
//		FacesContext facesContext = FacesContext.getCurrentInstance();
//			FacesMessage facesMessage  = new FacesMessage("you have entered an invalid user name and/ or password");
//			facesContext.addMessage("loginForm", facesMessage);
//			
			System.out.println(" !! ok");
			return "index";
		}
	
}
