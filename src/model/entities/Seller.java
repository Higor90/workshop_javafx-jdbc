package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private Date aniversario;
	private Double salario_base;
	
	private Department department;
	
	public Seller() {
	}

	public Seller(Integer id, String nome, String email, Date aniversario, Double salario_base, Department department) {
		this.id = id;
		this.name = nome;
		this.email = email;
		this.aniversario = aniversario;
		this.salario_base = salario_base;
		this.department = department;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public Double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(Double salario_base) {
		this.salario_base = salario_base;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department Department) {
		this.department = Department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", salario_base=" + aniversario + ", salario_base="
				+ salario_base + ", department=" + department + "]";
	}
}
