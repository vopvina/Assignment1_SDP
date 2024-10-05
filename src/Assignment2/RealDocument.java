package Assignment2;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        // Задача: Вывести сообщение о загрузке документа
        System.out.println("Loading document from disk: " + title);
    }

    @Override
    public void display() {
        // Задача: Вывести сообщение об отображении документа
        System.out.println("Displaying document: " + title);
    }
}

