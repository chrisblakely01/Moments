package io.moments.adapter;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import io.moments.R;
import io.moments.fragment.JournalFragment.OnListFragmentInteractionListener;
import io.moments.model.JournalEntry;

import java.util.List;

//TODO reinitialise the meta data when I've decided on the layout
public class JournalRecyclerViewAdapter extends RecyclerView.Adapter<JournalRecyclerViewAdapter.ViewHolder> {

    private final List<JournalEntry> mValues;
    private final OnListFragmentInteractionListener mListener;

    public JournalRecyclerViewAdapter(List<JournalEntry> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_journal_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mTitleView.setText(mValues.get(position).getTitle());
        holder.mDescriptionView.setText(mValues.get(position).getDescription());
        holder.mImageView.setImageResource(mValues.get(position).getImage());
        holder.mLocation.setText(mValues.get(position).getLocation());
//        holder.mWeather.setText(mValues.get(position).getWeather());
//        holder.mActivity.setText(mValues.get(position).getActivity());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    Snackbar.make(v, "Item clicked: " + holder.mItem.getTitle(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitleView;
        public final ImageView mImageView;
        public final TextView mDescriptionView;
        public final TextView mLocation;
//        public final TextView mWeather;
//        public final TextView mActivity;

        public JournalEntry mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitleView = view.findViewById(R.id.journal_entry_title);
            mImageView = view.findViewById(R.id.journal_entry_image);
            mDescriptionView = view.findViewById(R.id.journal_entry_description);
            mLocation = view.findViewById(R.id.journal_entry_meta_location);
//            mWeather = view.findViewById(R.id.journal_entry_meta_weather);
//            mActivity = view.findViewById(R.id.journal_entry_meta_activity);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
