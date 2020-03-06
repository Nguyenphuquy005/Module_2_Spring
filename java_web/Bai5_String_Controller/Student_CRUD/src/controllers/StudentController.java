package controllers;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;
import service.impt.StudentServiceImpl;

import java.util.List;

@Controller
public class StudentController {
   StudentService studentService = new StudentServiceImpl();
    @GetMapping("/students")
    public ModelAndView getListStudent(){
        List<Student>  list = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView("listStudent","listStudent",list) ;
        return modelAndView ;
    }

    @GetMapping("student/addnew")
    public ModelAndView getNewStudent(){
        ModelAndView modelAndView = new ModelAndView("addnew1", "student", new Student());
        return modelAndView;
    }

    @PostMapping("/student/addnew")
    public String addnewStudent(@ModelAttribute(name = "student")Student student){
        studentService.save(student);
        return "redirect:/students/";
    }


}
