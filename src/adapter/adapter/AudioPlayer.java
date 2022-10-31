package adapter.adapter;

/**
 * 音乐播放器
 * @author wei.song
 * @since 2022-10-31 11:12
 */
public class AudioPlayer implements MediaPlayer {

    public static final String VLC_TYPE = "vlc";
    public static final String MP4_TYPE = "mp4";
    public static final String MP3_TYPE = "mp3";

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (MP3_TYPE.equalsIgnoreCase(audioType)) {
            // 播放 mp3 音乐文件的内置支持
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (VLC_TYPE.equalsIgnoreCase(audioType) || MP4_TYPE.equalsIgnoreCase(audioType)) {
            // mediaAdapter 提供了播放其他文件格式的支持
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
