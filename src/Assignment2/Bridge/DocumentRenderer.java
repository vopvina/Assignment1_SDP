package Assignment2.Bridge;

// Класс для связи документа с движком рендеринга
public abstract class DocumentRenderer {
    protected RenderEngine engine;

    public DocumentRenderer(RenderEngine engine) {
        this.engine = engine;
    }

    public abstract void render(String content);
}

