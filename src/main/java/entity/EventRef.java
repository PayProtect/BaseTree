package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "EventRef" )
public class EventRef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public Event event_ref_list;

    @Column
    public NoteRef note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Event getEvent_ref_list() {
        return event_ref_list;
    }

    public void setEvent_ref_list(Event event_ref_list) {
        this.event_ref_list = event_ref_list;
    }

    public NoteRef getNote_list() {
        return note_list;
    }

    public void setNote_list(NoteRef note_list) {
        this.note_list = note_list;
    }
}
