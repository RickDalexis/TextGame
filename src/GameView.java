
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;

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

        // this is all to draw a rectangle 
        screen.newTextGraphics().drawRectangle(
                new TerminalPosition(3,3), new TerminalSize(10,10), '*');
        screen.refresh();

        screen.readInput();
        screen.stopScreen();

        {
        }
    }

}
