package fr.fms.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String brand;
	private double price;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id") // pour faire un inner join
	private Category category;
	
	public Article() {}
		
	public Article(String description, String brand, double price, Category category) {
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
	}

	public Article(String description, String brand, double price) {
		this.description = description;
    	this.brand = brand;
    	this.price = price;
	}
	
	public Article(String description, double price) {
		this.description = description;
		this.price = price;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", description=" + description + ", brand=" + brand + ", price=" + price
				+ ", category=" + category + "]";
	}
	
}
