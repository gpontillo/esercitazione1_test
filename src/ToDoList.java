import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToDoList {
    /*
    TODO:
    su addTask:
    inserimento del task in base alla data
    dati sempre ordinati per data
    all'aggiunta un controllo sulla data

    su author:
    metodo che permette di recuperare tutti i task di un autore

    metodo da aggiungere:
    ad una specifica data, restituisce tutti i task in quella data

    FATTO ricordarsi di specificare nei requirement quali sono i valori ammessi e non (soprattuto su autore es. qual è il formato)
    aggiungere vincoli da testare es nome.cognome o indirizzo email

    FATTO descrizione limite lunghezza massima e minima es. min 2 char e max. 1000
     */
    private List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        Collections.sort(tasks, Comparator.comparing(Task::getDate));
    }

    public void removeTaskByDate(String date) {
        for (Task task : tasks) {
            if(task.getDate() == date)
                tasks.remove(task);
        }
        Collections.sort(tasks, Comparator.comparing(Task::getDate));
    }

    public List<Task> getByAuthor(String author) {
        return tasks.stream().filter(task -> task.getAuthor() == author).toList();
    }

    public List<Task> getByDate(String date) {
        return tasks.stream().filter(task -> task.getDate() == date).toList();
    }

    public List<Task> getAllTasks() {
        return tasks.stream().toList();
    }

}