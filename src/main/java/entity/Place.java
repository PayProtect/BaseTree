package entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String  title;

    @OneToOne
    @JoinColumn
    public Place place_ref;

    @Column
    public  String name;

    @Column
    public String alt_names;

    @Column
    public String place_type;

    @Column
    public String code;

    @OneToMany(targetEntity=MediaRef.class, mappedBy="media_ref")
    public Set<MediaRef> media_ref;

    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    @Column
    public String change;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Place getPlace_ref() {
        return place_ref;
    }

    public void setPlace_ref(Place place_ref) {
        this.place_ref = place_ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlt_names() {
        return alt_names;
    }

    public void setAlt_names(String alt_names) {
        this.alt_names = alt_names;
    }

    public String getPlace_type() {
        return place_type;
    }

    public void setPlace_type(String place_type) {
        this.place_type = place_type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<MediaRef> getMedia_ref() {
        return media_ref;
    }

    public void setMedia_ref(Set<MediaRef> media_ref) {
        this.media_ref = media_ref;
    }

    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }




}
