package sample;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String lastName;
    private String birthday;
    private String adress;
    private String city;
    private String state;
    private String country;
    private String career;
    private String lastJob;
    private String allJobs;
    private String phone;
    private String mobile;
    private String email;
    private Image profilePic;
    private String id;
    private double progress;
    private String requestJob;

    public static List<Person> listPerson = new ArrayList<>();

    public Person() {
    }

    public Person(String name, String lastName, String birthday, String adress, String city, String state, String country, String career, String phone, String mobile, String email, Image profilePic, String id, double progress, String requestJob) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.career = career;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.profilePic = profilePic;
        this.id = id;
        this.progress = progress;
        this.requestJob = requestJob;
    }

    public Person(String name, String lastName, String birthday, String adress, String city, String state, String country, String career, String requestJob, Image profilePic, String id, double progress) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.career = career;
        this.lastJob = "";
        this.allJobs = "";
        this.profilePic = profilePic;
        this.id = id;
        this.progress = progress;
    }

    public static List<Person> getListPerson() {
        return listPerson;
    }

    public static void addPerson(Person person) {
        listPerson.add(person);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequestJob() {
        return requestJob;
    }

    public void setRequestJob(String requestJob) {
        this.requestJob = requestJob;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }

    public String getAllJobs() {
        return allJobs;
    }

    public void setAllJobs(String allJobs) {
        this.allJobs = allJobs;
    }

    public Image getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Image profilePic) {
        this.profilePic = profilePic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", career='" + career + '\'' +
                ", lastJob='" + lastJob + '\'' +
                '}';
    }
}
