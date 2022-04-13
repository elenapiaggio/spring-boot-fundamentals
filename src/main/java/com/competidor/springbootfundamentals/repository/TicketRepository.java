package com.competidor.springbootfundamentals.repository;

import com.competidor.springbootfundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
