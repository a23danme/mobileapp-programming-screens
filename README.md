
# Rapport
Skapade en till activity genom klicka app>New>activity. Fick problem med gradle men
la till i gradle.build och det funkade då. Gjorde en Button som sedan med hjälp av
clicklistener och startactivity kunde starta den nya activityn. La sedan till Intent med data som
name och age. Dessa visades sedan genom att jag skapade en TextView som displayade datan.

```
I gradle.build
    implementation 'com.google.android.material:material:1.1.0'
    implementation 'androidx.activity:activity:1.1.0'
    
   I MainActivity2 (nya activityn) 
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView TextviewForNameAndAge =findViewById(R.id.TextviewForNameAndAge);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int age = extras.getInt("age");

            String displayText = "Name: " + name + "\nAge: " + age;
            TextviewForNameAndAge.setText(displayText);
        }
    }
    
   I Main.Acitvity
           Button startMainActivity2= findViewById(R.id.button);
        startMainActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SecondActivity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", "Daniel"); // Optional
                intent.putExtra("age", 24);  // Optional
                startActivity(intent);
            }
        });
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
