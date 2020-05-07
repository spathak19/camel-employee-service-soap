
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
 *         &lt;element name="UpdateEmployeeRequest" type="{http://employeesoap.pathaks.com/employeeSchema}Employee"/&gt;
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
    "updateEmployeeRequest"
})
@XmlRootElement(name = "UpdateEmployee")
public class UpdateEmployee {

    @XmlElement(name = "UpdateEmployeeRequest", required = true)
    protected Employee updateEmployeeRequest;

    /**
     * Gets the value of the updateEmployeeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getUpdateEmployeeRequest() {
        return updateEmployeeRequest;
    }

    /**
     * Sets the value of the updateEmployeeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setUpdateEmployeeRequest(Employee value) {
        this.updateEmployeeRequest = value;
    }

}
