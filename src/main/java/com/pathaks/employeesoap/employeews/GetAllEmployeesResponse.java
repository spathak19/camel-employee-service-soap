
package com.pathaks.employeesoap.employeews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pathaks.employeesoap.employeeschema.Employees;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetEmployeesResponse" type="{http://employeesoap.pathaks.com/employeeSchema}Employees"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEmployeesResponse"
})
@XmlRootElement(name = "GetAllEmployeesResponse")
public class GetAllEmployeesResponse {

    @XmlElement(name = "GetEmployeesResponse", required = true)
    protected Employees getEmployeesResponse;

    /**
     * Gets the value of the getEmployeesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Employees }
     *     
     */
    public Employees getGetEmployeesResponse() {
        return getEmployeesResponse;
    }

    /**
     * Sets the value of the getEmployeesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employees }
     *     
     */
    public void setGetEmployeesResponse(Employees value) {
        this.getEmployeesResponse = value;
    }

}
