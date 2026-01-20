package com.medico.backend.service;

import com.medico.backend.model.Appointment;
import com.medico.backend.repository.AppointmentRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {this.appointmentRepository = appointmentRepository;
    }

    public Appointment bookAppointment(Long patientId,
                                        Long doctorId,
                                        String problem,
                                        String date,
                                        String time) {

        Appointment appointment =
                new Appointment(patientId, doctorId, problem, date, time);

        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsByPatient(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }
}

