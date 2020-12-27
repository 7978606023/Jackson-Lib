package jsonignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IgnoreFiledTest {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		CustomerDTO dto = new CustomerDTO(100, "abc", "def");
		String result = mapper.writeValueAsString(dto);
		System.out.println(result);
	}
}
