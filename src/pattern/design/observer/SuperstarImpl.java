package pattern.design.observer;

import java.util.ArrayList;

/**
 * Created by ykhdzr on 1/21/16.
 */
public class SuperstarImpl implements Superstar {

    private ArrayList<Fans> fansList;

    private String name, gender, status, location, mood;

    public SuperstarImpl(String name, String gender) {
        fansList = new ArrayList<>();
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void registerFans(Fans fans) {
        fansList.add(fans);
    }

    @Override
    public void removeFans(Fans fans) {
        if (fansList.contains(fans)) {
            fansList.remove(fans);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("Superstar");
        System.out.println("================");
        System.out.println("Hello guys! yeah yeah calm down " + name + " is back!, y'all must be wait for my updates, here it is");
        System.out.println("recently update : " + status + " and I'm in " + location + " now, and feel so " + mood);
        System.out.println();
        fansList.forEach(fans -> fans.update(status, location, mood));
    }

    public void setSuperstarUpdates(String status, String location, String mood) {
        this.status = status;
        this.location = location;
        this.mood = mood;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
