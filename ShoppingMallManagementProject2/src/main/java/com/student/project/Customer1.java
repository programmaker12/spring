package com.student.project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


//import com.cg.smms.entities.OrderDetails;
@Entity
public class Customer1 {
	   
		
		private Integer id;
		private String name;
		//private List<OrderDetails> orders;
		private long phone;
		private String email;
        
//		private List<OrderDetails> order;
       
		public Customer1() {
			
		}
		public Customer1(Integer id, String name) {
		this.id = id;
		this.name = name;
		
	}
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
//		public List<OrderDetails> getOrder() {
//			return order;
//		}
//
//		public  void setOrder( List<OrderDetails> order) {
//			this.order = order ;
//		}
		

}

