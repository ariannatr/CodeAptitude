package dearpet.controller;

import dearpet.authentication.IAuthenticationFacade;
import dearpet.model.UsersEntity;
import dearpet.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UsersService userService;
    @Autowired
    private IAuthenticationFacade authenticationFacade;
    @RequestMapping(value={"/index","/"}, method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);
            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/about"}, method = RequestMethod.GET)
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/about");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

        System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/gallery"}, method = RequestMethod.GET)
    public ModelAndView gallery(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/gallery");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/request"}, method = RequestMethod.GET)
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/request");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/about"}, method = RequestMethod.POST)
    public ModelAndView aboutqu(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/about");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/profile"}, method = RequestMethod.GET)
    public ModelAndView showprof(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/profile");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);


         //   System.out.print("Exw to zwaki "+petEntity.getPetname());
            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/profile"}, method = RequestMethod.POST)
    public ModelAndView postprof(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/profile");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());

            System.out.println("Pets name:"+userS.getPetname());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/lost"}, method = RequestMethod.POST)
    public ModelAndView lost(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/profile");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            System.out.println("mpike sto lost");
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());

            System.out.println("Pets name:"+userS.getPetname());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

           userS.setLost(1);
            userService.saveUseronUpdate(userS);
            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }
}
