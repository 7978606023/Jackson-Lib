package enableprettyprint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class UsingSerializationFeatures {
 public static void main(String[] args) throws JsonProcessingException {
	ObjectMapper mapper = new ObjectMapper();
	mapper.enable(SerializationFeature.INDENT_OUTPUT);
	User bean = new User(1,"abc","def","abcdef");
	String result = mapper.writeValueAsString(bean);
	System.out.println(result);
}
}
