package paul.by.finalproject2.ui.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import paul.by.finalproject2.R;
import paul.by.finalproject2.server.StatusTracking;

/**
 * Created by Paul on 28.12.2015.
 */
public class StatusTrackingAdapter extends RecyclerView.Adapter<StatusTrackingAdapter.StatusTrackingAdapterHolder>
{


    //Show results in recyclerview
    public static final String key = "STATE";
    private RealmList<StatusTracking> mStatusTracking = new RealmList<>();
    private ItemClickListener mItemClickListener;

    public List<StatusTracking> getmStatusTracking() {
        return mStatusTracking;
    }

    public void setmStatusTracking(RealmList<StatusTracking> mStatusTracking) {
        this.mStatusTracking = mStatusTracking;
        notifyDataSetChanged();
    }


    public void updateList(List<StatusTracking> list) {
        mStatusTracking.clear();
        mStatusTracking.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public StatusTrackingAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_add_track_item, parent, false);

        StatusTrackingAdapterHolder statusTrackingAdapterHolder = new StatusTrackingAdapterHolder(view);
        Log.d(key, "statusTrackingAdapterHolder");
        return statusTrackingAdapterHolder;
    }

    @Override
    public void onBindViewHolder(StatusTrackingAdapterHolder holder, int position) {
        StatusTracking statusTracking = mStatusTracking.get(position);
        holder.date.setText(statusTracking.getDate());
        holder.currentLocation.setText(statusTracking.getCurrentLocation());
    }

    @Override
    public int getItemCount() {

        if (mStatusTracking == null) {
            Log.d(key, "Null");
            return 0;
        } else {
            Log.d(key, "Not Null");
            return mStatusTracking.size();
        }
    }


    //Custom item for recyclerview
    public static class StatusTrackingAdapterHolder extends RecyclerView.ViewHolder {

        View view;
        public TextView date;
        public TextView currentLocation;


        public StatusTrackingAdapterHolder(View itemView) {
            super(itemView);
            view = itemView;
            date = (TextView) itemView.findViewById(R.id.tv_date);
            currentLocation = (TextView) itemView.findViewById(R.id.tv_message);

        }
    }


    public interface ItemClickListener {
        void onClick(StatusTracking statusTracking);
    }


}
