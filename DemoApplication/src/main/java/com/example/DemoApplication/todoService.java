package com.example.DemoApplication;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class todoService {
    @Autowired
    todoRepository todoRepo;

    // showAllData
    public List<Message> showAllData(){
        return todoRepo.findAll();
    }

    // todoName search
    public List<Message> searchTodoName(String name) {
        return todoRepo.findBytodoName(name);
    }
}