package org.fkit.bookshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fkit.bookshop.bean.*;
import org.fkit.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bookshop")
public class BookController {
	
	// 注入BookService
	@Autowired 
	
	private BookService bookService;

	@RequestMapping("/addform")
	public  String addForm() {
		return "addbook";
	}
	
	@RequestMapping("/deleteform1")
	public  String deleteForm1() {
		return "deletebook";
	}
	
	@RequestMapping("/loginform")
	public  String loginForm(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
//		User item = new User();
//	    item.setUsername(username);
//	    item.setPassword(password);
	    if((username!=null)&&(username.length()!=0)) {
//	    	req.getSession().setAttribute("item",item);
	    	req.getSession().setAttribute("item",username);
	    }
	    
		if((username.equals("admin"))&&(password.equals("admin")))
	        return "manage";
	    else
			if((req.getParameter("username").equals("admin"))&&(!req.getParameter("password").equals("admin")))
		        return "warning";
		    else {
			    return "list";
		    }
	}
	
	@RequestMapping("/lists")
	public  ModelAndView Lists() {
		Iterable<Book> book=bookService.getAll();
		
		List<Book> listBook = new ArrayList<Book>();
			  
		book.forEach(single->listBook.add(single));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("bookstore");
		mv.addObject("books", listBook);
		
		return mv;
	}
	
	@RequestMapping("/save")
	public @ResponseBody String save(HttpServletRequest req) {
		Book book = new Book();
		book.setBookname(req.getParameter("bookname"));
		book.setPrice(Float.parseFloat(req.getParameter("price")));
		book.setQuantity(Integer.parseInt(req.getParameter("quantity")));
		book = bookService.save(book);
		System.out.println("添加数据成功，返回的结果：" + book);
		return "添加书籍成功！";
	}

	@RequestMapping("/deletebook")
	public @ResponseBody String delete(HttpServletRequest req) {	
		bookService.delete(Integer.parseInt(req.getParameter("bookid")));
		return "指定id书籍下架成功！";
	}
	
	@RequestMapping("/getAllbook")
	public  ModelAndView getAllBook() {
		Iterable<Book> book=bookService.getAll();
		
		List<Book> listBook = new ArrayList<Book>();
			  
		book.forEach(single->listBook.add(single));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displaybook");
		mv.addObject("books", listBook);
		
		return mv;
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
    public  ModelAndView Cart(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		ShoppingCart cart = (ShoppingCart) request.getAttribute("shoppingcart");
		if (cart == null) {
    	    cart = new ShoppingCart();
    	    session.setAttribute("shoppingcart", cart);
		}
		
		String id = request.getParameter("id");
		String name = request.getParameter("bookname");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		
		id = StringUtil.filterHtml(id);
		name = StringUtil.filterHtml(name);
		price = StringUtil.filterHtml(price);
		quantity = StringUtil.filterHtml(quantity);
		
		if (StringUtil.validateNull(quantity)) 
			cart.addCartItem(new CartItem(Integer.parseInt(id), name, Float.parseFloat(price),1));
		else
			cart.addCartItem(new CartItem(Integer.parseInt(id), name, Float.parseFloat(price), Integer.parseInt(quantity)));
		
		ArrayList<CartItem> ct = new ArrayList<CartItem>();
        Iterator<CartItem> it = ct.iterator();
		
		List<CartItem> listCart = new ArrayList<CartItem>();
			  
		ct.forEach(single->listCart.add(single));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("getcart");
		mv.addObject("cart", listCart);
		
		return mv;
    }
}