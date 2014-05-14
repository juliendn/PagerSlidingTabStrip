package fr.jdn.slidingtabstrip.sample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Julien De Nadai on 14/05/2014.
 */
public class AboutDialogFragment extends DialogFragment implements View.OnClickListener {

    static AboutDialogFragment newInstance() {
        return new AboutDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container);
        getDialog().setTitle("About this sample");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.portrait_jdn).setOnClickListener(this);
        view.findViewById(R.id.github_jdn).setOnClickListener(this);
        view.findViewById(R.id.portrait_astutz).setOnClickListener(this);
        view.findViewById(R.id.github_astutz).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (view.getId()) {
            case R.id.portrait_jdn:
                intent.setData(Uri.parse("https://plus.google.com/u/0/+JulienDeNadai"));
                break;
            case R.id.github_jdn:
                intent.setData(Uri.parse("https://github.com/juliendn/SlidingTabStrip"));
                break;
            case R.id.portrait_astutz:
                intent.setData(Uri.parse("https://plus.google.com/u/0/+AndreasStütz"));
                break;
            case R.id.github_astutz:
                intent.setData(Uri.parse("https://github.com/astuetz/PagerSlidingTabStrip"));
                break;
        }
        startActivity(intent);
    }
}