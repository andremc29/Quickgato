package com.example.hp.quickgato;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }

    public static MatchFragment newInstance(){return new MatchFragment();}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_match, container, false);
    }
    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        final SeekBar userSb =  (SeekBar) view.findViewById(R.id.userSb);
        final TextView userTv = (TextView) view.findViewById(R.id.userTv);
        final SeekBar loverSb = (SeekBar) view.findViewById(R.id.loverSb);
        final TextView loverTv = (TextView) view.findViewById(R.id.loverTv);
        Button button = (Button) view.findViewById(R.id.matchBtn);
    userSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            userTv.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    loverSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromLover) {
            loverTv.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int user = userSb.getProgress();
            int lover = loverSb.getProgress();
        }
    });

    }
}
