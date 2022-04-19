package com.competidor.springbootfundamentals.service;

import com.competidor.springbootfundamentals.entity.Ticket;
import com.competidor.springbootfundamentals.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketServiceImpl implements TicketService{

  @Autowired
  private TicketRepository ticketRepository;

  @Override
  public List<Ticket> listTickets() {
    return (List<Ticket>) ticketRepository.findAll();
  }


}
