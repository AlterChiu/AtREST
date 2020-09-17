
package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtTest {

	@GetMapping("/testingAPI")
	public String getValue(@RequestParam(value = "name", defaultValue = "World") String id) {
		System.out.println("hello world");
		return "hello " + id;
	}

}
