
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
 *         &lt;element name="AddRequest" type="{http://employeesoap.pathaks.com/employeeSchema}Employee"/&gt;
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
    "addRequest"
})
@XmlRootElement(name = "AddEmployee")
public class AddEmployee {

    @XmlElement(name = "AddRequest", required = true)
    protected Employee addRequest;

    /**
     * Gets the value of the addRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getAddRequest() {
        return addRequest;
    }

    /**
     * Sets the value of the addRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setAddRequest(Employee value) {
        this.addRequest = value;
    }

}
