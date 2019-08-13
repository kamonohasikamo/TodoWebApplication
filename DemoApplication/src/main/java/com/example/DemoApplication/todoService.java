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

    // dataAdd
    public Message addTodoList(Message msgForm) {
        Message msg = new Message();
        msg.setTodoName(msgForm.getTodoName());
        msg.setTodoTime(msgForm.getTodoTime());

        return todoRepo.save(msg);
    }

    // update
    public Message updateDB(Message msgForm) {
        Message msg = new Message();
        msg.setId(msgForm.getId());
        msg.setTodoName(msgForm.getTodoName());
        msg.setTodoTime(msgForm.getTodoTime());

        return todoRepo.save(msg);
    }

    // delete by id
    public void deleteTodo_id(Integer id) {
        Message msg = new Message();
        msg.setId(id);
        todoRepo.delete(msg);
    }

    // delete by todoName
    public void deleteTodo_todoName(String todoName) {
        Message msg = new Message();
        msg.setTodoName(todoName);
        todoRepo.delete(msg);
    }
}
