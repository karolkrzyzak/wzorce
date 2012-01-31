package info.kkrzyzak.ws;

import info.kkrzyzak.bo.MyBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: karolkrzyzak
 * Date: 1/31/12
 * Time: 8:53 PM
 *
 * http://localhost:8080/jsWeb/jaxwsSpring?wsdl
 */
@WebService
public class MyWS extends SpringBeanAutowiringSupport {

    @Autowired
    MyBo myBo;

    @WebMethod(operationName="getName")
    public String getName() {
        return myBo.getName();

    }
    @WebMethod(operationName="getLastName")
    public String getLastName() {
        return myBo.getLastName();
    }
    
    @WebMethod(operationName = "getAge")
    public int getAge(){
        return myBo.getAge();
    }

}
