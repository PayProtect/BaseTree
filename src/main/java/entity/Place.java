package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Place" )
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String  title;

    @Column
    public Place place_ref_list;

    @Column
    public  String name;

    @Column
    public String alt_names;

    @Column
    public String place_type;

    @Column
    public String code;

    @Column
    public MediaRef media_list;

    @Column
    public  NoteRef note_list;

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

    public Place getPlace_ref_list() {
        return place_ref_list;
    }

    public void setPlace_ref_list(Place place_ref_list) {
        this.place_ref_list = place_ref_list;
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

    public MediaRef getMedia_list() {
        return media_list;
    }

    public void setMedia_list(MediaRef media_list) {
        this.media_list = media_list;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }
}
