package com.competidor.springbootfundamentals.service;

import com.competidor.springbootfundamentals.entity.Application;

import java.util.List;

public interface ApplicationService {

  List<Application> listApplications();
  Application findApplication(long id);

}
