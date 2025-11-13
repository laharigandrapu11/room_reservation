package com.reservation.room_reservation_system.repository;

import com.reservation.room_reservation_system.model.AccountRequest;
import com.reservation.room_reservation_system.model.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRequestRepository extends JpaRepository<AccountRequest, Long> {
    List<AccountRequest> findByStatus(RequestStatus status);
    boolean existsByEmail(String email);
    long countByStatus(RequestStatus status);
}

