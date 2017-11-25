package dearpet.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Arianna on 25/11/2017.
 */
@Controller
public class MainController {

    @RequestMapping(value={"/index","/"}, method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    @RequestMapping(value={"/about"}, method = RequestMethod.GET)
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/about");
        return modelAndView;
    }

    @RequestMapping(value={"/gallery"}, method = RequestMethod.GET)
    public ModelAndView gallery(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/gallery");
        return modelAndView;
    }

    @RequestMapping(value={"/request"}, method = RequestMethod.GET)
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/request");
        return modelAndView;
    }

    @RequestMapping(value={"/about"}, method = RequestMethod.POST)
    public ModelAndView aboutqu(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/about");
        return modelAndView;
    }
}
