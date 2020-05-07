package com.pathaks.employeesoap.Routes;

import org.apache.camel.builder.RouteBuilder;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.XMLGregorianCalendar;

import com.pathaks.employeesoap.employeeschema.Employee;
import com.pathaks.employeesoap.employeews.GetEmployee;
import com.pathaks.employeesoap.employeews.GetEmployeeResponse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ImportResource("classpath:META-INF/spring/cxf-config.xml")
public class MainRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("cxf:bean:employeeServiceEndpoint")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {

                Employee employee = new Employee();
                employee.setEmpID(1);
                employee.setEmpFirstName("Asd");
                employee.setEmpMiddleName("Adsasd");
                employee.setEmpLastName("asdsad");
                employee.setEmpDepartment("asdasd");
                employee.setEmpSalary(BigDecimal.valueOf(1234));
                employee.setEmpHireDate(ZonedDateTime.now());

                GetEmployeeResponse response = new GetEmployeeResponse();
                response.setGetEmployeeResponse(employee);
                exchange.getMessage().setBody(employee);
            }
        })
        .to("log:employee?showBody=true&showHeaders=true&multiline=true");

    }
    
}