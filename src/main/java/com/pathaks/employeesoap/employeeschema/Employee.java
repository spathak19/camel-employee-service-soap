
package com.pathaks.employeesoap.employeeschema;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="empID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="empFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empDepartment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empSalary" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="empHireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "empID",
    "empFirstName",
    "empMiddleName",
    "empLastName",
    "empDepartment",
    "empSalary",
    "empHireDate"
})
public class Employee {

    @XmlElement(required = false)
    protected Integer empID;
    @XmlElement(required = true)
    protected String empFirstName;
    @XmlElement(required = true)
    protected String empMiddleName;
    @XmlElement(required = true)
    protected String empLastName;
    @XmlElement(required = true)
    protected String empDepartment;
    @XmlElement(required = true)
    protected BigDecimal empSalary;
    @XmlSchemaType(name = "dateTime")
    @XmlElement(required = false)
    protected ZonedDateTime empHireDate;

    /**
     * Gets the value of the empID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpID() {
        return empID;
    }

    /**
     * Sets the value of the empID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpID(Integer value) {
        this.empID = value;
    }

    /**
     * Gets the value of the empFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpFirstName() {
        return empFirstName;
    }

    /**
     * Sets the value of the empFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpFirstName(String value) {
        this.empFirstName = value;
    }

    /**
     * Gets the value of the empMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpMiddleName() {
        return empMiddleName;
    }

    /**
     * Sets the value of the empMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpMiddleName(String value) {
        this.empMiddleName = value;
    }

    /**
     * Gets the value of the empLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpLastName() {
        return empLastName;
    }

    /**
     * Sets the value of the empLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpLastName(String value) {
        this.empLastName = value;
    }

    /**
     * Gets the value of the empDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpDepartment() {
        return empDepartment;
    }

    /**
     * Sets the value of the empDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpDepartment(String value) {
        this.empDepartment = value;
    }

    /**
     * Gets the value of the empSalary property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmpSalary() {
        return empSalary;
    }

    /**
     * Sets the value of the empSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmpSalary(BigDecimal value) {
        this.empSalary = value;
    }

    /**
     * Gets the value of the empHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ZonedDateTime getEmpHireDate() {
        return empHireDate;
    }

    /**
     * Sets the value of the empHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmpHireDate(ZonedDateTime value) {
        this.empHireDate = value;
    }

}
