package paul.by.finalproject2.helper;

/**
 * Created by Павел on 10.04.2016.
 */
public interface ItemTouchHelperAdapter {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);

}
