package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Event" )
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public  String type;

    @Column
    public Date date;

    @Column
    public String description;

    @Column
    public NoteRef note_list;

    @Column
    public MediaRef media_list;

    @Column
    public String change;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }

    public MediaRef getMedia_list() {
        return media_list;
    }

    public void setMedia_list(MediaRef media_list) {
        this.media_list = media_list;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }
}
