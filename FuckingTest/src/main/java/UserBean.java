package main.java;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;


@ManagedBean(name ="user")
@SessionScoped
@Entity
@Table(name="User2")
public class UserBean {


	/**
	 * 
	 */
	//
	private static final long serialVersionUID = 1L;
	
	private String userName = " name initialization";
	@Id
	private int passWord;// same of index

	
	public  UserBean() {}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassWord() {
		return passWord;
	}

	public void setPassWord(int passWord) {
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
		
		Alien s = new Alien();
		s.setIi(1); 
		//s.setMessg("HamYYYYmmmm");
		
		UserBean se = new UserBean();
		se.setPassWord(2); 
		se.setUserName("Youssef");

		try {
			Session session = utilHib.getsession_factory_().openSession();
			session.beginTransaction();
			session.delete(s);
			// session.delete(s);
			session.save(se);
			session.getTransaction().commit();}catch(Exception ee) {
				System.out.println("Ex   :   " + ee);
			}
		if ("admin".equals(getUserName()) )
			{System.out.println("oksssdd");
			return "NewFile";
		}
			//return "success";
			
//		FacesContext facesContext = FacesContext.getCurrentInstance();
//			FacesMessage facesMessage  = new FacesMessage("you have entered an invalid user name and/ or password");
//			facesContext.addMessage("loginForm", facesMessage);
//			
			System.out.println(" !! ok");
			return "NewFile";
		}
	
}
