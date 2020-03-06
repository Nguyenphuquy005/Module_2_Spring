package com.codegym.demospringboots.controllers;

import com.codegym.demospringboots.model.Person;
import com.codegym.demospringboots.service.PersonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonController {
    PersonServiceImpl personService = new PersonServiceImpl();

    @GetMapping("/")
    public ModelAndView getPerson() {
        return new ModelAndView("list", "listPerson", personService.findAll());
    }

    @GetMapping("/person/create")
    public String setCreate(Model model) {
        model.addAttribute("addPerson", new Person());
        return "create";
    }

    @PostMapping("/person/create")
    public String getCreate(@ModelAttribute(name = "addPerson") Person addperson, RedirectAttributes redirectAttributes) {
        addperson.setId((int) (Math.random() * 1000));
        redirectAttributes.addFlashAttribute("succes", "You are add Person");
        personService.save(addperson);
        return "redirect:/";
    }

    @GetMapping("/person/{id}/edit")
    public String setEdit(@PathVariable int id, Model model) {
        model.addAttribute("person", personService.findGetId(id));
        return "edit";
    }

    @PostMapping("/person/update")
    public String getEdit(Person person, RedirectAttributes redirectAttributes) {
        personService.update(person.getId(), person);
        redirectAttributes.addFlashAttribute("succes", "edit Person");
        return "redirect:/";

    }

    @GetMapping("/person/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("person", personService.findGetId(id));
        return "delete";
    }

    @PostMapping("/person/delete")
    public String delete(Person person, RedirectAttributes redirect) {
        personService.delete(person.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }


    @GetMapping("/person/{id}/view")
    public ModelAndView getViews(@PathVariable int id) {
        return new ModelAndView("view", "person", personService.findGetId(id));
    }
}
