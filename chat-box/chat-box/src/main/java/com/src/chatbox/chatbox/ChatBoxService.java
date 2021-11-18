/**
 * service class for chat box 
 *
 * @author LydiaL
 */

package com.src.chatbox.chatbox;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ChatBoxService {

	private String userForChatBox = "Jack";
	private static final String BASIC_PATTERN_CHECK = "^[a-zA-Z0-9]+$";
	private static final String WELCOME_MESSAGE = "Hi";
	private static final String SPACE = " ";
	private static final String INVALID_PATTERN_MESSAGE = "Invalid Pattern provided - Accepts only Alphanumeric";

	public String getAvailableUser() {
		return userForChatBox;
	}

	public String displayMessageForUser(String name) {
		String chatBoxMessage = null;
		if (!StringUtils.isBlank(name) && name.matches(BASIC_PATTERN_CHECK)) {
			chatBoxMessage = WELCOME_MESSAGE.concat(SPACE).concat(name);
		} else {
			chatBoxMessage = INVALID_PATTERN_MESSAGE;
		}
		return chatBoxMessage;
	}
}
