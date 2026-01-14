package com.medico.backend.dto;

public class AppointmentRequest {

    private Long patientId;
    private Long doctorId;
    private String problem;
    private String date;
    private String time;

    public Long getPatientId() { return patientId; }
    public Long getDoctorId() { return doctorId; }
    public String getProblem() { return problem; }
    public String getDate() { return date; }
    public String getTime() { return time; }
}
