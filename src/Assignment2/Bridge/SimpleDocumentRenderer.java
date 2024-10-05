package Assignment2.Bridge;

// ЗАДАНИЕ: Реализовать рендеринг документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    //Задача: Реализуйте вызов метода рендеринга документа через переданный движок
    //(например, SimpleRenderEngine или HighlightRenderEngine).
    @Override
    public void render(String content) {
        engine.render(content);
    }
}

