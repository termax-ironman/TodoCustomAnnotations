package org.example.todospringcustomannotations;

import org.springframework.stereotype.Service;

@Service("FakeTodoService")
public class FakeTodoService implements TodoService {

    @TimeMonitor
    public String doSomething() {
        for (long i = 0;i < 100000; i++) {}
        return "Fake Something";
    }
}
