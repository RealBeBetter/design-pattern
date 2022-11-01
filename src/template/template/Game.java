package template.template;

/**
 * @author wei.song
 * @since 2022-11-01 11:00
 */
public abstract class Game {
    /**
     * 游戏初始化
     */
    abstract void initialize();
    /**
     * 开始游戏
     */
    abstract void startPlay();
    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模版方法
     */
    public final void play() {
        // 初始化
        initialize();
        // 开始
        startPlay();
        // 结束
        endPlay();
    }
}
