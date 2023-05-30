package com.order.controller;

import com.order.model.Organization;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class GovernmentController {
    @Autowired
    private OrderRepository orderRepository;
    @GetMapping("/")
    public String getAllOrganization(Model model){
        List<Organization> organizations = orderRepository.findAll();
        model.addAttribute("organizations", organizations);
        return "index";
    }
    @PostMapping("/add-organization")
    public String saveOrganization(@RequestParam String speciality,
                                   @RequestParam int count,
                                   @RequestParam int year,
                                   @RequestParam String organization_text){

        Organization organization = new Organization();
        organization.setOrganization(organization_text);
        organization.setSpeciality(speciality);
        organization.setCount(count);
        organization.setYear(year);

        orderRepository.save(organization);
        return "redirect:/";
    }
}
