package com.blogspot.onayub.pantau;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AddCard extends AppCompatActivity {

    private EditText inputNominal;
    private Button pilihFoto;
    private Long nominal;
    private Bitmap foto;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private ImageView mImageView;
    String mCurrentPhotoPath;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputNominal = (EditText)findViewById(R.id.input_nominal);

        pilihFoto = (Button) findViewById(R.id.pilih_foto);
        pilihFoto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                dispatchTakePictureIntent();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nominal = Long.getLong(inputNominal.getText().toString());
                NavUtils.navigateUpFromSameTask(AddCard.this);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mImageView=(ImageView) findViewById(R.id.imgView);
            mImageView.setImageBitmap(imageBitmap);
            mImageView.setScaleX(2);
            mImageView.setScaleY(2);
        }
    }
}