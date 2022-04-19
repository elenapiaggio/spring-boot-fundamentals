package com.competidor.springbootfundamentals.web;


import com.competidor.springbootfundamentals.entity.Application;
import com.competidor.springbootfundamentals.entity.Ticket;
import com.competidor.springbootfundamentals.exception.ApplicationNotFoundException;
import com.competidor.springbootfundamentals.service.ApplicationService;
import com.competidor.springbootfundamentals.service.ReleaseService;
import com.competidor.springbootfundamentals.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Controller
@RequestMapping("/tza")
public class TzaController {

  private ApplicationService applicationService;
  private TicketService ticketService;

  @Autowired
  public void setApplicationService(ApplicationService applicationService) { this.applicationService = applicationService; }

  @Autowired
  public void setTicketService(TicketService ticketService) {
    this.ticketService = ticketService;
  }


  @GetMapping("/tickets")
  public ResponseEntity<List<Ticket>> getAllTickets() {
    List<Ticket> list = ticketService.listTickets();
    return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
  }

  @GetMapping("/applications")
  public ResponseEntity<List<Application>> getAllApplications() {
    List<Application> list = applicationService.listApplications();
    return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
  }

  @GetMapping("/application/{id}")
  public ResponseEntity<Application> getApplication(@PathVariable("id") long id) {
    try {
      return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
    } catch (ApplicationNotFoundException exception) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
    }
  }



}
