package com.narrative;

import com.narrative.Domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NarrativeBackendApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testLombok(){
		User user = new User();
		user.setId(3);
		user.setName("aman");
		user.setBio("bro");

		User user2 = User.builder()
				.id(2)
				.name("atul")
				.bio("buddy")
				.build();

		System.out.println(user);
		System.out.println(user2);
	}

}
