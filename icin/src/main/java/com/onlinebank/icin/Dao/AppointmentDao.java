package com.onlinebank.icin.Dao;
import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.Appointment;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

	//Appointment createAppointment(Appointment appointment);
    List<Appointment> findAll();
  // Appointment findAppointment(Long id);
   // void confirmAppointment();

	//Appointment findOne(Long id);
    
    
}
