package adapter.adapter;

/**
 * @author wei.song
 * @since 2022-10-31 10:54
 */
public class VicPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
