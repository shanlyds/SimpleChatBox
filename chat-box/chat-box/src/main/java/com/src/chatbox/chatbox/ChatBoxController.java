/**
 * Controller class for chat box
 *
 * @author LydiaL
 */

package com.src.chatbox.chatbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatBoxController {

	@Autowired
	private ChatBoxService chatBoxService;

	@RequestMapping("/getAvailableUser")
	public String getAvailableUser() {
		return chatBoxService.getAvailableUser();
	}

	@RequestMapping("/getAvailableUser/{user}")
	public String displayMessageForUser(@PathVariable String user) {
		return chatBoxService.displayMessageForUser(user);
	}

}
