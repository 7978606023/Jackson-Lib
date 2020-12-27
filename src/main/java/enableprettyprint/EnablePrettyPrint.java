package enableprettyprint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnablePrettyPrint {

	public static void main(String[] args) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		User bean = new User(1,"abc","def","abcdef");
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bean);
		
		System.out.println(result);

	}

}
