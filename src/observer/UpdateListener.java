package observer;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class UpdateListener  extends Listener<UpdateEvent>{

    @Override
    public void onEvent(UpdateEvent updateEvent) {
        System.out.println("接收到修改事件：" + updateEvent.getText());
    }
}
