package sky.pro.lesson.hwbin.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.lesson.hwbin.service.StoreService;

import java.util.List;

@RestController
@RequestMapping(path = "/store/order/")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("item") List<Long> item) {
        storeService.add(item);
        return "Добавлено";
    }

    @GetMapping(path = "/get")
    public List<Long> get() {
        return storeService.getAll();
    }
}
