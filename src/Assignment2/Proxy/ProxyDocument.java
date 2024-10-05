package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    // Задача: Вам нужно реализовать логику для создания документа только при первом обращении к методу display().
    // Если документ уже был загружен, он не должен загружаться заново.
    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(title);
        }
        realDocument.display();
    }
}

