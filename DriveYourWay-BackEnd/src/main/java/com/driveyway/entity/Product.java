package com.driveyway.entity;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "car")
	    private int car;

	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "seller")
	    private String seller;
	    
	    @Column(name = "phone")
	    private String phone;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "price")
	    private BigDecimal price;

		@Column(name = "image_url")
	    private String imageUrl;

	    @Column(name = "date_created")
	    @CreationTimestamp
	    private Date dateCreated;

	    @Column(name = "last_updated")
	    @UpdateTimestamp
	    private Date lastUpdated;



	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    

	    public int getCar() {
			return car;
		}

		public void setCar(int car) {
			this.car = car;
		}

		public String getSeller() {
			return seller;
		}

		public void setSeller(String seller) {
			this.seller = seller;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public BigDecimal getPrice() {
	        return price;
	    }

	    public void setPrice(BigDecimal price) {
	        this.price = price;
	    }

	    public String getImageUrl() {
	        return imageUrl;
	    }

	    public void setImageUrl(String imageUrl) {
	        this.imageUrl = imageUrl;
	    }

	    public Date getDateCreated() {
	        return dateCreated;
	    }

	    public void setDateCreated(Date dateCreated) {
	        this.dateCreated = dateCreated;
	    }

	    public Date getLastUpdated() {
	        return lastUpdated;
	    }

	    public void setLastUpdated(Date lastUpdated) {
	        this.lastUpdated = lastUpdated;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

}
