package dearpet.controller;

import dearpet.authentication.IAuthenticationFacade;
import dearpet.model.UsersEntity;
import dearpet.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Arianna on 26/11/2017.
 */
@Controller
public class UserController {

    @Autowired
    private UsersService userService;
    @Autowired
    private IAuthenticationFacade authenticationFacade;
    @RequestMapping(value={"/host"}, method = RequestMethod.POST)
    public ModelAndView host(@RequestParam("apoDate") String fromDate,@RequestParam("toDate") String toDate){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/profile");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);
            System.out.println("His name is"+userS.getName());
            userS.setFromDate(fromDate);
            userS.setToDate(toDate);
            userS.setHost(1);
            userService.saveUser(userS,"");
        }
        return modelAndView;
    }

    @RequestMapping(value={"/askfor"}, method = RequestMethod.POST)
    public ModelAndView askfor(@RequestParam("apoDate") String fromDate,@RequestParam("toDate") String toDate){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/profile");
        Authentication authentication = authenticationFacade.getAuthentication();
        if (!authentication.getName().equals("anonymousUser")) {
            modelAndView.addObject("uname", authentication.getName());
            UsersEntity userS = userService.findByUsername(authentication.getName());
            modelAndView.addObject("uname", authentication.getName());
            modelAndView.addObject("user",userS);
            System.out.println("His name is"+userS.getName());
            userS.setFromDate2(fromDate);
            userS.setToDate2(toDate);
            userS.setAskforhome(1);
            userService.saveUseronUpdate(userS);
        }
        return modelAndView;
    }
}
