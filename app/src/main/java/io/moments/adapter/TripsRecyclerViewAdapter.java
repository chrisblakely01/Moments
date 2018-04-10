package io.moments.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import io.moments.R;
import io.moments.fragment.TripsFragment.OnListFragmentInteractionListener;
import io.moments.model.Trip;

import java.util.List;

public class TripsRecyclerViewAdapter extends RecyclerView.Adapter<TripsRecyclerViewAdapter.TripViewHolder> {

    private final List<Trip> tripList;
    private final OnListFragmentInteractionListener mListener;

    public TripsRecyclerViewAdapter(List<Trip> tripList, OnListFragmentInteractionListener listener) {
        this.tripList = tripList;
        mListener = listener;
    }

    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_trips, parent, false);
        return new TripViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TripViewHolder holder, int position) {
        holder.mItem = tripList.get(position);
        holder.mTitleView.setText(tripList.get(position).getTitle());
        holder.mDescriptionView.setText(tripList.get(position).getDescription());
        holder.mImageView.setImageResource(tripList.get(position).getImage());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {

                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }

    public class TripViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView mImageView;
        public final TextView mTitleView;
        public final TextView mDescriptionView;
        public Trip mItem;

        public TripViewHolder(View view) {
            super(view);
            mView = view;
            mImageView = view.findViewById(R.id.trip_image);
            mTitleView = view.findViewById(R.id.trip_title);
            mDescriptionView = view.findViewById(R.id.trip_description);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
