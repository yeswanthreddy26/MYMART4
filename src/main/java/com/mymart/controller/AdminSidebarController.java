package com.mymart.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AdminSidebarController {
//	@Autowired
//	private SavedReportsRepository savedreportrepo;
//	
//	@GetMapping("/savedreports")
//	public String savedreportsDashboard(Model model) {
//		List<SavedReports> savedreport = savedreportrepo.findAll();
//		model.addAttribute("savedreport", savedreport);
//		
//		return "admin";
//		
//	}
	

	@GetMapping("/Dashboard")
	public String SidebarDashboard(Model model, Principal principal) {
		 if (principal == null) {
	            return "redirect:/login";
	        }
		
		return "admin/Admindashboard";
		
	}
	@GetMapping("/Orders")
	public String SidebarOrders(Model model, Principal principal) {
		if (principal == null) {
            return "redirect:/login";
        }
		return "admin/orderdetails";
		
	}
	@GetMapping("/Customer")
	public String SidebarCustomer(Model model, Principal principal) {
		if (principal == null) {
            return "redirect:/login";
        }
		return "admin/Admindashboard";
		
	}
	
	
	
}
