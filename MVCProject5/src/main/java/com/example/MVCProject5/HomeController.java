package com.example.MVCProject5;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index";
    }
    //Servlet way of getting request parameter and session
    /*
    @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1+num2;
        //System.out.println(result);
        session.setAttribute("result", result);
        return "result.jsp";
    }*/
    //Here instead of Request object to get parameter we pass parameters as argument.
    //Instead of session and setting the attribute , we are using model object to add the attribute
    // and pass the parameters between the pages.
    /*
    @RequestMapping("/add")

    public String add(@RequestParam("num1") int num, int num2, Model model){
        int result = num + num2;
        model.addAttribute("result", result);

        return "result";

    }

     */
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv){
        int result = num + num2;
        mv.addObject("result", result);
        mv.setViewName("result"); // this is the call to jsp page
        return mv;
    }
/*
    @RequestMapping("/addAlien")
    public ModelAndView addAlien(@RequestParam("aid") int aid, String aname, ModelAndView mv){
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);
        mv.addObject("alien", alien);
        mv.setViewName("result"); // this is the call to jsp page
        return mv;
    }*/
@RequestMapping("/addAlien")
public String addAlien(@ModelAttribute Alien alien){
    return "result";
}

}

