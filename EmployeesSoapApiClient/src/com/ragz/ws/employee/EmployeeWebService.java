
package com.ragz.ws.employee;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeWebService", targetNamespace = "http://employee.ws.ragz.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveEmployee", targetNamespace = "http://employee.ws.ragz.com/", className = "com.ragz.ws.employee.SaveEmployee")
    @ResponseWrapper(localName = "saveEmployeeResponse", targetNamespace = "http://employee.ws.ragz.com/", className = "com.ragz.ws.employee.SaveEmployeeResponse")
    @Action(input = "http://employee.ws.ragz.com/EmployeeWebService/saveEmployeeRequest", output = "http://employee.ws.ragz.com/EmployeeWebService/saveEmployeeResponse")
    public boolean saveEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        EmployeeVo arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.ragz.ws.employee.EmployeeVo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmployees", targetNamespace = "http://employee.ws.ragz.com/", className = "com.ragz.ws.employee.GetAllEmployees")
    @ResponseWrapper(localName = "getAllEmployeesResponse", targetNamespace = "http://employee.ws.ragz.com/", className = "com.ragz.ws.employee.GetAllEmployeesResponse")
    @Action(input = "http://employee.ws.ragz.com/EmployeeWebService/getAllEmployeesRequest", output = "http://employee.ws.ragz.com/EmployeeWebService/getAllEmployeesResponse")
    public List<EmployeeVo> getAllEmployees();

}
