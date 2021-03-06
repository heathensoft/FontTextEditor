package graphics.test.text;

/**
 * @author Frederik Dahl
 * 29/06/2021
 */

public interface CharRegister {

    void registerControl(int glfwKey);

    void registerChar(byte charCode);

    void signalActivate();

    void signalDeactivate();

    boolean isSleeping();
}
