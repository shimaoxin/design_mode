package observer;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class AddLogListener extends Listener<AddEvent> {


    @Override
    public void onEvent(AddEvent addEvent) {
        System.out.println("记录日志：" + addEvent.getText());
    }
}
