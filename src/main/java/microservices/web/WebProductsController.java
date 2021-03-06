package microservices.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import microservices.web.Product;

/**
 * Client controller, fetches Products info from the microservice via
 * {@link WebProductsService}.
 * 
 * @author Blanca AT
 */

@Controller
public class WebProductsController {

	@Autowired
	private WebProductsService productsService;

	public WebProductsController(WebProductsService productsService) {
		this.productsService = productsService;
	}

	@RequestMapping("/products/{productName}")
	public String byName(Model model, @PathVariable("productName") String productName) {
		// Obtain the product thanks to the Product Service
		Product product = productsService.findByName(productName);	
		
		// Product is sent in View for display to the user 
		model.addAttribute("product", product);		
		return "product-details";
	}
	
	@RequestMapping("/collections/{collectionName}")
	public String showCollection(@PathVariable("collectionName") String collectionName) {
		if (collectionName.equals("bicolour")) {
			return "bicolour";
		}
		else if (collectionName.equals("lines")) {
			return "lines";
		}
		else if (collectionName.equals("universe")) {
			return "universe";
		}
		else {
			return "error";
		}
	}
}