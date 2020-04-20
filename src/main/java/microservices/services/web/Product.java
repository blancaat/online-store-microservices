package microservices.services.web;


import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Product DTO - used to interact with the {@link WebProductsService}.
 * 
 * @author Blanca AT
 */

@JsonRootName("Product")
public class Product {

	protected String name;
	protected String title;
	protected int price;
	protected String description;
	protected String details;
	protected String measure;
	

	/**
	 * Default constructor for JPA only.
	 */
	protected Product() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public String getMeasure() {
		return measure;
	}


	public void setMeasure(String measure) {
		this.measure = measure;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", details=" + details + ", measure=" + measure + "]";
	}




}