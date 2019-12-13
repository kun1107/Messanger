package org.pagare.javaBrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.pagare.javaBrains.messenger.model.MessageModel;
import org.pagare.javaBrains.messenger.services.MessageService;

@Path("/messages")
public class MessagesResource {
	
	MessageService messageService = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<MessageModel> getMessages(@QueryParam("year") int year) {
		if(year > 0) {
			return messageService.getAllMessagesForTheYear(year);
		}
		return messageService.getAllMessages();
	}
	
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MessageModel getMessage(@PathParam("messageId") Integer id) {
		return messageService.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageModel addMessage(MessageModel message) {
		return messageService.addMessage(message);
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messagesId}")
	public MessageModel updateMessage(@PathParam("messagesId")int id,MessageModel message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId")int id) {
		 messageService.removeMessage(id);
	}
	
	@Path("/{messageId}/comments")
	public CommentsResource Test() {
		return new CommentsResource();
	}
}
