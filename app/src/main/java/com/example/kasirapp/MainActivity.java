package com.example.kasirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText edKodeBarang,edJumlahBarang;
    TextView tvNamaBarang,tvHargaBarang,tvTotalHarga,tvDiscount,tvJumlahBayar;
    Button btnKalkulasi;
    LinearLayout llResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edKodeBarang = findViewById(R.id.kode_barang);
        edJumlahBarang = findViewById(R.id.jumlah_barang);
        tvNamaBarang = findViewById(R.id.tv_nama_barang);
        tvHargaBarang = findViewById(R.id.tv_harga_barang);
        tvTotalHarga = findViewById(R.id.tv_total_harga);
        tvDiscount = findViewById(R.id.tv_discount);
        tvJumlahBayar = findViewById(R.id.tv_jumlah_bayar);
        btnKalkulasi = findViewById(R.id.btn_kalkulasi);
        llResult = findViewById(R.id.ll_result);
        btnKalkulasi.setOnClickListener(v -> process());
    }


    private void process() {
        try {
            String mInputKodeBarang = Objects.requireNonNull(edKodeBarang.getText()).toString().trim();
            int lengthKodeBarang = mInputKodeBarang.length();

            String inputKodeBarang = mInputKodeBarang.substring(0, (lengthKodeBarang-2)).trim();
            String inputJumlahBarang = Objects.requireNonNull(edJumlahBarang.getText()).toString().trim();
            String inputDiscount = mInputKodeBarang.substring((lengthKodeBarang-2), (lengthKodeBarang)).trim();

            if (inputKodeBarang.equalsIgnoreCase("AND")) {
                double totalHarga = Double.parseDouble(inputJumlahBarang) * 1000000;
                double discount = ((totalHarga*Double.parseDouble(inputDiscount))/100);
                double jumlahBayar = totalHarga - discount;

                @SuppressLint("DefaultLocale") String mTotalHarga = String.format("Rp.%,.0f", totalHarga).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mDiscount = String.format("Rp.%,.0f", discount).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mJumlahBayar = String.format("Rp.%,.0f", jumlahBayar).replaceAll(",", ".")+",00";

                tvNamaBarang.setText(R.string.android);
                tvHargaBarang.setText(R.string.harga_android);
                tvTotalHarga.setText(mTotalHarga);
                tvDiscount.setText(mDiscount);
                tvJumlahBayar.setText(mJumlahBayar);

                llResult.setVisibility(View.VISIBLE);
            }
            else if (inputKodeBarang.equalsIgnoreCase("IOS")) {
                double totalHarga = Double.parseDouble(inputJumlahBarang) * 2000000;
                double discount = ((totalHarga*Double.parseDouble(inputDiscount))/100);
                double jumlahBayar = totalHarga - discount;

                @SuppressLint("DefaultLocale") String formatRupiah = String.format("Rp.%,.0f", totalHarga).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mDiscount = String.format("Rp.%,.0f", discount).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mJumlahBayar = String.format("Rp.%,.0f", jumlahBayar).replaceAll(",", ".")+",00";

                tvNamaBarang.setText(R.string.apple);
                tvHargaBarang.setText(R.string.harga_apple);
                tvTotalHarga.setText(formatRupiah);
                tvDiscount.setText(mDiscount);
                tvJumlahBayar.setText(mJumlahBayar);

                llResult.setVisibility(View.VISIBLE);
            }
            else if (inputKodeBarang.equalsIgnoreCase("BLB")) {
                double totalHarga = Double.parseDouble(inputJumlahBarang) * 1750000;
                double discount = ((totalHarga*Double.parseDouble(inputDiscount))/100);
                double jumlahBayar = totalHarga - discount;

                @SuppressLint("DefaultLocale") String formatRupiah = String.format("Rp.%,.0f", totalHarga).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mDiscount = String.format("Rp.%,.0f", discount).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mJumlahBayar = String.format("Rp.%,.0f", jumlahBayar).replaceAll(",", ".")+",00";

                tvNamaBarang.setText(R.string.blackberry);
                tvHargaBarang.setText(R.string.harga_blackberry);
                tvTotalHarga.setText(formatRupiah);
                tvDiscount.setText(mDiscount);
                tvJumlahBayar.setText(mJumlahBayar);

                llResult.setVisibility(View.VISIBLE);
            }
            else if (inputKodeBarang.equalsIgnoreCase("WNP")) {
                double totalHarga = Double.parseDouble(inputJumlahBarang) * 2500000;
                double discount = ((totalHarga*Double.parseDouble(inputDiscount))/100);
                double jumlahBayar = totalHarga - discount;

                @SuppressLint("DefaultLocale") String formatRupiah = String.format("Rp.%,.0f", totalHarga).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mDiscount = String.format("Rp.%,.0f", discount).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mJumlahBayar = String.format("Rp.%,.0f", jumlahBayar).replaceAll(",", ".")+",00";

                tvNamaBarang.setText(R.string.windows_phone);
                tvHargaBarang.setText(R.string.harga_windowsPhone);
                tvTotalHarga.setText(formatRupiah);
                tvDiscount.setText(mDiscount);
                tvJumlahBayar.setText(mJumlahBayar);

                llResult.setVisibility(View.VISIBLE);
            }
            else if (inputKodeBarang.equalsIgnoreCase("ASUS ROG")) {
                double totalHarga = Double.parseDouble(inputJumlahBarang) * 5000000;
                double discount = ((totalHarga*Double.parseDouble(inputDiscount))/100);
                double jumlahBayar = totalHarga - discount;

                @SuppressLint("DefaultLocale") String formatRupiah = String.format("Rp.%,.0f", totalHarga).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mDiscount = String.format("Rp.%,.0f", discount).replaceAll(",", ".")+",00";
                @SuppressLint("DefaultLocale") String mJumlahBayar = String.format("Rp.%,.0f", jumlahBayar).replaceAll(",", ".")+",00";

                tvNamaBarang.setText(R.string.asusRogPhone);
                tvHargaBarang.setText(R.string.harga_asusRogPhone);
                tvTotalHarga.setText(formatRupiah);
                tvDiscount.setText(mDiscount);
                tvJumlahBayar.setText(mJumlahBayar);

                llResult.setVisibility(View.VISIBLE);
            }
            else {
                Toast.makeText(this, R.string.barang_tidak_ditemukan, Toast.LENGTH_SHORT).show();
                llResult.setVisibility(View.GONE);
            }
            closeKeyboard();

        } catch (Exception e) {
            Toast.makeText(this, R.string.pesan_error, Toast.LENGTH_SHORT).show();
            edKodeBarang.setError("Anda belum memasukkan kode barang");

            llResult.setVisibility(View.GONE);
            closeKeyboard();
        }
    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();

        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context. INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}