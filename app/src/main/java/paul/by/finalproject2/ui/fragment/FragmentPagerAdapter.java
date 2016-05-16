package paul.by.finalproject2.ui.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import paul.by.finalproject2.R;

/**
 * Created by Paul on 28.12.2015.
 */

//class allows us add fragments to activity
public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    final int PAGE_COUNT = 2;
    private Context context;
    private int[] imageResId = {
            R.drawable.ic_play_shopping_bag_24dp,
            R.drawable.ic_vertical_align_bottom_24dp

    };

    private String [] text={
            "Text1", "Text2"
    };

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                ParcelsFragment parcelsFragment =new ParcelsFragment();
                return parcelsFragment;
            case 1:
                TrackingParselFragment trackingParselFragment=new TrackingParselFragment();
                return trackingParselFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }


    @Override
    public CharSequence getPageTitle(int position) {

//        return text[position];

        Drawable image = ContextCompat.getDrawable(context, imageResId[position]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        SpannableString sb = new SpannableString(" ");
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;

    }

}
