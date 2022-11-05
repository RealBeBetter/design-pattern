package prototype.prototype;

/**
 * @author wei.song
 * @since 2022-11-05 16:13
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    /**
     * 绘制图形方法
     */
    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
