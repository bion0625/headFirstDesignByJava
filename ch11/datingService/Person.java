package ch11.datingService;

public interface Person {

    String getName();
    String getGender();
    String getInterests();
    int getGreekRating();


    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGreekRating(int rating);
}
