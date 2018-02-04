package com.otmb.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmb.entities.Appointment;
import com.otmb.entities.Doctor;
import com.otmb.util.HibernateUtil;

public class OTMBDTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		boolean flag = false;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Appointment appointment = null;
			Appointment appointment1 = null;
			Doctor doctor = null;
			Set<Appointment> appointments = null;
			Set<Appointment> appointments1 = null;
			appointment = new Appointment();
			appointment.setPatientName("Raju");
			appointment.setPatientName("Sanju");
			appointment.setStatus("Confirmed");
			appointment.setDoctor((Doctor) doctor);

			appointments = new HashSet<Appointment>();
			appointments1 = new HashSet<Appointment>();

			appointment1 = new Appointment();
			appointment1.setAppointmentDate(new Date());
			appointment1.setPatientName("Ravi");
			appointment1.setStatus("Confirmed");
			appointment1.setDoctor(doctor);

			appointments.add(appointment);
			appointments1.add(appointment1);

			doctor = new Doctor();
			doctor.setDoctorName("Dr. Ravi");
			doctor.setExperience(12);
			doctor.setSpecialization("Heart");
			doctor.setAppointments(appointments);
			doctor.setAppointments(appointments1);
			session.save(doctor);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag == true) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}
		HibernateUtil.closeSessionFactory();
	}

}
