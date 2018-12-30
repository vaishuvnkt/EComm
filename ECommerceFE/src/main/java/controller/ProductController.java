package controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.dao.ICategoryDAO;
import model.dao.IProductDAO;
import model.daoimpl.CategoryDAOImpl;
import model.daoimpl.ProductDAOImpl;
import model.entity.Category;
import model.entity.Product;

@Controller
public class ProductController {

	@RequestMapping(value="/addprodpage",method=RequestMethod.GET)
	public String addProductPage()
	{
		return "addproducts";
	}
	
	@RequestMapping(value="/addproducts",method=RequestMethod.POST)
	public String addProducts(@Valid @ModelAttribute("product1")Product p, BindingResult result)
	{
		boolean b = false;
		if(result.hasErrors())
		{
			return "addproducts";
		}
		else
		{
		IProductDAO pd = new ProductDAOImpl();
		b = pd.insertProduct(p);
		if (b)
		{
			return "success";
		}
		else
		{
			return "addproducts";
		}
		}
	}
	
	@RequestMapping(value="/addcatpage",method=RequestMethod.GET)
	public String addCategoryPage()
	{
		return "addcategory";
	}
	
	@RequestMapping(value="/addcategory",method=RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category1")Category c, BindingResult result)
	{
		boolean b = false;
		if(result.hasErrors())
		{
			return "addcategory";
		}
		else
		{
		ICategoryDAO pd = new CategoryDAOImpl();
		b = pd.insertCategory(c);
		if (b)
		{
			return "success";
		}
		else
		{
			return "addcategory";
		}
		}
	}

	
}