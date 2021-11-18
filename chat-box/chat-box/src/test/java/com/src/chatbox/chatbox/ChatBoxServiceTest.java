/**
 * Test class for chat box service
 *
 * @author LydiaL
 */

package com.src.chatbox.chatbox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChatBoxServiceTest {

	private ChatBoxService chatBoxService;

	@BeforeEach
	public void get() {
		chatBoxService = new ChatBoxService();
	}

	@Test
	public void should_check_for_available_user_in_chat_box() {
		assertEquals("Jack", chatBoxService.getAvailableUser());
	}

	@Test
	public void should_display_hi_message_for_valid_user_in_chat_box() {
		String user = "Tom";
		assertEquals("Hi Tom", chatBoxService.displayMessageForUser(user));
	}

	@Test
	public void should_check_for_empty_user_in_chat_box() {
		String user = "";
		assertEquals("Invalid Pattern provided - Accepts only Alphanumeric",
				chatBoxService.displayMessageForUser(user));
	}

	@Test
	public void should_check_for_wrong_format_user_in_chat_box() {
		String user = "To---";
		assertEquals("Invalid Pattern provided - Accepts only Alphanumeric",
				chatBoxService.displayMessageForUser(user));
	}

	@Test
	public void should_check_for_null_user_in_chat_box() {
		String user = null;
		assertEquals("Invalid Pattern provided - Accepts only Alphanumeric",
				chatBoxService.displayMessageForUser(user));
	}

}
