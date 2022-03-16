package com.qa.holiday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.holiday.model.HolidayBooking;

public interface Repo extends JpaRepository<HolidayBooking, Long> {

}
