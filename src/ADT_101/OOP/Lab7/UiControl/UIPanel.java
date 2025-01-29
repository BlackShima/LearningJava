package OOP.Lab7.UiControl;

public class UIPanel {
    private UIControl[] controls;

    public UIPanel(UIControl[] controls) {
        this.controls = controls;
    }
    public void drawAll() {
        for (UIControl control : controls) {
            control.draw();
        }
    }
    public static void main(String[] args) {
        Button button = new Button();
        TextBox textBox = new TextBox();
        ColorPicker colorPicker = new ColorPicker();
        UIControl[] controls = {button, textBox, colorPicker};
        UIPanel panel = new UIPanel(controls);
        panel.drawAll();
    }
}

