package org.example.btl_cnjava.controller.admin;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

    @ModelAttribute
    public void addAtributes(Model model) {
        model.addAttribute("page" , "category");
    }
    @GetMapping
    public String index(Model model) {
//        List<Category> category = categoryService.findAll();
//        model.addAttribute("category", category);
//        model.addAttribute("content1", "List Category");
        return "master/ad_master";
    }
}
