package com.hibernate_spring_boot_utc_timezone.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate_spring_boot_utc_timezone.entity.Screenshot;

@Repository
public interface ScreenshotRepository extends JpaRepository<Screenshot, Long>  {

	@Transactional(readOnly = true)
	public Screenshot findByName(String name);
}
