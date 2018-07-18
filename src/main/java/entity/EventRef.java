package entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class EventRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @OneToMany(targetEntity=Event.class, mappedBy="event_ref")
    public Set<Event> event_ref_list;


    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Set<Event> getEvent_ref_list() {
        return event_ref_list;
    }

    public void setEvent_ref_list(Set<Event> event_ref_list) {
        this.event_ref_list = event_ref_list;
    }

    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }

}
