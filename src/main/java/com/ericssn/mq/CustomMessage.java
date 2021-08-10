package com.ericssn.mq;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString 
public class CustomMessage {
	
	private String messageId;
	private String message;
	private Date messageDate;
	
	
	public CustomMessage() {
		
	}

	public CustomMessage(String messageId, String message, Date messageDate) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.messageDate = messageDate;
	}





	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	@Override
	public String toString() {
		return "CustomMessage [messageId=" + messageId + ", message=" + message + ", messageDate=" + messageDate + "]";
	}

	
	
	
}
