package org.pagare.javaBrains.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentsResource {

	@GET
	public String Test() {
		return "Hello World";
	}
	@GET
	@Path("/{commentId}")
	public String getCommentById(@PathParam("messageId")String messageId,@PathParam("commentId")String commentId) {
		return "This is CommentID: "+commentId+" for message "+messageId;
	}
}
