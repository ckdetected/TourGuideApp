package ml.chandrakant.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CoachingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Coaching institutes");
        // Create an array of coaching institutes.
        final ArrayList<FragmentItem> coachings = new ArrayList<>();
        coachings.add(new FragmentItem("Allen Career Institute", "Mahaveer Nagar"));
        coachings.add(new FragmentItem("Bansal Classes", "Vigyan Nagar"));
        coachings.add(new FragmentItem("Career Point", "IL Centre"));
        coachings.add(new FragmentItem("Resonance", "City Mall"));
        coachings.add(new FragmentItem("Nucleus Academy", "Indravihar"));
        coachings.add(new FragmentItem("Vibrant Academy", "Jawahar Nagar"));
        coachings.add(new FragmentItem("Sarvottam Institute", "Keshavpura"));
        coachings.add(new FragmentItem("BKM Classes", "Gumanpura"));
        coachings.add(new FragmentItem("Domain E", "SC Road"));
        coachings.add(new FragmentItem("Kumar Classes", "Nayapura"));

        // Create an {@link FragmentItemAdapter}, whose data source is a list of {@link FragmentItem}s. The
        // adapter knows how to create list items for each item in the list.
        FragmentItemAdapter adapter = new FragmentItemAdapter(getActivity(), coachings, android.R.color.holo_blue_dark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list.
        ListView listView = getActivity().findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FragmentItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FragmentItem} in the list.
        listView.setAdapter(adapter);
    }
}
