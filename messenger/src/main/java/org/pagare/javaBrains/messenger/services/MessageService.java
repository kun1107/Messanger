package org.pagare.javaBrains.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.pagare.javaBrains.messenger.database.DatabaseClass;
import org.pagare.javaBrains.messenger.model.MessageModel;

public class MessageService {
	private Map<Integer,MessageModel> messages = DatabaseClass.getMessages();
	
	public  MessageService() {
		messages.put(1, new MessageModel(1,"Hello World","kunal"));
		messages.put(2, new MessageModel(2,"Hello Jersey","kunal"));
	}
	public  List<MessageModel> getAllMessages() {		
		return new ArrayList<MessageModel>(messages.values());
	}
	
	public  MessageModel getMessage(Integer id) {
		return messages.get(id);
	}
	
	public  MessageModel addMessage(MessageModel message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}
	
	public  MessageModel updateMessage(MessageModel message) {
		if(message.getId() <=0) {
			return null;
		}
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public  MessageModel removeMessage(Integer id) {
		return messages.remove(id);
	}
	
}
