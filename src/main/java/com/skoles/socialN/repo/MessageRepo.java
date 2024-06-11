package com.skoles.socialN.repo;

import com.skoles.socialN.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
