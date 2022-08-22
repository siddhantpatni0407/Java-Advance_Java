package com.sid.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.sid.spring.mysql.api.pojo.TicketPojo;

/**
 * @author Siddhant
 *
 */
public interface TicketDao extends CrudRepository<TicketPojo, Integer> {

}
