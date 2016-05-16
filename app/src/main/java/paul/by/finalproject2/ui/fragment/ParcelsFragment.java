package paul.by.finalproject2.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;
import paul.by.finalproject2.R;
import paul.by.finalproject2.model.response.ManagerResult;
import paul.by.finalproject2.ui.recyclerview.ItemTouchHelperCallback;
import paul.by.finalproject2.ui.recyclerview.ParcelsAdapter;

/**
 * Created by Paul on 28.12.2015.
 */
public class ParcelsFragment extends Fragment {


    public static final String ARG_PAGE = "ARG_PAGE";

    private ParcelsAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;
    private Realm mRealm;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        mAdapter = new ParcelsAdapter();
        mLinearLayoutManager = new LinearLayoutManager(getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parcels, container, false);

        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.rc_pacels_list);
        mRecyclerView.swapAdapter(mAdapter, false);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        ItemTouchHelper.Callback callback = new ItemTouchHelperCallback(mAdapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(mRecyclerView);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showParcels();
    }

    @Override
    public void onStart() {
        super.onStart();
        mRealm = Realm.getDefaultInstance();
    }

    @Override
    public void onStop() {
        super.onStop();
        mRealm.close();

    }

    public void showParcels() {
//        Realm realm = Realm.getDefaultInstance();

        List<String> parcels = new ArrayList<>();

        RealmResults<ManagerResult> query = mRealm.where(ManagerResult.class)
                .findAll();

        for (int i = 0; i < query.size(); i++) {
            parcels.add(query.get(i).getTrackNumber());
            Log.d(ParcelsFragment.class.getName(), "position " + i + " " + query.get(i).getTrackNumber());
        }
        mAdapter.updateList(parcels);

    }
}
