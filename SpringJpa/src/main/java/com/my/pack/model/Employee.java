package com.my.pack.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements  Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue   
   private int eid;
   private String ename;
   private double salary;
   private String deg;
   
   @Lob
   private byte[] document;
   
   public byte[] getDocument() {
	return document;
}

public void setDocument(byte[] document) {
	this.document = document;
}

/*public Employee(int eid, String ename, double salary, String deg) {
      super( );
      this.eid = eid;
      this.ename = ename;
      this.salary = salary;
      this.deg = deg;
   }
*/
   public Employee( ) {
      super();
   }

   public int getEid( ) {
      return eid;
   }
   
   public void setEid(int eid) {
      this.eid = eid;
   }
   
   public String getEname( ) {
      return ename;
   }
   
   public void setEname(String ename) {
      this.ename = ename;
   }

   public double getSalary( ) {
      return salary;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getDeg( ) {
      return deg;
   }
   
   public void setDeg(String deg) {
      this.deg = deg;
   }
   
   @Override
   public String toString() {
      return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
   }
}
