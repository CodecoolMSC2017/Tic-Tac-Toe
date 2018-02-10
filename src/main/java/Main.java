
import javax.swing.JFrame;

/**
 * This is a simple little TicTacToe game.
 */
public class Main
{
    public static void main(String[] args)
    {
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("Pufi's TicTacToe Game!");
        ticTacToe.setSize(600, 600);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
} //