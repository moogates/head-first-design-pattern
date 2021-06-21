package me.muyuwei.hfdp.dynamicproxy;

public class PersonBeanImpl implements PersonBean {
    private String name;
    private String gender;
    private String interests;

    int rating;
    int ratingCount = 0;

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
    public int getHotOrNotRating() {
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
    public void setHotOrNotRating(int rating) {
        ++this.ratingCount;
        this.rating += rating;
    }
}
