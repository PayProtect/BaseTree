package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @ManyToOne
    @JoinColumn
    public  Event event_ref;

    @Column
    public  String type;

    @Column
    public Date date;

    @Column
    public String description;


    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    @OneToMany(targetEntity=MediaRef.class, mappedBy="media_ref")
    public Set<MediaRef> media_ref;

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

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }


    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }

    public Set<MediaRef> getMedia_ref() {
        return media_ref;
    }

    public void setMedia_ref(Set<MediaRef> media_ref) {
        this.media_ref = media_ref;
    }
}
