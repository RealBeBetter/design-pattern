package adapter.adapter;

/**
 * @author wei.song
 * @since 2022-10-31 10:50
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放Vlc文件
     *
     * @param fileName 文件名称
     */
    void playVlc(String fileName);

    /**
     * 播放Mp4文件
     *
     * @param fileName 文件名称
     */
    void playMp4(String fileName);

}
