package com.careerdevs.hellointernet.models;

public class ApodModel {

//             "date": "2022-08-14",
//            "explanation": "Over 4000 planets are now known to exist outside our Solar System. Known as exoplanets, this milestone was passed last month, as recorded by NASA's Exoplanet Archive. The featured video highlights these exoplanets in sound and light, starting chronologically from the first confirmed detection in 1992 and continuing into 2019.  The entire night sky is first shown compressed with the central band of our Milky Way Galaxy making a giant U.  Exoplanets detected by slight jiggles in their parents-star's colors (radial velocity) appear in pink, while those detected by slight dips in their parent star's brightness (transit) are shown in purple. Further, those exoplanets imaged directly appear in orange, while those detected by gravitationally magnifying the light of a background star (microlensing) are shown in green.  The faster a planet orbits its parent star, the higher the accompanying tone played. The retired Kepler satellite has discovered about half of these first 4000 exoplanets in just one region of the sky, while the TESS mission is on track to find even more, all over the sky, orbiting the brightest nearby stars.  Finding exoplanets not only helps humanity to better understand the potential prevalence of life elsewhere in the universe, but also how our Earth and Solar System were formed.",
//            "media_type": "video",
//            "service_version": "v1",
//            "title": "4000 Exoplanets",
//            "url": "https://www.youtube.com/embed/aiFD_LBx2nM?rel=0"

    private String date;
    private String explanation;
    private String media_type;
    private String title;
    private String url;

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getMedia_type() {
        return media_type;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
