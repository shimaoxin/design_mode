package observer;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class AddSmsListener extends Listener<AddEvent> {
    @Override
    public void onEvent(AddEvent addEvent) {
        System.out.println("发送短信：" + addEvent.getText());
    }
}
