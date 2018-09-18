package entity.impl;

import entity.BaseEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class Family implements BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;


    @ManyToOne
    @JoinColumn
    public Family family_ref;


    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    @OneToMany(targetEntity=MediaRef.class, mappedBy="media_ref")
    public Set<MediaRef> media_ref;

    @Column
    public String change;

    @OneToMany(targetEntity=Person.class, mappedBy="handle")
    public  Set<Person> father_handle;

    @OneToMany(targetEntity=Person.class, mappedBy="handle")
    public  Set<Person> mother_handle;

    @OneToMany(targetEntity=ChildRef.class, mappedBy="person_ref")
    public Set<ChildRef> child_ref_list;

    @OneToMany(targetEntity=EventRef.class, mappedBy="event_ref_list")
    public Set<EventRef> event_ref_list;

    public Set<EventRef> getEvent_ref_list() {
        return event_ref_list;
    }

    public void setEvent_ref_list(Set<EventRef> event_ref_list) {
        this.event_ref_list = event_ref_list;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Set<Person> getFather_handle() {
        return father_handle;
    }

    public void setFather_handle(Set<Person> father_handle) {
        this.father_handle = father_handle;
    }

    public Set<Person> getMother_handle() {
        return mother_handle;
    }

    public void setMother_handle(Set<Person> mother_handle) {
        this.mother_handle = mother_handle;
    }

    public Set<ChildRef> getChild_ref_list() {
        return child_ref_list;
    }

    public void setChild_ref_list(Set<ChildRef> child_ref_list) {
        this.child_ref_list = child_ref_list;
    }




}
