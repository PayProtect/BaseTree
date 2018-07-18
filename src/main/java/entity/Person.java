package entity;


import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @ManyToOne
    @JoinColumn
    public Person handle;

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

    @OneToMany(targetEntity=EventRef.class, mappedBy="event_ref_list")
    public Set<EventRef> event_ref_list;

    @OneToMany(targetEntity=Family.class, mappedBy="family_ref")
    public Set<Family> parent_family_list;

    @OneToMany(targetEntity=MediaRef.class, mappedBy="media_ref")
    public Set<MediaRef> media_ref;

    @OneToMany(targetEntity=AddressRef.class, mappedBy="address_list")
    public Set<AddressRef> address_list;

    /*@OneToMany(targetEntity=Person.class, mappedBy="person_ref_list")
    public Set<Person> person_ref_list; I have lost idea, have to review ideas*/

    @OneToMany(targetEntity=NoteRef.class, mappedBy="media_ref")
    public Set<NoteRef> note_list;


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

    public Set<EventRef> getEvent_ref_list() {
        return event_ref_list;
    }

    public void setEvent_ref_list(Set<EventRef> event_ref_list) {
        this.event_ref_list = event_ref_list;
    }

    public Set<Family> getParent_family_list() {
        return parent_family_list;
    }

    public void setParent_family_list(Set<Family> parent_family_list) {
        this.parent_family_list = parent_family_list;
    }

    public Set<MediaRef> getMedia_ref() {
        return media_ref;
    }

    public void setMedia_ref(Set<MediaRef> media_ref) {
        this.media_ref = media_ref;
    }

    public Set<AddressRef> getAddress_list() {
        return address_list;
    }

    public void setAddress_list(Set<AddressRef> address_list) {
        this.address_list = address_list;
    }


    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
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
