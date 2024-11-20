package ch11.datingService;

public class PersonImpl implements Person{

    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = 0;
        this.ratingCount = 0;
    }

    public PersonImpl(String name, String gender, String interests, int rating) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;
        this.ratingCount = 1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getGreekRating() {
        if (ratingCount == 0) return 0;
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setGreekRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
