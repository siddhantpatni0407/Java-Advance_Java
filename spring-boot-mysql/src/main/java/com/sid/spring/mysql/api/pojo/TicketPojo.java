package com.sid.spring.mysql.api.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Siddhant
 *
 */
@Entity
@Table(name="Ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketPojo {
	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String category;
}
