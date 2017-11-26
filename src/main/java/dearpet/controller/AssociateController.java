package dearpet.controller;

import dearpet.authentication.IAuthenticationFacade;
import dearpet.model.Doctor;
import dearpet.model.Grooming;
import dearpet.model.UsersEntity;
import dearpet.repository.DoctorRepository;
import dearpet.repository.GroomingRepository;
import dearpet.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Arianna on 25/11/2017.
 */
@Controller
public class AssociateController {

    @Qualifier("doctorRepository")
    @Autowired
    private DoctorRepository doctorRepository;

    @Qualifier("groomingRepository")
    @Autowired
    private GroomingRepository groomingRepository;

    @Autowired
    private UsersService userService;

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @RequestMapping(value={"/grooming"}, method = RequestMethod.GET)
    public ModelAndView groomingget(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/associate");
        List<Grooming> grooming=groomingRepository.findAll();
        modelAndView.addObject("items",grooming);
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


    @RequestMapping(value={"/grooming"}, method = RequestMethod.POST)
    public ModelAndView groomingpost(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/associate");
        List<Grooming> grooming=groomingRepository.findAll();
        modelAndView.addObject("items",grooming);
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

    @RequestMapping(value={"/doctor"}, method = RequestMethod.GET)
    public ModelAndView doctorget(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/associate");
        List<Doctor> doctor=doctorRepository.findAll();
        modelAndView.addObject("items",doctor);
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

    @RequestMapping(value={"/doctor"}, method = RequestMethod.POST)
    public ModelAndView doctorpost(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/associate");
        List<Doctor> doctor=doctorRepository.findAll();
        modelAndView.addObject("items",doctor);
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
}
