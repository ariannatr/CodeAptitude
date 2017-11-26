package dearpet.controller;

import dearpet.authentication.IAuthenticationFacade;
//import dearpet.model.PetEntity;
import dearpet.model.UsersEntity;
//import dearpet.service.PetsService;
import dearpet.service.UsersService;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arianna on 26/11/2017.
 */
@Controller
public class ShowController {

    @Autowired
    private UsersService userService;

    //@Autowired
    //
    // private PetsService petsService;

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @RequestMapping(value={"/lookfor"}, method = RequestMethod.GET)
    public ModelAndView lookfor(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/gallery");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);

            ArrayList<UsersEntity> all=userService.lookHome();
            modelAndView.addObject("mode", "look");
            modelAndView.addObject("items",all);
            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value={"/givefor"}, method = RequestMethod.GET)
    public ModelAndView givefor(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/gallery");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);
            ArrayList<UsersEntity> all=userService.giveHome();
            modelAndView.addObject("mode", "give");
            modelAndView.addObject("items",all);
            System.out.println("His name is"+userS.getName());
        }
        return modelAndView;
    }

}
