package org.example.todospringcustomannotations;

import org.springframework.stereotype.Service;

@Service("AnotherTodoService")
public class AnotherTodoService implements TodoService {

    @Override
    @TimeMonitor
    public String doSomething() {
        try {
            Thread.sleep(3455);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Something from another todo service";
    }
}
