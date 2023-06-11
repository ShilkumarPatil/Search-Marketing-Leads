package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.dto.LeadDto;

@Controller
public class SearchLeadController {
	
	@Autowired
	private LeadRestClient restClient;
	
	//http://localhost:8080/search
	@RequestMapping("/search")
	public String viewSearchLeadForm() {
		return "search_lead";
	}
	
	@RequestMapping("/findLeadById")
	public String findLeadById(@RequestParam("id") long id, Model model) {
		LeadDto leadDto = restClient.getLeadById(id);
		model.addAttribute("leadDto", leadDto);
			return "lead_info";
	}

}
