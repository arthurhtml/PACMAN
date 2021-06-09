package AFFICHAGE;

import AFFICHAGE.VIEW.JeuCompletView;
import BACK.Audio;
import BACK.CONTROLEUR.ControleBouton;
import BACK.Game;
import BACK.PREDEF.Liens;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Appli extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Game game = new Game();
        final Scene scene = new Scene(new ControleBouton(stage,game).getMenuView());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Pacman");
        stage.setWidth(game.getWIDTH_FEN());
        stage.setHeight(game.getHEIGHT_FEN());
        stage.setScene(scene);
        stage.show();
    }
}