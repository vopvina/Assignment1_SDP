package Assignment2.Bridge;

// Реализация простого рендеринга документа
public class SimpleRenderEngine implements RenderEngine {
    @Override
    public void render(String content) {
        System.out.println("Rendering document in simple mode: " + content);
    }
}

