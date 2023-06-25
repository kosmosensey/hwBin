package sky.pro.lesson.hwbin.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class StoreService {
    private List<Long> item = new ArrayList<>();
    public void add(List<Long> item){
        this.item.addAll(item);
    }

    public List<Long> getAll() {
        return Collections.unmodifiableList(item);
    }
}
