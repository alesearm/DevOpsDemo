package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DoneTaskController {

    private Map<Integer, DoneTask> doneTasks = new HashMap<>();

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.doneTasks.put(1, new DoneTask(1, "Wäsche machen", "Alle Wäsche der Woche waschen", LocalDate.now()));
        this.doneTasks.put(2, new DoneTask(2, "Bügeln", "Hemden und Hosen bügeln", LocalDate.now()));
        this.doneTasks.put(3, new DoneTask(3, "Staubsaugen", "Die ganze Wohnung staubsaugen", LocalDate.now()));
        this.doneTasks.put(4, new DoneTask(4, "Geschirr", "Geschirrspüler ein- und ausräumen", LocalDate.now()));
        this.doneTasks.put(5, new DoneTask(5, "Bewerbung abgesendet", "Bewerbung für den Traumjob abgeschickt", LocalDate.now()));
        System.out.println("Initial done tasks loaded.");
    }






    @GetMapping("/services/donetasks")
    public List<PathListEntry<Integer>> getAllDoneTasks() {
        var result = new ArrayList<PathListEntry<Integer>>();
        for (var doneTask : this.doneTasks.values()) {
            var entry = new PathListEntry<Integer>();
            entry.setKey(doneTask.getId(), "doneTaskKey");
            entry.setName(doneTask.getTitle());
            entry.getDetails().add(doneTask.getDescription());
            entry.setTooltip(doneTask.getDescription());
            result.add(entry);
        }
        return result;
    }

    @GetMapping("/services/donetasks/{id}")
    public DoneTask getDoneTask(@PathVariable Integer id) {
        return this.doneTasks.get(id);
    }

    @PostMapping("/services/donetasks")
    public void createDoneTask(@RequestBody DoneTask doneTask) {
        var newId = this.doneTasks.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1;
        doneTask.setId(newId);
        this.doneTasks.put(newId, doneTask);
    }

    @PutMapping("/services/donetasks/{id}")
    public void updateDoneTask(@PathVariable Integer id, @RequestBody DoneTask doneTask) {
        doneTask.setId(id);
        this.doneTasks.put(id, doneTask);
    }

    @DeleteMapping("/services/donetasks/{id}")
    public DoneTask deleteDoneTask(@PathVariable Integer id) {
        return this.doneTasks.remove(id);
    }
}
