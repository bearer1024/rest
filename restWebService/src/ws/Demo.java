package ws;

import javax.ws.rs.*;

import javax.ws.rs.core.*;

@Path("demo")

public class Demo {

       @GET

       @Path("hello")   // this define the path to access hello method

       @Produces(MediaType.TEXT_PLAIN)  // this define the path to access hello method

   public String hello(){

              return "Hello World";

       }

       @GET

       @Path("sum/{a}/{b}") // this define the path to access hello method

       @Produces(MediaType.TEXT_PLAIN)

   public String sum(@PathParam("a") int a,@PathParam("b") int b){

             

              return String.valueOf(a+b);

       }

}

