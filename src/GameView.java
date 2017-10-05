
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.io.IOException;

public class GameView {
    public static void main(String[] args) throws IOException {
        //initialize terminal
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        //initialize screen and set it to terminal
        Screen screen = new TerminalScreen(terminal);
        // start the screen to open it
        screen.startScreen();
        // you must clear the screen in a loop to display the  graphics
        screen.clear();

        {
        }
    }

}
