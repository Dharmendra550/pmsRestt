package com.crm.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crm.Dao.CustomerDao;
import com.crm.Model.CustomerBean;


@Controller
public class RegistrationController 
{
	@Autowired
	CustomerDao  dao;
	
	
	 @GetMapping("/index")
		 public String getIndexPage()
		 {
		   return "index";
	     }
	@GetMapping("/register")
	public String getRegistrationPage(Model model)
	{
		model.addAttribute("customer",new CustomerBean());
		return  "register";	
	}
	@PostMapping("/saveUser")
	public  String saveUser(@Valid @ModelAttribute("customer") CustomerBean customerBean,BindingResult result,Model model)
	{
		if (result.hasErrors())
		{
			return "register";
		}
		else
		{
			boolean flag=dao.addCustomer(customerBean);
			if(flag==false)
			{
				model.addAttribute("message", "customer already registered with this MailId");
				return "register";
			}
			else
			{
				
				
				return "success";
			}
			}
			}
		}


