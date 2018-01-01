package clazz;

import org.jetbrains.annotations.NotNull;

public class JavaButton implements View {

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    public class ButtonState implements State {
    }

    public static void main(String[] args) {
        State buttonState = new JavaButton().getCurrentState();
    }
}
