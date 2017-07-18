package mainpack;


import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;
import util.*;

public class App {
    public static void main(String[] args) {
    	
    	port(5678);
    	staticFileLocation("/public/polling");
    	redirect.get("/", "/home");


    	
        get("/home", (req, res) -> { 
        
        	Map<String, Object> model = new HashMap<>();
        	model.put("nameofperson", "Sanskar");
        	
        	
        return Util.render(model, "public/polling/addpage.html");
        
        });
        
        
    }
}