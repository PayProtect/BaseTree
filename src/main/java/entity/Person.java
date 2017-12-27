package entity;


import javax.persistence.*;
import java.sql.Date;


/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Person" )
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String gender;

    @Column
    public String primary_name;

    @Column
    public String alternate_names;

    @Column
    public Date death_date;

    @Column
    public Date birth_date;

    @Column
    public EventRef event_ref_list;

    @Column
    public Family parent_family_list;

    @Column
    public MediaRef media_list;

    @Column
    public AddressRef address_list;

    @Column
    public Person person_ref_list;

    @Column
    public String note_list;


    @Column
    public String urls;

    @Column
    public String change;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrimary_name() {
        return primary_name;
    }

    public void setPrimary_name(String primary_name) {
        this.primary_name = primary_name;
    }

    public String getAlternate_names() {
        return alternate_names;
    }

    public void setAlternate_names(String alternate_names) {
        this.alternate_names = alternate_names;
    }

    public Date getDeath_date() {
        return death_date;
    }

    public void setDeath_date(Date death_date) {
        this.death_date = death_date;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public EventRef getEvent_ref_list() {
        return event_ref_list;
    }

    public void setEvent_ref_list(EventRef event_ref_list) {
        this.event_ref_list = event_ref_list;
    }

    public Family getParent_family_list() {
        return parent_family_list;
    }

    public void setParent_family_list(Family parent_family_list) {
        this.parent_family_list = parent_family_list;
    }

    public MediaRef getMedia_list() {
        return media_list;
    }

    public void setMedia_list(MediaRef media_list) {
        this.media_list = media_list;
    }

    public AddressRef getAddress_list() {
        return address_list;
    }

    public void setAddress_list(AddressRef address_list) {
        this.address_list = address_list;
    }

    public Person getPerson_ref_list() {
        return person_ref_list;
    }

    public void setPerson_ref_list(Person person_ref_list) {
        this.person_ref_list = person_ref_list;
    }

    public String getNote_list() {
        return note_list;
    }

    public void setNote_list(String note_list) {
        this.note_list = note_list;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

}
