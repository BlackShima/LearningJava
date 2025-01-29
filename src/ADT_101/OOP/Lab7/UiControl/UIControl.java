package OOP.Lab7.UiControl;

public abstract class UIControl {
    public void draw() {
        System.out.println("Drawing a UI Control");
    }
    public void handleEvent(String event) {
        System.out.println("Handling event: " + event);
    }
    public abstract String getName();
}


class Button extends UIControl {
    public void draw() {
        System.out.println("Drawing Button with lable "+":Draw:");
    }

    public void handleEvent(String event) {
        if (event.equals("click")) {
            System.out.println("Button clicked");
        }else{
            super.handleEvent(event);
        }
    }
    public String getName() {
        return "Button";
    }
}
class TextBox extends UIControl {
    public void draw() {
        System.out.println("Drawing TextBox with current text "+"::");
    }

    public void handleEvent(String event) {
        if (event.equals("textChange")) {
            System.out.println("Text changed in TextBox");
        }else{
            super.handleEvent(event);
        }
    }
    public String getName() {
        return "TextBox";
    }
}
class ColorPicker extends UIControl {
    public void draw() {
        System.out.println("Drawing ColorPicker with selected color "+ "Black");
    }
    public void handleEvent(String event) {
        if (event.equals("colorSelected")) {
            System.out.println("Color selected in ColorPicker");
        }else{
            super.handleEvent(event);
        }
    }
    public String getName() {
        return "ColorPicker";
    }
}
