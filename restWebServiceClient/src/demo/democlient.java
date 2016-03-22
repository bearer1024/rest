package demo;

import java.text.MessageFormat;

 

import javax.ws.rs.client.Client;

import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.client.WebTarget;

import javax.ws.rs.core.MediaType;

 

import com.sun.jersey.api.client.UniformInterfaceException;

import com.sun.jersey.api.client.WebResource;

import com.sun.jersey.api.client.config.DefaultClientConfig;

import org.glassfish.*;


public class democlient {

 private static final String BASE_URI ="http://localhost:8080/DemoRestWebservice/rest/demo/";

      

public static void main(String[] args) {

              // TODO Auto-generated method stub

              System.out.println(getHello());  // hello method call

System.out.println(getSum("30","4"));  // getsum

       }

 

public static String getSum(String a, String b) throws UniformInterfaceException{

              Client client = ClientBuilder.newClient();

              WebTarget target =

client.target(BASE_URI                

+MessageFormat.format("sum/{0}/{1}",

new Object[] {a,b}));

              return target.request(MediaType.TEXT_PLAIN).

get(String.class);

           }

 

 public static String getHello() throws UniformInterfaceException{     

       Client client = ClientBuilder.newClient();

        WebTarget target =

client.target(BASE_URI		+MessageFormat.
		format("hello",
				new Object[] {}));

        return      		target.request(MediaType.TEXT_PLAIN).get(String.class);

 }           

}