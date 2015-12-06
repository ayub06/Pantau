package com.blogspot.onayub.pantau;


import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CommentFragment extends DialogFragment {

    private EditText inputKomentar;
    private Button buttonKirim;
    private String komentar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.comment_view, container, false);
        getDialog().setTitle("Simple Dialog");

        inputKomentar = (EditText)rootView.findViewById(R.id.input_komentar);
        buttonKirim = (Button)rootView.findViewById(R.id.kirim);

        buttonKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                komentar = inputKomentar.getText().toString();
            }
        });

        return rootView;
    }
}
