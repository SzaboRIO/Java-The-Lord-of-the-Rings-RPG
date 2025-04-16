package Adventure;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

/**
 * The Audio class provides functionality for playing audio files within the Adventure game.
 * This utility class handles the loading and playback of sound effects and music.
 */
public class Audio {

    /**
     * Plays an audio file from the specified path.
     * This method attempts to load and play the audio file asynchronously.
     * If the file doesn't exist or an error occurs during playback, the method
     * fails silently to prevent interruption of the game flow.
     *
     * @param caminho The file path to the audio file to be played, relative to the resources root
     */
    public static void playMusic(String caminho) {
        try {
            URL url = Audio.class.getClassLoader().getResource(caminho);
            if (url != null) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
        } catch (Exception e) {
            // Optional: mostrar erro
            System.err.println("Erro ao tocar áudio: " + e.getMessage());
        }
    }
}
