package com.example.DemoApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.example.DemoApplication.Message;

@Repository
public interface todoRepository extends JpaRepository<Message, Integer>{
    List<Message> findBytodoName(String name);
}
