package com.capgemini.entities;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Delivery {
	private String ShipmentId;
	private String OrderId;
	private String AgentName;
	private String status;
	private Calendar DueDate;
	public String getShipmentId() {
		return ShipmentId;
	}
	public void setShipmentId(String shipmentId) {
		ShipmentId = shipmentId;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getAgentName() {
		return AgentName;
	}
	public void setAgentName(String agentName) {
		AgentName = agentName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Calendar getDueDate() {
		return DueDate;
	}
	public void setDueDate(Calendar dueDate) {
		DueDate = dueDate;
	}
	@Override
	public String toString() {
		return "Delivery\nShipmentId=" + ShipmentId + "\nOrderId=" + OrderId
				+ "\nAgentName=" + AgentName + "\nstatus=" + status
				+ "\nDueDate=" + DueDate;
	}
	
	
}
