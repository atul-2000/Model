package HelloWorld;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;
public class trial {

	public UUID handleRequest(List<String> input) {
        String name=null,id=null;
        name=input.get(0);
        id=input.get(1);
        UUID uuid = UUID.randomUUID();
		    System.out.println("Validation API called with parameters name:"+name+","+ " seller I'd:"+id);
		    System.out.println("Unique token associated with this query:"+uuid);
	      return uuid;
	  } 

	}
