package com.fsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.entities.Company;
import com.fsoft.repository.CompanyDAO;

@Controller
@RequestMapping("/")
public class CompanyController {

	@Autowired
	CompanyDAO dao;

	@GetMapping("/getCompany")
	public String listCompany(Model model) {
		List<Company> listCompany = dao.findAll();
		model.addAttribute("listCompany", listCompany);

		for (Company company : listCompany) {
			System.out.println("company");
			System.out.println(company.getCompanyID() + " - " + company.getCompanyName());
		}

		return "index";
	}

	@PostMapping("/add")
	public ModelAndView add(@RequestParam(name = "companyName") String companyName, ModelAndView modelAndView) {
		Company company = new Company(companyName);
		dao.save(company);
		modelAndView.addObject("companyName", companyName);
		modelAndView.setViewName("redirect:/getCompany");
		return modelAndView;
	}
}