package digest.journalapp.control;

import digest.journalapp.control.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("journal")
public class controller {
    private Map<Long, JournalEntry> journal = new HashMap<>();

    @GetMapping()
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journal.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry) {
        journal.put(entry.getId(), entry);
        return true;

    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable long myId) {
        return journal.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry DeleteEntryById(@PathVariable long myId) {
        return journal.remove(myId);
    }


    public JournalEntry Update(@PathVariable long id, @RequestBody JournalEntry entry) {
      return   journal.put(id, entry);
    }

}
