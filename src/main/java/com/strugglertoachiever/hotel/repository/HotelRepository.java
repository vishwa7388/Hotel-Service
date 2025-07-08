package com.strugglertoachiever.hotel.repository;

import com.strugglertoachiever.hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {}
