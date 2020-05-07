
package com.pathaks.employeesoap.employeeschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pathaks.employeesoap.employeeschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Employees_QNAME = new QName("http://employeesoap.pathaks.com/employeeSchema", "Employees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pathaks.employeesoap.employeeschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employees }
     * 
     */
    public Employees createEmployees() {
        return new Employees();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employees }{@code >}
     */
    @XmlElementDecl(namespace = "http://employeesoap.pathaks.com/employeeSchema", name = "Employees")
    public JAXBElement<Employees> createEmployees(Employees value) {
        return new JAXBElement<Employees>(_Employees_QNAME, Employees.class, null, value);
    }

}
