package com.example.istatiskcim;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout ilkSecimModLY;
    ConstraintLayout modOptionsLY, medyanOptionsLY, aritmatikOptionsLY, harmonikOptionsLY, geometrikOptionsLY, standartOptionsLY, orneklemOptionsLY, degisimOptionsLY, carpiklikOptionsLY, basiklikOptionsLY, kucukBOptionsLY, buyukKOptionsLY, kombinasOptionsLY, permutasOptionsLY;
    EditText editTextMod, editTextMedyan, editTextAritmatik, editTextHarmonik, editTextGeometrik, editTextStandart, editTextOrneklem, editTextDegisim, editTextCarpiklik, editTextBasiklik, editTextKucukB, editTextBuyukK, editTextKombinasN, editTextKombinasR, editTextPermutasN, editTextPermutasR;
    TextView textViewMod, textViewMedyan, textViewAritmatik, textViewHarmonik, textViewGeometrik, textViewStandart, textViewOrneklem, textViewDegisim, textViewCarpiklik, textViewBasiklik, textViewKucukB, textViewBuyukK, textViewKombinas, textViewPermutas;
    LottieAnimationView modOnayla, medyanOnayla, aritmatikOnayla, harmonikOnayla, geometrikOnayla, standartOnayla, orneklemOnayla, degisimOnayla, carpiklikOnayla, basiklikOnayla, kucukBOnayla, buyuktenKOnayla, kombinasOnayla, permutasOnayla;
    LottieAnimationView modTemizle, medyanTemizle, aritmatikTemizle, harmonikTemizle, geometrikTemizle, standartTemizle, orneklemTemizle, degisimTemizle, carpiklikTemizle, basiklikTemizle, kucukBTemizle, buyuktenKTemizle, kombinasTemizle, permutasTemizle;
    Button modImage,medyanImage,aritmatikImage,harmonikImage,geometrikImage,standartImage,orneklemImage,degisimImage,carpiklikImage,basiklikImage,kucukBImage,buyukKImage,kombinasImage,permutasImage;
    Animation fromBottom, fromSide, fromUp;

    TextView diziGoster,diziGoster2,diziGoster3,diziGoster4,diziGoster5,diziGoster6,diziGoster7,diziGoster8,diziGoster9,diziGoster10,diziGoster11,diziGoster12,diziGoster13,diziGoster14;

    CountDownTimer countDownTimer;

    int i = 0; //Switch Case için
    DecimalFormat df = new DecimalFormat("#.#####");

    double[] sayiDizisiMod = new double[50];
    int indisMod = 0;
   // boolean girisTipiMod=false ;

    int indisMedyan = 0;
    double[] sayiDizisiMedyan = new double[50];
  //  boolean girisTipiMedyan ;

    int indisAritmatik = 0;
    double[] sayiDizisiAritmatik = new double[50];
  //  boolean girisTipiAritmatik ;

    int indisHarmonik = 0;
    double[] sayiDizisiHarmonik = new double[50];
  //  boolean girisTipiHarmonik ;

    int indisGeometrik = 0;
    double[] sayiDizisiGeometrik = new double[50];
  //  boolean girisTipiGeometrik ;

    double[] sayiDizisiStandart = new double[50];
    int indisStandart = 0;
  //  boolean girisTipiStandart ;

    double[] sayiDizisiOrneklem = new double[50];
    int indisOrneklem = 0;
  //  boolean girisTipiOrneklem ;

    double[] sayiDizisiDegisim = new double[50];
    int indisDegisim = 0;
  //  boolean girisTipiDegisim ;

    double[] sayiDizisiCarpiklik = new double[50];
    int indisCarpiklik = 0;
 //   boolean girisTipiCarpiklik ;

    double[] sayiDizisiBasiklik = new double[50];
    int indisBasiklik = 0;
  //  boolean girisTipiBasiklik ;

    double[] sayiDizisiKucuktenB = new double[50];
    int indisKucuktenB = 0;
  //  boolean girisTipiKucuktenB ;

    double[] sayiDizisiBuyuktenK = new double[50];
    int indisBuyuktenK = 0;
  //  boolean girisTipiBuyuktenK ;

    String kombinasNGirilen = null;
    String kombinasRGirilen = null ;
    int n1, r1, z1 ;
    double kom;


    String permutasNGirilen = null;
    String permutasRGirilen = null ;
    int n2,r2,z2;
    double perm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modOptionsLY = findViewById(R.id.modOptionsLY);
        medyanOptionsLY = findViewById(R.id.medyanOptionsLY);
        aritmatikOptionsLY = findViewById(R.id.aritmatikOptionsLY);
        harmonikOptionsLY = findViewById(R.id.harmonikOptionsLY);
        geometrikOptionsLY = findViewById(R.id.geometrikOptionsLY);
        standartOptionsLY = findViewById(R.id.standartSOptionsLY);
        orneklemOptionsLY = findViewById(R.id.orneklemVOptionsLY);
        degisimOptionsLY = findViewById(R.id.degisimKOptionsLY);
        carpiklikOptionsLY = findViewById(R.id.carpiklikOptionsLY);
        basiklikOptionsLY = findViewById(R.id.basiklikOOptionsLY);
        kucukBOptionsLY = findViewById(R.id.kucuktenBOptionsLY);
        buyukKOptionsLY = findViewById(R.id.buyuktenKOptionsLY);
        kombinasOptionsLY = findViewById(R.id.kombinasOptionsLY);
        permutasOptionsLY = findViewById(R.id.permutasOptionsLY);



        modTemizle = findViewById(R.id.lottieKaldirMod);
        medyanTemizle = findViewById(R.id.lottieKaldirMedyan);
        aritmatikTemizle = findViewById(R.id.lottieKaldirAritmatik);
        harmonikTemizle = findViewById(R.id.lottieKaldirHarmonik);
        geometrikTemizle = findViewById(R.id.lottieKaldirGeometrik);
        standartTemizle = findViewById(R.id.lottieKaldirStandartS);
        orneklemTemizle = findViewById(R.id.lottieKaldirOrneklem);
        degisimTemizle = findViewById(R.id.lottieKaldirDegisimK);
        carpiklikTemizle = findViewById(R.id.lottieKaldirCarpiklik);
        basiklikTemizle = findViewById(R.id.lottieKaldirBasiklik);
        kucukBTemizle = findViewById(R.id.lottieKaldirKucuktenB);
        buyuktenKTemizle = findViewById(R.id.lottieKaldirBuyuktenK);
        kombinasTemizle = findViewById(R.id.lottieKaldirKombinas);
        permutasTemizle = findViewById(R.id.lottieKaldirPermutas);

        modOnayla = findViewById(R.id.lottieOnaylaMod);
        medyanOnayla = findViewById(R.id.lottieOnaylaMedyan);
        aritmatikOnayla = findViewById(R.id.lottieOnaylaAritmatik);
        harmonikOnayla = findViewById(R.id.lottieOnaylaHarmonik);
        geometrikOnayla = findViewById(R.id.lottieOnaylaGeometrik);
        standartOnayla = findViewById(R.id.lottieOnaylaStandartS);
        orneklemOnayla = findViewById(R.id.lottieOnaylaOrneklem);
        degisimOnayla = findViewById(R.id.lottieOnaylaDegisimK);
        carpiklikOnayla = findViewById(R.id.lottieOnaylaCarpiklik);
        basiklikOnayla = findViewById(R.id.lottieOnaylaBasiklik);
        kucukBOnayla = findViewById(R.id.lottieOnaylaKucuktenB);
        buyuktenKOnayla = findViewById(R.id.lottieOnaylabuyuktenK);
        kombinasOnayla = findViewById(R.id.lottieOnaylaKombinas);
        permutasOnayla = findViewById(R.id.lottieOnaylaPermutas);

        editTextMod = findViewById(R.id.editTextMod);
        editTextMedyan = findViewById(R.id.editTextMedyan);
        editTextAritmatik = findViewById(R.id.editTextAritmatik);
        editTextHarmonik = findViewById(R.id.editTextHarmonik);
        editTextGeometrik = findViewById(R.id.editTextGeometrik);
        editTextStandart = findViewById(R.id.editTextStandartS);
        editTextOrneklem = findViewById(R.id.editTextOrneklem);
        editTextDegisim = findViewById(R.id.editTextDegisimK);
        editTextCarpiklik = findViewById(R.id.editTextCarpiklik);
        editTextBasiklik = findViewById(R.id.editTextBasiklik);
        editTextKucukB = findViewById(R.id.editTextKucuktenB);
        editTextBuyukK = findViewById(R.id.editTextBuyuktenK);
        editTextKombinasN = findViewById(R.id.editTextKombinasN);
        editTextKombinasR = findViewById(R.id.editTextKombinasR);
        editTextPermutasN = findViewById(R.id.editTextPermutasN);
        editTextPermutasR = findViewById(R.id.editTextPermutasR);


        textViewMod = findViewById(R.id.modSonucTV);
        textViewMedyan = findViewById(R.id.medyanSonucTV);
        textViewAritmatik = findViewById(R.id.aritmatikSonucTV);
        textViewHarmonik = findViewById(R.id.harmonikSonucTV);
        textViewGeometrik = findViewById(R.id.geometrikSonucTV);
        textViewStandart = findViewById(R.id.standartSSonucTV);
        textViewOrneklem = findViewById(R.id.orneklemSonucTV);
        textViewDegisim = findViewById(R.id.degisimKSonucTV);
        textViewCarpiklik = findViewById(R.id.carpiklikSonucTV);
        textViewBasiklik = findViewById(R.id.basiklikSonucTV);
        textViewKucukB = findViewById(R.id.kucutenBSonucTV);
        textViewBuyukK = findViewById(R.id.buyuktenKSonucTV);
        textViewKombinas = findViewById(R.id.kombinasSonucTV);
        textViewPermutas = findViewById(R.id.permutasSonucTV);

        diziGoster = findViewById(R.id.diziGoster);
        diziGoster2 = findViewById(R.id.diziGoster2);
        diziGoster3 = findViewById(R.id.diziGoster3);
        diziGoster4 = findViewById(R.id.diziGoster4);
        diziGoster5 = findViewById(R.id.diziGoster5);
        diziGoster6 = findViewById(R.id.diziGoster6);
        diziGoster7 = findViewById(R.id.diziGoster7);
        diziGoster8 = findViewById(R.id.diziGoster8);
        diziGoster9 = findViewById(R.id.diziGoster9);
        diziGoster10 = findViewById(R.id.diziGoster10);
        diziGoster11 = findViewById(R.id.diziGoster11);
        diziGoster12 = findViewById(R.id.diziGoster12);
        diziGoster13 = findViewById(R.id.diziGoster13);
        diziGoster14 = findViewById(R.id.diziGoster14);

        modImage =findViewById(R.id.modBG);
        medyanImage =findViewById(R.id.medyanBG);
        aritmatikImage =findViewById(R.id.aritmatikBG);
        harmonikImage =findViewById(R.id.harmonikBG);
        geometrikImage =findViewById(R.id.geometrikBG);
        standartImage =findViewById(R.id.standartSBG);
        orneklemImage =findViewById(R.id.orneklemVBG);
        degisimImage =findViewById(R.id.degisimKBG);
        carpiklikImage =findViewById(R.id.carpiklikBG);
        basiklikImage =findViewById(R.id.basiklikOBG);
        kucukBImage =findViewById(R.id.kucuktenBBG);
        buyukKImage =findViewById(R.id.buyuktenKBG);
        kombinasImage =findViewById(R.id.kombinasBG);
        permutasImage =findViewById(R.id.permutasBG);











        editTextMod.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                String modGirilen = editTextMod.getText().toString();
                sayiDizisiMod[indisMod] = Double.parseDouble(modGirilen);
                editTextMod.getText().clear();
                textViewMod.setText(modGirilen+" Mod Listenize Eklendi");
                diziGoster.append(sayiDizisiMod[indisMod]  + " / ");
                indisMod++;
                }
                catch (Exception e){}
                return true;
            }
        });

        editTextMedyan.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                String medyanGirilen = editTextMedyan.getText().toString();
                sayiDizisiMedyan[indisMedyan] = Double.parseDouble(medyanGirilen);
                editTextMedyan.getText().clear();
                textViewMedyan.setText(sayiDizisiMedyan[indisMedyan] + " Medyan Listenize Eklendi ");
                diziGoster2.append(sayiDizisiMedyan[indisMedyan]  + " / ");
                indisMedyan++;
                }
                catch (Exception e){}
                return true;
            }
        });

        editTextAritmatik.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                String aritmatikGirilen = editTextAritmatik.getText().toString();
                sayiDizisiAritmatik[indisAritmatik] = Double.parseDouble(aritmatikGirilen);
                editTextAritmatik.getText().clear();
                textViewAritmatik.setText(sayiDizisiAritmatik[indisAritmatik] + " Aritmatik Ortalama Listesine Eklendi ");
                    diziGoster3.append(sayiDizisiAritmatik[indisAritmatik]  + " / ");
                indisAritmatik++;
                }
                catch (Exception e){}
                return true;
            }
        });

        editTextHarmonik.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                String harmonikGirilen = editTextHarmonik.getText().toString();
                sayiDizisiHarmonik[indisHarmonik] = Double.parseDouble(harmonikGirilen);
                editTextHarmonik.getText().clear();
                textViewHarmonik.setText(sayiDizisiHarmonik[indisHarmonik] + " Harmonik Ortalama Listesine Eklendi ");
                    diziGoster4.append(sayiDizisiHarmonik[indisHarmonik]  + " / ");
                indisHarmonik++;
                }
                catch (Exception e){}
                return true;
            }
        });

        editTextGeometrik.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                String geometrikGirilen = editTextGeometrik.getText().toString();
                sayiDizisiGeometrik[indisGeometrik] = Double.parseDouble(geometrikGirilen);
                editTextGeometrik.getText().clear();
                textViewGeometrik.setText(sayiDizisiGeometrik[indisGeometrik] + " Geometrik Ortalama Listesine Eklendi ");
                   diziGoster5.append(sayiDizisiGeometrik[indisGeometrik]  + " / ");
                indisGeometrik++;
               }
               catch (Exception e){}
                return true;
            }
        });

        editTextStandart.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                String standartGirilen = editTextStandart.getText().toString();
                sayiDizisiStandart[indisStandart] = Double.parseDouble(standartGirilen);
                editTextStandart.getText().clear();
                textViewStandart.setText(sayiDizisiStandart[indisStandart] + " Listeye Eklendi ");
                    diziGoster6.append(sayiDizisiStandart[indisStandart]  + " / ");
                indisStandart++;
                }
                catch (Exception e){}
                return true;
            }
        });

        editTextOrneklem.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                String orneklemGirilen = editTextOrneklem.getText().toString();
                sayiDizisiOrneklem[indisOrneklem] = Double.parseDouble(orneklemGirilen);
                editTextOrneklem.getText().clear();
                textViewOrneklem.setText(sayiDizisiOrneklem[indisOrneklem] + " Listeye Eklendi ");
                   diziGoster7.append(sayiDizisiOrneklem[indisOrneklem]  + " / ");
                indisOrneklem++;
               }
               catch (Exception e){}
                return true;
            }
        });

        editTextDegisim.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                String degisimGirilen = editTextDegisim.getText().toString();
                sayiDizisiDegisim[indisDegisim] = Double.parseDouble(degisimGirilen);
                editTextDegisim.getText().clear();
                textViewDegisim.setText(sayiDizisiDegisim[indisDegisim] + " Listeye Eklendi ");
                    diziGoster8.append(sayiDizisiDegisim[indisDegisim]  + " / ");
                indisDegisim++;
                }
                catch (Exception e){}
                return true;
            }
        });

        editTextCarpiklik.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                String carpiklikGirilen = editTextMod.getText().toString();
                sayiDizisiCarpiklik[indisCarpiklik] = Double.parseDouble(carpiklikGirilen);
                editTextCarpiklik.getText().clear();
                textViewCarpiklik.setText(sayiDizisiCarpiklik[indisCarpiklik] + " Listeye Eklendi ");
                   diziGoster9.append(sayiDizisiCarpiklik[indisCarpiklik]  + " / ");
                indisCarpiklik++;
               }
               catch (Exception e){}
                return true;
            }
        });

        editTextBasiklik.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                String basiklikGirilen = editTextBasiklik.getText().toString();
                sayiDizisiBasiklik[indisBasiklik] = Double.parseDouble(basiklikGirilen);
                editTextBasiklik.getText().clear();
                textViewBasiklik.setText(sayiDizisiBasiklik[indisBasiklik] + " Listeye Eklendi ");
                   diziGoster10.append(sayiDizisiBasiklik[indisBasiklik]  + " / ");
                indisBasiklik++;
               }
               catch (Exception e){}
                return true;
            }
        });

        editTextKucukB.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                String kucuktenBGirilen = editTextKucukB.getText().toString();
                sayiDizisiKucuktenB[indisKucuktenB] = Double.parseDouble(kucuktenBGirilen);
                editTextKucukB.getText().clear();
                textViewKucukB.setTextSize(14);
                textViewKucukB.setText(sayiDizisiKucuktenB[indisKucuktenB] + " Listeye Eklendi ");
                   diziGoster11.append(sayiDizisiKucuktenB[indisKucuktenB]  + " / ");
                indisKucuktenB++;
               }
               catch (Exception e){}
                return true;
               }
        });

        editTextBuyukK.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                String buyuktenKGirilen = editTextBuyukK.getText().toString();
                sayiDizisiBuyuktenK[indisBuyuktenK] = Double.parseDouble(buyuktenKGirilen);
                editTextBuyukK.getText().clear();
                textViewKucukB.setTextSize(14);
                textViewBuyukK.setText(sayiDizisiBuyuktenK[indisBuyuktenK] + " ListeyeEklendi ");
                   diziGoster12.append(sayiDizisiBuyuktenK[indisBuyuktenK]  + " / ");
                indisBuyuktenK++;
               }
               catch (Exception e){}
                return true;
            }
        });

        editTextKombinasN.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                kombinasNGirilen = editTextKombinasN.getText().toString();
                    n1 = Integer.parseInt(kombinasNGirilen);

                    if (kombinasRGirilen == null) {
                        textViewKombinas.setText(" R Değeri Giriniz ");
                        editTextKombinasR.requestFocus();
                    } else
                        textViewKombinas.setText(" Hesaplaya Tıklayın ");
                }
                        catch (Exception e){

                }
                    return true;
                }

        });

        editTextKombinasR.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               try{
                kombinasRGirilen = editTextKombinasR.getText().toString();
                r1 = Integer.parseInt(kombinasRGirilen);

                if (kombinasNGirilen == null){
                    textViewKombinas.setText(" N Değeri Giriniz ");
                editTextKombinasN.requestFocus();
            }
                    else
                    textViewKombinas.setText(" Hesaplaya Tıklayın ");
                }
                catch (Exception e){

                }
                return true;
            }
        });



        editTextPermutasN.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                    permutasNGirilen = editTextPermutasN.getText().toString();
                    n2= Integer.parseInt(permutasNGirilen);

                    if (permutasRGirilen == null) {
                        textViewPermutas.setText(" R Değeri Giriniz ");
                        editTextPermutasR.requestFocus();
                    } else
                        textViewPermutas.setText(" Hesaplaya Tıklayın ");
                }
                catch (Exception e){

                }
                return true;
            }

        });


        editTextPermutasR.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                try{
                    permutasRGirilen = editTextPermutasR.getText().toString();
                    r2= Integer.parseInt(permutasRGirilen);

                    if (permutasNGirilen == null) {
                        textViewPermutas.setText(" N Değeri Giriniz ");
                        editTextPermutasN.requestFocus();
                    } else
                        textViewPermutas.setText(" Hesaplaya Tıklayın ");
                }
                catch (Exception e){

                }
                return true;
            }
        });


    }


    public void modOnclik(View view) {
       try{
        i = 1;
        hideLY();
        showLY();

       }
       catch (Exception e){}
       }

    public void medyanOnclik(View view) {
       try{
        i = 2;
        hideLY();
        showLY();
       }
       catch (Exception e){}
       }

    public void aritmatikOnclik(View view) {
       try{
        i = 3;
        hideLY();
        showLY();
       }
       catch (Exception e){}
       }

    public void harmonikOnclik(View view) {
        try{
        i = 4;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void geometrikOnclik(View view) {
        try{
        i = 5;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void standartOnclik(View view) {
        try{
        i = 6;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void orneklemOnclik(View view) {
       try{
        i = 7;
        hideLY();
        showLY();
       }
       catch (Exception e){}
       }

    public void degisimOnclik(View view) {
        try{
        i = 8;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void carpiklikOnclik(View view) {
        try{
        i = 9;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void basiklikOnclik(View view) {
        try{
        i = 10;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void kucukBOnclik(View view) {
        try{
        i = 11;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void buyukKOnclik(View view) {
        try{
        i = 12;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }

    public void kombinasOnclik(View view) {
        try{
        i = 13;
        hideLY();
        showLY();
    }
        catch (Exception e){}
    }

    public void permutasOnclik(View view) {
        try {
        i = 14;
        hideLY();
        showLY();
        }
        catch (Exception e){}
        }



    public void hideLY() {
        try{


        textViewMod.setText("");
        textViewMedyan.setText("");
        textViewAritmatik.setText("");
        textViewHarmonik.setText("");
        textViewGeometrik.setText("");
        textViewStandart.setText("");
        textViewOrneklem.setText("");
        textViewDegisim.setText("");
        textViewCarpiklik.setText("");
        textViewBasiklik.setText("");
        textViewKucukB.setText("");
        textViewBuyukK.setText("");
        textViewKombinas.setText("");
        textViewPermutas.setText("");

        modOptionsLY.setVisibility(View.INVISIBLE);
        medyanOptionsLY.setVisibility(View.INVISIBLE);
        aritmatikOptionsLY.setVisibility(View.INVISIBLE);
        harmonikOptionsLY.setVisibility(View.INVISIBLE);
        geometrikOptionsLY.setVisibility(View.INVISIBLE);
        standartOptionsLY.setVisibility(View.INVISIBLE);
        orneklemOptionsLY.setVisibility(View.INVISIBLE);
        degisimOptionsLY.setVisibility(View.INVISIBLE);
        carpiklikOptionsLY.setVisibility(View.INVISIBLE);
        basiklikOptionsLY.setVisibility(View.INVISIBLE);
        kucukBOptionsLY.setVisibility(View.INVISIBLE);
        buyukKOptionsLY.setVisibility(View.INVISIBLE);
        kombinasOptionsLY.setVisibility(View.INVISIBLE);
        permutasOptionsLY.setVisibility(View.INVISIBLE);

            modImage.setClickable(true);
            medyanImage.setClickable(true);
            aritmatikImage.setClickable(true);
            harmonikImage.setClickable(true);
            geometrikImage.setClickable(true);
            standartImage.setClickable(true);
            orneklemImage.setClickable(true);
            degisimImage.setClickable(true);
            carpiklikImage.setClickable(true);
            basiklikImage.setClickable(true);
            kucukBImage.setClickable(true);
            buyukKImage.setClickable(true);
            kombinasImage.setClickable(true);
            permutasImage.setClickable(true);

            diziGoster.setText("");
            diziGoster2.setText("");
            diziGoster3.setText("");
            diziGoster4.setText("");
            diziGoster5.setText("");
            diziGoster6.setText("");
            diziGoster7.setText("");
            diziGoster8.setText("");
            diziGoster9.setText("");
            diziGoster10.setText("");
            diziGoster11.setText("");
            diziGoster12.setText("");
            diziGoster13.setText("");
            diziGoster14.setText("");
        }
        catch (Exception e){}
        }

    public void showLY() {
        switch (i) {
            case 1:
                modOptionsLY.setVisibility(View.VISIBLE);
                modImage.setClickable(false);
                break;
            case 2:
                medyanOptionsLY.setVisibility(View.VISIBLE);
                medyanImage.setClickable(false);
                break;
            case 3:
                aritmatikOptionsLY.setVisibility(View.VISIBLE);
                aritmatikImage.setClickable(false);
                break;
            case 4:
                harmonikOptionsLY.setVisibility(View.VISIBLE);
                harmonikImage.setClickable(false);
                break;
            case 5:
                geometrikOptionsLY.setVisibility(View.VISIBLE);
                geometrikImage.setClickable(false);
                break;
            case 6:
                standartOptionsLY.setVisibility(View.VISIBLE);
                standartImage.setClickable(false);
                break;
            case 7:
                orneklemOptionsLY.setVisibility(View.VISIBLE);
                orneklemImage.setClickable(false);
                break;
            case 8:
                degisimOptionsLY.setVisibility(View.VISIBLE);
                degisimImage.setClickable(false);
                break;
            case 9:
                carpiklikOptionsLY.setVisibility(View.VISIBLE);
                carpiklikImage.setClickable(false);
                break;
            case 10:
                basiklikOptionsLY.setVisibility(View.VISIBLE);
                basiklikImage.setClickable(false);
                break;
            case 11:
                kucukBOptionsLY.setVisibility(View.VISIBLE);
                kucukBImage.setClickable(false);
                break;
            case 12:
                buyukKOptionsLY.setVisibility(View.VISIBLE);
                buyukKImage.setClickable(false);
                break;
            case 13:
                kombinasOptionsLY.setVisibility(View.VISIBLE);
                kombinasImage.setClickable(false);
                break;
            case 14:
                permutasOptionsLY.setVisibility(View.VISIBLE);
                permutasImage.setClickable(false);
                break;
            default:
                hideLY();
                break;
        }
    }



    public void mod(View view) {
        try {
        int mod = 0;
        double modval;
        int k, i, counter;
        modval = sayiDizisiMod[0];
        for (i = 0; i < indisMod; ++i) {
            counter = 0;
            for (k = 0; k < indisMod; ++k)
                if (sayiDizisiMod[k] == sayiDizisiMod[i])
                    counter++;
            if (counter > mod) {
                mod = counter;
                modval = sayiDizisiMod[i];
            }
        }
        textViewMod.setText("Mod : " + modval + " / " + "Frekans : " + mod);
        // textViewMod.setText(""+sayiDizisi[0]+" "+sayiDizisi[1]+"  "+sayiDizisi[2]);
        }
        catch (Exception e){}

    }

    public void medyan(View view) {
        try {
        int i, j;
        double sayi;


        for (i = 0; i < indisMedyan - 1; i++)        //girilen sayılar küçükten büyüğe sıralandı
        {
            for (j = i + 1; j < indisMedyan; j++) {
                if (sayiDizisiMedyan[i] > sayiDizisiMedyan[j]) {
                    sayi = sayiDizisiMedyan[i];
                    sayiDizisiMedyan[i] = sayiDizisiMedyan[j];
                    sayiDizisiMedyan[j] = sayi;
                }
            }
        }

        double medyan;
        if (indisMedyan % 2 == 0)    //girilen sayıların 2 ye bölümünden kalan 0 ise
        {
            double sayi1 = sayiDizisiMedyan[(indisMedyan - 1) / 2];    //eleman sayısının iki orta değeri alınır
            double sayi2 = sayiDizisiMedyan[((indisMedyan - 1) / 2) + 1];
            medyan = (sayi1 + sayi2) / 2;
        } else {
            medyan = sayiDizisiMedyan[indisMedyan / 2];
        }
        textViewMedyan.setText("Medyan : " + medyan);
        }
        catch (Exception e){}
        }

    public void aritmatikOrtalama(View view) {
        try {
        int i, n;
        double topla = 0;

        for (i = 0; i < indisAritmatik; i++)    //diziye atanan elemanlar toplandý
        {
            topla = topla + sayiDizisiAritmatik[i];
        }
        float sonuc = (float) (topla / indisAritmatik);
        textViewAritmatik.setText("Aritmatik Ortalama = " + sonuc);
    }
        catch (Exception e){}
    }

    public void harmonikOrtalama(View view) {
        try{
        int i;
        double toplam = 0.0;

        for (i = 0; i < indisHarmonik; i++) {
            toplam = toplam + (1 / (double) sayiDizisiHarmonik[i]);
        }
        double harmonik = (double) indisHarmonik / toplam;

        textViewHarmonik.setText("Harmonik Ortalama = " + df.format(harmonik));
    }
        catch (Exception e){}
    }

    public void geometrikOrtalama(View view) {
        try{
        int n, i;
        double carp = 1;
        double sonuc;

        for (i = 0; i < indisGeometrik; i++)    //for döngüsü ile her bir indise eleman atandı
        {
            carp = carp * sayiDizisiGeometrik[i];    //her bir eleman çarpılarak carp a atandı
        }

        sonuc = Math.pow((double) carp, (double) 1 / indisGeometrik);    //carp ın girilen n kadar sayının kökünü alır
        textViewGeometrik.setText("Geometrik Ortalama = " + df.format(sonuc));
        }
        catch (Exception e){}
    }

    public void standartSapma(View view) {
        try{
        int i, n;
        double topla = 0;
        double toplam = 0;

        for (i = 0; i < indisStandart; i++)    //for döngüsü ile her bir indise eleman atandı
        {
            topla = topla + sayiDizisiStandart[i];    //her bir eleman toplanıp topla ya atandı
        }
        double ort, orneklem;
        ort = topla / indisStandart;            //elemanların ortalaması bulunudu

        for (i = 0; i < indisStandart; i++)    //her bir sayı ortalamadan çıkartıldı ve her birinin karesi alındı
        {
            sayiDizisiStandart[i] = sayiDizisiStandart[i] - ort;
            sayiDizisiStandart[i] = sayiDizisiStandart[i] * sayiDizisiStandart[i];
        }

        for (i = 0; i < indisStandart; i++)    //sayıların her biri topandı
        {
            toplam = toplam + sayiDizisiStandart[i];
        }
        orneklem = toplam / (indisStandart - 1);    //toplam eleman saysıın bir eksiğine bölünerek örneklem bulundu
        textViewStandart.setText("Değerlerin Standart Sapması = " + df.format(Math.sqrt(orneklem)));
        }
        catch (Exception e){}

    }

    public void orneklemVaryansi(View view) {
        try{
        int i;
        double topla = 0;
        double toplam = 0;

        for (i = 0; i < indisOrneklem; i++)    //for döngüsü ile her bir indise eleman atandı
        {
            topla = topla + sayiDizisiOrneklem[i];    //her bir eleman toplanıp toplam a atandı
        }
        double ort, orneklem;
        ort = topla / indisOrneklem;        //elemanların ortalaması bulunudu

        for (i = 0; i < indisOrneklem; i++) {
            sayiDizisiOrneklem[i] = sayiDizisiOrneklem[i] - ort;    //her bir sayı ortalamadan çıkartıldı ve her birinin karesi alındı
            sayiDizisiOrneklem[i] = sayiDizisiOrneklem[i] * sayiDizisiOrneklem[i];
        }

        for (i = 0; i < indisOrneklem; i++) {
            toplam = toplam + sayiDizisiOrneklem[i];        //sayıların her biri topandı
        }
        orneklem = toplam / (indisOrneklem - 1);        //toplam eleman saysıın bir eksiğine bölünerek örneklem bulundu
        textViewOrneklem.setText("Orneklem Varyansı = " + df.format(orneklem));
    }
        catch (Exception e){}
    }

    public void degisimKatsatisi(View view) {
        try{
        int i;
        double topla = 0;
        double toplam = 0;

        for (i = 0; i < indisDegisim; i++)    //for döngüsü ile her bir indise eleman atandı
        {
            topla = topla + sayiDizisiDegisim[i];    //her bir eleman toplanıp toplam a atandı
        }
        double ort, orneklem;
        ort = topla / indisDegisim;        //elemanların ortalaması bulunudu

        for (i = 0; i < indisDegisim; i++) {
            sayiDizisiDegisim[i] = sayiDizisiDegisim[i] - ort;        //her bir elemandan ortalamayı çıkarıp o elemana atandı
            sayiDizisiDegisim[i] = sayiDizisiDegisim[i] * sayiDizisiDegisim[i];       //sonucun 2 nci kuvveti alındı
        }

        for (i = 0; i < indisDegisim; i++) {
            toplam = toplam + sayiDizisiDegisim[i];    //her bir indisteki elemanlar toplandı
        }
        orneklem = toplam / (indisDegisim - 1);    //toplam eleman sayısının bir eksiğine bölünerek ornekleme atandı
        textViewDegisim.setText("Değişim Katsayısı = " + df.format(Math.sqrt(orneklem) / ort));
        }
        catch (Exception e){}

    }

    public void carpiklikOlcutu(View view) {
        try{
        int i;
        double toplam = 0;
        for (i = 0; i < indisCarpiklik; i++)    //elemanları dışardan alıp hepsini topladık
        {
            toplam = toplam + sayiDizisiCarpiklik[i];
        }
        double ort, carpiklik = 0.0;
        ort = toplam / indisCarpiklik;    //aldığımız sayıların ortalamasını bulduk
        for (i = 0; i < indisCarpiklik; i++) {
            sayiDizisiCarpiklik[i] = sayiDizisiCarpiklik[i] - ort; //her bir elemandan ortalamayı çıkarıp o elemana atandı
            sayiDizisiCarpiklik[i] = sayiDizisiCarpiklik[i] * sayiDizisiCarpiklik[i] * sayiDizisiCarpiklik[i];    //sonucun 3 üncü kuvveti alındı
            carpiklik = carpiklik + sayiDizisiCarpiklik[i];    //sonuç çarpıklığa atandı
        }
        textViewCarpiklik.setText("Çarpıklık Ölçütü = " + df.format(carpiklik / (indisCarpiklik - 1)));
    }
        catch (Exception e){}
    }

    public void basiklikOlcutu(View view) {
        try{
        int i;
        double toplam = 0;
        for (i = 0; i < indisBasiklik; i++)        //for döngüsü ile her bir indise eleman atandı
        {
            toplam = toplam + sayiDizisiBasiklik[i];    //her bir eleman toplanıp toplam a atandı
        }
        double ort, basiklik = 0.0;
        ort = toplam / indisBasiklik;        //elemanların ortalaması bulunudu
        for (i = 0; i < indisBasiklik; i++) {
            sayiDizisiBasiklik[i] = sayiDizisiBasiklik[i] - ort;        //her bir elemandan ortalamayı çıkarıp o elemana atandı
            sayiDizisiBasiklik[i] = sayiDizisiBasiklik[i] * sayiDizisiBasiklik[i] * sayiDizisiBasiklik[i] * sayiDizisiBasiklik[i]; //sonucun 4 üncü kuvveti alındı
            basiklik = basiklik + sayiDizisiBasiklik[i];        //sonuç basıklık ölüçütüne atandı (her eleman için yapılır)
        }
        textViewBasiklik.setText("Basıklık Ölçütü = " + df.format(basiklik / (indisBasiklik - 1)));
    }
        catch (Exception e){}
    }

    public void kucuktenBuyugeSirala(View view) {
        try {
            int i, j;
            int a = 0;
            double sayi;
            textViewKucukB.setText("");
            textViewKucukB.setText("Cevap Aşağıdadır");

            for (i = 0; i < indisKucuktenB - 1; i++)  //dizideki elemanlarý küçükten büyüðe doðru sýralarýz
            {
                for (j = i + 1; j < indisKucuktenB; j++) {
                    if (sayiDizisiKucuktenB[i] > sayiDizisiKucuktenB[j]) {
                        sayi = sayiDizisiKucuktenB[i];
                        sayiDizisiKucuktenB[i] = sayiDizisiKucuktenB[j];
                        sayiDizisiKucuktenB[j] = sayi;
                    }
                }
            }

      /* countDownTimer = new CountDownTimer(10000,500) {
            @Override
            public void onTick(long millisUntilFinished) {
                textViewKucukB.setText(""+sayiDizisiKucuktenB[indisKucuktenB-1]);
                indisKucuktenB--;
            }
            @Override
            public void onFinish() {
            }};*/
            diziGoster.setText("");
            for (i = 0; i < indisKucuktenB; i++) {

                    diziGoster.append(sayiDizisiKucuktenB[i] + " < ");
            }
        }
        catch (Exception e){}
    }

    public void buyuktenKucugeSirala(View view) {
        try {
            int i, j;
            double sayi;
            textViewBuyukK.setText("Cevap Aşağıdadır");
            diziGoster.setText("");


            for (i = 0; i < indisBuyuktenK - 1; i++) {
                for (j = i + 1; j < indisBuyuktenK; j++) {
                    if (sayiDizisiBuyuktenK[i] < sayiDizisiBuyuktenK[j]) {
                        sayi = sayiDizisiBuyuktenK[i];
                        sayiDizisiBuyuktenK[i] = sayiDizisiBuyuktenK[j];
                        sayiDizisiBuyuktenK[j] = sayi;
                    }
                }
            }
            diziGoster.setText("");
            for (i = 0; i < indisBuyuktenK; i++) {
                    diziGoster.append(sayiDizisiBuyuktenK[i] + " > ");
            }
        }
    catch (Exception e){}
    }

    public void kombinasyon(View view) {
        try {
            String kombinasNGirilen = editTextKombinasN.getText().toString();
            n1 = Integer.parseInt(kombinasNGirilen);
            String kombinasRGirilen = editTextKombinasR.getText().toString();

            r1 = Integer.parseInt(kombinasRGirilen);

            kom = faktoriyel(n1) / (faktoriyel(r1) * faktoriyel(n1 - r1));
            textViewKombinas.setText("Kombinasyon = " + kom + "");
        }
        catch (Exception e){}

    }

    public double faktoriyel(int deger) {
        try {
        double faktoriyel = 1;
        for (int i = 1; i <= deger; i++) {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
            }
        catch (Exception e){}

        return 0;
    }

    public void permutasyon(View view){
       try {
           perm = faktoriyel(n2) / faktoriyel(n2 - r2);
           textViewPermutas.setText("Permütasyon = "+ perm);
       }
       catch (Exception e){

       }
    }

    public void clearEditTexts(View view) {
        try {
            indisMod = 0;
            indisMedyan = 0;
            indisAritmatik = 0;
            indisHarmonik = 0;
            indisGeometrik = 0;
            indisStandart = 0;
            indisOrneklem = 0;
            indisDegisim = 0;
            indisCarpiklik = 0;
            indisBasiklik = 0;
            indisKucuktenB = 0;
            textViewKucukB.setTextSize(14);
            indisBuyuktenK = 0;
            textViewBuyukK.setTextSize(14);

            kom = 0;
            kombinasNGirilen = null;
            kombinasRGirilen = null;

            perm = 0;
            permutasNGirilen = null ;
            permutasRGirilen = null ;

            editTextMod.getText().clear();
            editTextMedyan.getText().clear();
            editTextAritmatik.getText().clear();
            editTextHarmonik.getText().clear();
            editTextGeometrik.getText().clear();
            editTextStandart.getText().clear();
            editTextOrneklem.getText().clear();
            editTextDegisim.getText().clear();
            editTextCarpiklik.getText().clear();
            editTextBasiklik.getText().clear();
            editTextKucukB.getText().clear();
            editTextBuyukK.getText().clear();
            editTextKombinasN.getText().clear();
            editTextKombinasR.getText().clear();
            editTextPermutasN.getText().clear();
            editTextPermutasR.getText().clear();

            textViewMod.setText("Mod Listeniz Sıfırlandı");
            textViewMedyan.setText("Medyan Listeniz Sıfırlandı");
            textViewAritmatik.setText("Aritmatik Ortalama Listeniz Sıfırlandı");
            textViewHarmonik.setText("Harmonik Ortalama Listeniz Sıfırlandı");
            textViewGeometrik.setText("Geometrik Ortalama Listeniz Sıfırlandı");
            textViewStandart.setText("Standart Sapma Listeniz Sıfırlandı");
            textViewOrneklem.setText("Orneklem Varyansı Listeniz Sıfırlandı");
            textViewDegisim.setText("Değişim Katsayısı Listeniz Sıfırlandı");
            textViewCarpiklik.setText("Çarpıklık Ölçütü Listeniz Sıfırlandı");
            textViewBasiklik.setText("Basıklık Ölçütü Listeniz Sıfırlandı");
            textViewKucukB.setText("Sıralama Listeniz Sıfırlandı");
            textViewBuyukK.setText("Sıralama Listeniz Sıfırlandı");
            textViewKombinas.setText("Kombinasyon Sıfırlandı");
            textViewPermutas.setText("Permütasyon Sıfırlandı");

            diziGoster.setText("");
            diziGoster2.setText("");
            diziGoster3.setText("");
            diziGoster4.setText("");
            diziGoster5.setText("");
            diziGoster6.setText("");
            diziGoster7.setText("");
            diziGoster8.setText("");
            diziGoster9.setText("");
            diziGoster10.setText("");
            diziGoster11.setText("");
            diziGoster12.setText("");
            diziGoster13.setText("");
            diziGoster14.setText("");


        }
        catch(Exception e){
            textViewMod.setText("HATA OLUSTU");
            textViewMedyan.setText("HATA OLUSTU");
            textViewAritmatik.setText("HATA OLUSTU");
            textViewHarmonik.setText("HATA OLUSTU");
            textViewGeometrik.setText("HATA OLUSTU");
            textViewStandart.setText("SHATA OLUSTU");
            textViewOrneklem.setText("HATA OLUSTU");
            textViewDegisim.setText("HATA OLUSTU");
            textViewCarpiklik.setText("HATA OLUSTU");
            textViewBasiklik.setText("HATA OLUSTU");
            textViewKucukB.setText("HATA OLUSTU");
            textViewBuyukK.setText("HATA OLUSTU");
            textViewKombinas.setText("HATA OLUSTU");
            textViewPermutas.setText("HATA OLUSTU");
            }
    }




}
