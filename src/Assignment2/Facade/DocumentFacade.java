package Assignment2.Facade;

import Assignment2.*;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Bridge.*;

// Фасад для работы с документами
public class DocumentFacade {
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.

    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.

    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }

    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }

    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(title);
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render("Content of " + title);
    }
}


