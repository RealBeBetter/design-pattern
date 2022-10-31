package adapter.adapter;

/**
 * @author wei.song
 * @since 2022-10-31 10:49
 */
public interface MediaPlayer {

    /**
     * 播放音频
     *
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    public void play(String audioType, String fileName);

}
