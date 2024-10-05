package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Задача: Реализуйте логику, которая сначала отображает документ, а затем добавляет к нему водяной знак.
    @Override
    public void display() {
        decoratedDocument.display();
        addWatermark();
    }

    private void addWatermark() {
        System.out.println("Adding watermark to document.");
    }
}

