package observer;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class AddEvent extends Event {

    private String text;

    public AddEvent(Object source, String text) {
        super(source);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
