package com.sgtesting.pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {


	public ActiTimePage(WebDriver browser)
	{
		PageFactory.initElements(browser, this);
	}

	//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//minimize flyoutwindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFloyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Logout Link
	@FindBy(xpath="//*[@id='logoutLink']")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

	/*==========================================================================================================*/	

	//user click
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement oUser;
	public WebElement getuser()
	{
		return oUser;
	}
	//adduser click
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	//firstName Text Field
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	//lastName Text Field
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	//email Text Field
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	//username Text Field
	@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
	private WebElement usernameFieldinputFieldWithPlaceholder;
	public WebElement getusername()
	{
		return usernameFieldinputFieldWithPlaceholder;
	}
	//password Text Field
	private WebElement password;
	public WebElement getpwd()
	{
		return password;
	}
	//passwordcopy Text Field
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	//createuser button
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement createuser;
	public WebElement getcreateuser()
	{
		return createuser;
	}


	//usernameclick button
	@FindBy(xpath = "//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement usernameclick;
	public WebElement getusernameclick()
	{
		return usernameclick;
	}

	//usernameclick button
	@FindBy(xpath = "//span[text()='case1, test']")
	private WebElement usernameclick1;
	public WebElement getusernameclick1()
	{
		return usernameclick1;
	}
	//delete user
	@FindBy(xpath = "//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deleteuser;

	public WebElement getdeleteuser()
	{
		return deleteuser;
	}

	//savechanges button
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement savechangesclick;
	public WebElement getsavechangesclick()
	{
		return savechangesclick;
	}
	/*======================================================================================================*/
	//task
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")
	private WebElement otask;
	public WebElement getclicktask()
	{
		return otask;
	}
	//1.click on "Add New" button

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;
	public WebElement getAddNewClick()
	{
		return addNewButton;
	}
	//2.newcustomer

	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;
	public WebElement getnewcustomer()
	{
		return newcustomer;
	}
	//3.enter new customer
	@FindBy(xpath="//*[@id='customerLightBox_nameField']")
	private WebElement enternewcustomer;
	public WebElement getenternewcustomer()
	{
		return enternewcustomer;
	}
	//4.description
	@FindBy(xpath="//*[@id='customerLightBox_descriptionField']")
	private WebElement customerdescription;
	public WebElement getcustomerdescription()
	{
		return customerdescription;
	}
	//5.click on "Create Customer" button
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustomer;
	public WebElement getcreatecustomer()
	{
		return createcustomer;
	}
	//deleting customer
	//1.click on "Tasks" button
	//2.click on setting
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickongear;
	public WebElement getgearclick() 
	{
		return clickongear;
	}
	//3.action
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement actions;
	public WebElement getactions() 
	{
		return actions;
	}
	//4.delete customer
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecuatomer;
	public WebElement getdeletecuatomer() 
	{
		return deletecuatomer;
	}
	//delete permanently
	@FindBy(xpath="//*[@id='customerPanel_deleteConfirm_submitTitle']")
	private WebElement deletepermanently;
	public WebElement getdeletepermanently() 
	{
		return deletepermanently;
	}
	
	//modify customer
	//1.click on task
	//2.click on setting button ie getgearclick() method
	//3.click on name of customer click on it 
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement NewCustomer;
	public WebElement getNewCustomer() 
	{
		return NewCustomer;
	}
	//4.clear new customer
		@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
		private WebElement clearNewCustomer;
		public WebElement getclearNewCustomer() 
		{
			return clearNewCustomer;
		}
		//5.click some where elese to save the new Customer
		@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div")
		private WebElement clickelsewhere;
		public WebElement getclickelsewhere() 
		{
			return clickelsewhere;
		}
	/*==============================================================================================*/
		//steps for adding "New Project"
		//1.click on "Tasks"
		//2.click on"Add New"
	//3.newproject
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newproject;
	public WebElement getnewproject()
	{
		return newproject;
	}
	//4.enterprojectname
	@FindBy(xpath="//*[@id='projectPopup_projectNameField']")
	private WebElement enterprojectname;
	public WebElement getenterprojectname()
	{
		return enterprojectname;
	}
	//5.createproject
	@FindBy(xpath = "//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement createproject;
	public WebElement getcreateproject()
	{
		return createproject;
	}
	
	//deleting Project
	//1.click on tasks
	//2.click on setting
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement clickongear1;
	public WebElement getgearclick1() 
	{
		return clickongear1;
	}
	//3.delete project
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject;
	public WebElement getdeleteproject() 
	{
		return deleteproject;
	}
	//4.delete permanently
	@FindBy(xpath = "//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement deleteprojpermanently;
	public WebElement getdeleteprojpermanently() 
	{
		return deleteprojpermanently;
	}
	
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement addnewtask;
		public WebElement addnewtask() 
		{
			return addnewtask;
		}
	//1.actionproj
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement actionsproj;
	public WebElement getactionsproj() 
	{
		return actionsproj;
	}
	//2.projclick
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement NewProject;
	public WebElement getNewProject() 
	{
		return NewProject;
	}
	//clear new proj
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement clearNewProject;
	public WebElement getclearNewProject() 
	{
		return clearNewProject;
	}
	
	//createnewtask
	@FindBy(xpath = "//div[text()='Create new tasks']")
	private WebElement createnewtask;
	public WebElement createnewtask() 
	{
		return createnewtask;
	}
	//create task name1
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement createtaskname1;
	public WebElement  getcreatetaskname1() 
	{
		return  createtaskname1;
	}
	//create task name2
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
	private WebElement createtaskname2;
	public WebElement  getcreatetaskname2() 
	{
		return  createtaskname2;
	}
	//createtask
	@FindBy(xpath = "//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement createtask;
	public WebElement createtask() 
	{
		return createtask;
	}
	//click on name of the task checklist
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	private WebElement checkboxclick;
	public WebElement gcheckboxclick() 
	{
		return checkboxclick;
	}
	//deletetask
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement deletetask;
	public WebElement getdeletetask() 
	{
		return deletetask;
	}
	//click on delete button 
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
	private WebElement DeleteButton;
	public WebElement getClickDeleteButton() 
	{
		return DeleteButton;
	}
	//deletetaskpermanently
	@FindBy(xpath="//*[@id='taskPanel_deleteConfirm_submitTitle']")
	private WebElement deletetaskpermanently;
	public WebElement getdeletetaskpermanently() 
	{
		return deletetaskpermanently;
	}

	//start exploring actitime
		@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
		private WebElement startexploringactitime;
		public WebElement getstartexploringactitime()
		{
			return startexploringactitime;
		}
		
		//savechanges
		@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement savechanges;
		public WebElement getsavechanges()
		{
			return savechanges;
		}
		/*===================================================================================*/
		//user1click
		@FindBy(xpath="//span[text()='user1, dummy1']")
		private WebElement user1click;
		public WebElement getuser1click()
		{
			return user1click;
		}
		//user2click
		@FindBy(xpath="//span[text()='user2, dummy2']")
		private WebElement user2click;
		public WebElement getuser2click()
		{
			return user2click;
		}
		//user3click
		@FindBy(xpath="//span[text()='user3, dummy3']")
		private WebElement user3click;
		public WebElement getuser3click()
		{
			return user3click;
		}

}


