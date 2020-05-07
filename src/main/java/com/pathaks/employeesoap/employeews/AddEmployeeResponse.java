
package com.pathaks.employeesoap.employeews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pathaks.employeesoap.employeeschema.Employee;


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
 *         &lt;element name="AddEmployeeResponse" type="{http://employeesoap.pathaks.com/employeeSchema}Employee"/&gt;
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
    "addEmployeeResponse"
})
@XmlRootElement(name = "AddEmployeeResponse")
public class AddEmployeeResponse {

    @XmlElement(name = "AddEmployeeResponse", required = true)
    protected Employee addEmployeeResponse;

    /**
     * Gets the value of the addEmployeeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getAddEmployeeResponse() {
        return addEmployeeResponse;
    }

    /**
     * Sets the value of the addEmployeeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setAddEmployeeResponse(Employee value) {
        this.addEmployeeResponse = value;
    }

}
