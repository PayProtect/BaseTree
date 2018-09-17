package entity.impl;

import entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */
@Entity
@Table
public class AddressRef implements BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @OneToOne
    @JoinColumn
    public  AddressRef address_list;

    @Column
    public Date date;

    @OneToMany(targetEntity = Location.class, mappedBy = "location")
    public Set<Location> location;

    @OneToMany(targetEntity = NoteRef.class, mappedBy = "note_list")
    public Set<NoteRef> note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }

    public Set<Location> getLocation() {
        return location;
    }

    public void setLocation(Set<Location> location) {
        this.location = location;
    }
}

