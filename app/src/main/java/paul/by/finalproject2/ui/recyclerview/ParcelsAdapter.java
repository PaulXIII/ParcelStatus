package paul.by.finalproject2.ui.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import paul.by.finalproject2.R;
import paul.by.finalproject2.helper.ItemTouchHelperAdapter;

/**
 * Created by Павел on 02.04.2016.
 */
public class ParcelsAdapter extends RecyclerView.Adapter<ParcelsAdapter.ParcelsAdapterHolder> implements ItemTouchHelperAdapter
{

    //Show results in recyclerview
    public static final String key = "STATE";
    private List<String> mResults = new ArrayList<>();

    public void updateList(List<String> list) {
        mResults.clear();
        mResults.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public ParcelsAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_parcels_item, parent, false);

        ParcelsAdapterHolder statusTrackingAdapterHolder = new ParcelsAdapterHolder(view);
        Log.d(key, "statusTrackingAdapterHolder");
        return statusTrackingAdapterHolder;
    }

    @Override
    public void onBindViewHolder(ParcelsAdapterHolder holder, int position) {
        Log.d(key, mResults.get(position));
        holder.trackNumber.setText(mResults.get(position));

    }

    @Override
    public int getItemCount() {
        if (mResults == null) {
            Log.d(key, "Null");
            return 0;
        } else {
            Log.d(key, "Not Null");
            return mResults.size();
        }
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        if (fromPosition < toPosition) {
            for (int i = fromPosition; i < toPosition; i++) {
                Collections.swap(mResults, i, i + 1);
            }
        } else {
            for (int i = fromPosition; i > toPosition; i--) {
                Collections.swap(mResults, i, i - 1);
            }
        }
        notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public void onItemDismiss(int position) {
        mResults.remove(position);
        notifyItemRemoved(position);
    }

    public static class ParcelsAdapterHolder extends RecyclerView.ViewHolder {

        View view;
        public TextView trackNumber;


        public ParcelsAdapterHolder(View itemView) {
            super(itemView);
            view = itemView;
            trackNumber = (TextView) itemView.findViewById(R.id.tv_parcel_trackNumber);

        }
    }
}
