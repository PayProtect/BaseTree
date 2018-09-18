package entity.impl;

import entity.BaseEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table
public class MediaRef implements BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @ManyToOne
    @JoinColumn
    public MediaRef media_ref;

    @OneToMany(targetEntity=NoteRef.class, mappedBy="note_list")
    public Set<NoteRef> note_list;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public MediaRef getMedia_ref() {
        return media_ref;
    }

    public void setMedia_ref(MediaRef media_ref) {
        this.media_ref = media_ref;
    }

    public Set<NoteRef> getNote_list() {
        return note_list;
    }

    public void setNote_list(Set<NoteRef> note_list) {
        this.note_list = note_list;
    }

}
