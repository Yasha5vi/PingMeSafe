package com.example.pingmesafe.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pingmesafe.Activities.PdfViewerActivity;
import com.example.pingmesafe.R;

public class fragment_prepare extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__prepare, container, false);

        view.findViewById(R.id.button_avalanche).setOnClickListener(v -> openPdf("avalanche.pdf"));
        view.findViewById(R.id.button_blizzard).setOnClickListener(v -> openPdf("blizzard.pdf"));
        view.findViewById(R.id.button_drought).setOnClickListener(v -> openPdf("drought.pdf"));
        view.findViewById(R.id.button_earthquake).setOnClickListener(v -> openPdf("earthquake.pdf"));
        view.findViewById(R.id.button_flood).setOnClickListener(v -> openPdf("flood.pdf"));
        view.findViewById(R.id.button_heatwave).setOnClickListener(v -> openPdf("heatwave.pdf"));
        view.findViewById(R.id.button_landslide).setOnClickListener(v -> openPdf("landslide.pdf"));
//        view.findViewById(R.id.button_tornado).setOnClickListener(v -> openPdf("tornado.pdf"));
//        view.findViewById(R.id.button_wildfire).setOnClickListener(v -> openPdf("wildfire.pdf"));

        return view;
    }

    private void openPdf(String pdfFileName) {
        Intent intent = new Intent(getActivity(), PdfViewerActivity.class);
        intent.putExtra("pdfFileName", pdfFileName);
        startActivity(intent);
    }
}

