package com.onlinebank.icin.service;

import java.util.List;


import com.onlinebank.icin.domain.Appointment;


public interface AppointmentService {

	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}