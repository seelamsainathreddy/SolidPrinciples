package DesignPatterns.Creational.AbstractFactory;


interface Button {
    void paint();
}

interface Checkbox {
    void render();
}

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendered Windows Button");
    }
}

class MacButton implements Button {
    public void paint() {
        System.out.println("Rendered Mac Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendered Windows Checkbox");
    }
}

class MacCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendered Mac Checkbox");
    }
}


 interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

//concrete factories
class WindowsUIFactory implements UIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacUIFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.paint();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Switch factories here to change platforms
        UIFactory factory = new MacUIFactory();
        Application app = new Application(factory);
        app.renderUI();
    }
}
