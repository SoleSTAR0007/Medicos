package com.medico.backend.service;

import com.medico.backend.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    private final List<Appointment> appointments = new ArrayList<>();

    public Appointment bookAppointment(Long patientId,Long doctorId, String problem, String date,String time)
    {

        Appointment appointment =
                new Appointment(patientId, doctorId, problem, date, time);

        appointments.add(appointment);
        return appointment;
    }

    public List<Appointment> getAppointmentsByPatient(Long patientId) {
        return appointments.stream()
                .filter(a -> a.getPatientId().equals(patientId))
                .toList();
    }
}
