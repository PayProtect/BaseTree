package entity;

import javax.persistence.*;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table( name = "Family" )
public class Family {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;


    @Column
    public NoteRef note_list;

    @Column
     public MediaRef media_list;

    @Column
    public String change;

    @Column
    public  Person father_handle;

    @Column
    public  Person mother_handle;

    @Column
    public ChildRef child_ref_list;

    @Column
    public EventRef event_ref_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public Person getFather_handle() {
        return father_handle;
    }

    public void setFather_handle(Person father_handle) {
        this.father_handle = father_handle;
    }

    public Person getMother_handle() {
        return mother_handle;
    }

    public void setMother_handle(Person mother_handle) {
        this.mother_handle = mother_handle;
    }

    public ChildRef getChild_ref_list() {
        return child_ref_list;
    }

    public void setChild_ref_list(ChildRef child_ref_list) {
        this.child_ref_list = child_ref_list;
    }

    public EventRef getEvent_ref_list() {
        return event_ref_list;
    }

    public void setEvent_ref_list(EventRef event_ref_list) {
        this.event_ref_list = event_ref_list;
    }
}
