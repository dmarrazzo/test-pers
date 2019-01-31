package com.garanti;

import org.drools.persistence.jpa.marshaller.VariableEntity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Customer extends VariableEntity implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CUSTOMER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "CUSTOMER_ID_SEQ", name = "CUSTOMER_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String name;

	private java.lang.Integer birthYear;

	public Customer() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(java.lang.Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Customer(java.lang.Long id, java.lang.String name,
			java.lang.Integer birthYear) {
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", birthYear=" + birthYear + "]";
	}
	
}