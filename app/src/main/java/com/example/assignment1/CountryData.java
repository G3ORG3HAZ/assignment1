package com.example.assignment1;

public class CountryData {
    private static final Country[] MOCKUP_DATA = {
            new Country("Algeria", R.drawable.algeria),
            new Country("Egypt", R.drawable.egypt),
            new Country("Iraq", R.drawable.iraq),
            new Country("Jordan", R.drawable.jordan),
            new Country("Kuwait", R.drawable.kuwait),
            new Country("Lebanon", R.drawable.lebanon),
            new Country("Morocco", R.drawable.morocco),
            new Country("Palestine", R.drawable.palestine),
            new Country("Qatar", R.drawable.qatar),
            new Country("Saudi Arabia", R.drawable.saudi),
            new Country("Syria", R.drawable.syria),
            new Country("Tunis", R.drawable.tunis),
    };

    public static Country[] getMockupData() {
        return MOCKUP_DATA;
    }



    public static String choices [][] = {
            {"Algeria", "Egypt", "Iraq", "Jordan"},
            {"Tunis","Iraq","Egypt","Lebanon"},
            {"Tunis","Egypt","Palestine","Iraq"},
            {"Morocco","Iraq","Jordan","Lebanon"},
            {"Saudi Arabia","Syria","Kuwait","Tunis"},
            {"Tunis","Iraq","Egypt","Lebanon"},
            {"Algeria","Morocco","Egypt","Lebanon"},
            {"Palestine","Iraq","Tunis","Lebanon"},
            {"Qatar","Kuwait","Algeria","Egypt"},
            {"Lebanon","Jordan","Saudi Arabia","Palestine"},
            {"Syria","Qatar","Palestine","Jordan"},
            {"Tunis","Syria","Iraq","Lebanon"}
    };

    public static String correctAnswers [] = {
            "Algeria",
            "Egypt",
            "Iraq",
            "Jordan",
            "Kuwait",
            "Lebanon",
            "Morocco",
            "Palestine",
            "Qatar",
            "Saudi Arabia",
            "Syria",
            "Tunis"
    };






}
