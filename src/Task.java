public class Task {

    // min. 2 caratteri, max 200 caratteri
    private String description;

    // formato data: yyyy-MM-dd
    private String date;

    // formato autore: <nome>_<cognome>
    private String author;

    public Task(String description, String date, String author) {
        this.description = description;
        this.date = date;
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "testSrc.Task{" +
                "description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
