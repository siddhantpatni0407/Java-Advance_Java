package com.sid.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.spring.mysql.api.dao.TicketDao;
import com.sid.spring.mysql.api.pojo.TicketPojo;

/**
 * @author Siddhant
 *
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<TicketPojo> tickets) {
		dao.save(tickets);
		return "ticket booked :" + tickets.size();
	}

	@GetMapping("/getTickets")
	public List<TicketPojo> getTickets() {
		return (List<TicketPojo>) dao.findAll();
	}
}