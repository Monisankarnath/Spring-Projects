package org.pkg1.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/orderform",method=RequestMethod.GET)
	public ModelAndView order()
	{
		ModelAndView mv=new ModelAndView("orderform");
		return mv;
		
	}
	@RequestMapping(value="/submitOrderForm.html",method=RequestMethod.POST)
	public ModelAndView submitOrderForm(@ModelAttribute("o")Orders o)
	{
		ModelAndView mv=new ModelAndView("OrderSuccessfull");
		mv.addObject("msg", "Order Successfull");
		return mv;
	}
}
